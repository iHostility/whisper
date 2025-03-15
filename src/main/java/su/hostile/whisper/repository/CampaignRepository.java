package su.hostile.whisper.repository;

import jakarta.validation.constraints.NotNull;
import su.hostile.whisper.model.entity.CampaignEntity;
import su.hostile.whisper.repository.common.CommonRepository;

import java.util.Optional;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 00:31
 * E-mail: voloshin.developer@gmail.com
 */
public interface CampaignRepository extends CommonRepository<CampaignEntity> {

    @NotNull
    Optional<CampaignEntity> findByCampaignId(@NotNull final String campaignId);
}
