package su.hostile.whisper.model.dto.message;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.Set;
import java.util.UUID;

/*
 * Author: Voloshin Denis
 * Date: 14-03-2025
 * Time: 23:44
 * E-mail: voloshin.developer@gmail.com
 */
@Getter
@Setter
@NoArgsConstructor
public class MessagesResponse {

    @NotNull
    private UUID id;
    @NotNull
    private String message;
    @NotNull
    private String sign;
    @NotNull
    private ZonedDateTime created;
    @Nullable
    private ZonedDateTime changed;
    @Nullable
    private Set<MessagesResponse> comments;
}
