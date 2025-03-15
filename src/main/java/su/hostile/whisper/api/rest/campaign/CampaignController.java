package su.hostile.whisper.api.rest.campaign;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import su.hostile.whisper.model.dto.campaign.CreateCampaignRequest;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 01:30
 * E-mail: voloshin.developer@gmail.com
 */
public interface CampaignController {

    @PostMapping
    ResponseEntity<Void> createCampaign(@RequestBody @NotNull @Valid final CreateCampaignRequest createCampaignRequest);
}
