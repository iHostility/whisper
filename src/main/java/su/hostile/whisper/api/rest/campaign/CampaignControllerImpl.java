package su.hostile.whisper.api.rest.campaign;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import su.hostile.whisper.mapper.CampaignMapper;
import su.hostile.whisper.model.dto.campaign.CreateCampaignRequest;
import su.hostile.whisper.service.crud.CampaignService;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 01:50
 * E-mail: voloshin.developer@gmail.com
 */
@RestController
@RequestMapping("api/v1/campaign")
@RequiredArgsConstructor
public class CampaignControllerImpl implements CampaignController {

    @NonNull
    private final CampaignMapper campaignMapper;
    @NonNull
    private final CampaignService campaignService;

    @Override
    public ResponseEntity<Void> createCampaign(@RequestBody CreateCampaignRequest createCampaignRequest) {
        campaignService.createUpdate(campaignMapper.toCampaignBo(createCampaignRequest));
        return ResponseEntity.ok().build();
    }
}
