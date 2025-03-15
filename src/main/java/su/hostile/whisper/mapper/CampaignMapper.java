package su.hostile.whisper.mapper;

import jakarta.validation.constraints.NotNull;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import su.hostile.whisper.mapper.annotations.ToEntityMapping;
import su.hostile.whisper.model.bo.CampaignBo;
import su.hostile.whisper.model.dto.campaign.CreateCampaignRequest;
import su.hostile.whisper.model.entity.CampaignEntity;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 01:49
 * E-mail: voloshin.developer@gmail.com
 */
@Mapper(
        config = MainMapperConfig.class,
        uses = BaseMapper.class)
public interface CampaignMapper {

    @NotNull
    CampaignBo toCampaignBo(@NotNull final CreateCampaignRequest createCampaignRequest);

    @NotNull
    @ToEntityMapping
    @Mapping(target = "statuses", ignore = true)
    CampaignEntity toCampaignEntity(@NotNull final CampaignBo campaignBo);

    @NotNull
    @ToEntityMapping
    @Mapping(target = "campaignId", ignore = true)
    void updateCampaign(@MappingTarget @NotNull final CampaignEntity targetCampaignEntity,
                        @NotNull final CampaignEntity sourceCampaignEntity);
}
