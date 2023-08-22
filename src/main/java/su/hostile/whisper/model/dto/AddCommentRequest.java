package su.hostile.whisper.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 21:14
 * E-mail: voloshin.developer@gmail.com
 */
@Getter
@Setter
@NoArgsConstructor
public class AddCommentRequest extends AddMessageRequest implements Serializable {

    private UUID parentId;
}
