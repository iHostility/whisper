package su.hostile.whisper.model.bo;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/*
 * Author: Voloshin Denis
 * Date: 14-03-2025
 * Time: 23:44
 * E-mail: voloshin.developer@gmail.com
 */
@Valid
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CampaignBo {
    @NotNull
    String campaignId;
    @NotNull
    String campaignName;
}
