package su.hostile.whisper.service.crud;

import lombok.NonNull;
import su.hostile.whisper.model.bo.CampaignBo;
import su.hostile.whisper.model.entity.CampaignEntity;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 00:31
 * E-mail: voloshin.developer@gmail.com
 */
public interface CampaignService {

    @NonNull
    CampaignEntity createUpdate(@NonNull CampaignBo campaignBo);
}
