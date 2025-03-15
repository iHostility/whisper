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
 * Date: 15-03-2025
 * Time: 01:57
 * E-mail: voloshin.developer@gmail.com
 */
@Valid
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientBo {
    @NotNull
    String clientId;
    @NotNull
    String clientLogin;
    @NotNull
    String campaignId;
}
