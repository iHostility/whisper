package su.hostile.whisper.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 21:10
 * E-mail: voloshin.developer@gmail.com
 */
@Getter
@Setter
@NoArgsConstructor
public class AddMessageRequest implements Serializable {

    @NotNull
    @NotBlank(message = "Message cannot be null or blank")
    private String message;

    @NotNull
    @NotBlank(message = "Sign cannot be null or blank")
    private String sign;
}
