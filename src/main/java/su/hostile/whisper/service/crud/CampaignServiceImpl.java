package su.hostile.whisper.service.crud;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import su.hostile.whisper.mapper.CampaignMapper;
import su.hostile.whisper.model.bo.CampaignBo;
import su.hostile.whisper.model.entity.CampaignEntity;
import su.hostile.whisper.repository.CampaignRepository;
import su.hostile.whisper.service.common.AbstractService;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 01:48
 * E-mail: voloshin.developer@gmail.com
 */
@Slf4j
@Service
public class CampaignServiceImpl
        extends AbstractService<CampaignEntity, CampaignRepository>
        implements CampaignService {

    private final CampaignMapper campaignMapper;

    public CampaignServiceImpl(CampaignRepository repository, CampaignMapper campaignMapper) {
        super(repository);
        this.campaignMapper = campaignMapper;
    }

    @Override
    public @NonNull CampaignEntity createUpdate(@NonNull final CampaignBo campaignBo) {

        final CampaignEntity incomingCampaignEntity = campaignMapper.toCampaignEntity(campaignBo);
        final CampaignEntity foundCampaignEntity = getRepository().findByCampaignId(campaignBo.getCampaignId())
                .orElse(incomingCampaignEntity);
        if (incomingCampaignEntity != foundCampaignEntity) {
            campaignMapper.updateCampaign(foundCampaignEntity, incomingCampaignEntity);
        }
        return getRepository().save(foundCampaignEntity);
    }
}
