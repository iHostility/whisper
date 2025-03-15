package su.hostile.whisper.service.crud;

import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import su.hostile.whisper.exception.EntityNotFoundException;
import su.hostile.whisper.mapper.ClientMapper;
import su.hostile.whisper.model.CampaignClientStatus;
import su.hostile.whisper.model.bo.ClientBo;
import su.hostile.whisper.model.entity.CampaignClientEntity;
import su.hostile.whisper.model.entity.CampaignEntity;
import su.hostile.whisper.model.entity.ClientEntity;
import su.hostile.whisper.repository.CampaignClientRepository;
import su.hostile.whisper.repository.CampaignRepository;
import su.hostile.whisper.repository.ClientRepository;
import su.hostile.whisper.service.common.AbstractService;

import java.util.Optional;
import java.util.Set;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 04:03
 * E-mail: voloshin.developer@gmail.com
 */
@Slf4j
@Service
public class ClientServiceImpl
        extends AbstractService<ClientEntity, ClientRepository>
        implements ClientService {

    private final ClientMapper clientMapper;
    private final CampaignRepository campaignRepository;
    private final CampaignClientRepository campaignClientRepository;

    public ClientServiceImpl(
            @NotNull final ClientRepository repository,
            @NotNull final CampaignRepository campaignRepository,
            @NotNull final CampaignClientRepository campaignClientRepository,
            @NotNull final ClientMapper clientMapper) {
        super(repository);
        this.campaignRepository = campaignRepository;
        this.clientMapper = clientMapper;
        this.campaignClientRepository = campaignClientRepository;
    }

    @NonNull
    @Override
    @Transactional
    public ClientEntity createUpdate(@NonNull final ClientBo clientBo) {

        final ClientEntity incomingClientEntity = clientMapper.toClientEntity(clientBo);
        final ClientEntity foundClientEntity = getRepository().findByClientId(clientBo.getClientId())
                .orElse(incomingClientEntity);
        if (incomingClientEntity != foundClientEntity) {
            clientMapper.updateClient(foundClientEntity, incomingClientEntity);
        }
        final Optional<CampaignEntity> foundCampaignEntity = campaignRepository.findByCampaignId(clientBo.getCampaignId());
        if (foundCampaignEntity.isEmpty()) {
            throw new EntityNotFoundException(String.format("Campaign with id: %s is not found!", clientBo.getCampaignId()));
        }
        final CampaignEntity presentCampaignEntity = foundCampaignEntity.get();
        final ClientEntity savedClientEntity = getRepository().save(foundClientEntity);

        final CampaignClientEntity.CampaignClientPk campaignClientPk = new CampaignClientEntity.CampaignClientPk(
                presentCampaignEntity.getId(), savedClientEntity.getId());
        final CampaignClientEntity campaignClientEntity = new CampaignClientEntity(
                campaignClientPk, foundCampaignEntity.get(), savedClientEntity, CampaignClientStatus.INFORMED);
        campaignClientRepository.save(campaignClientEntity);
        return savedClientEntity;
    }
}
