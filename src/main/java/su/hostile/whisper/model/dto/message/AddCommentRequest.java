package su.hostile.whisper.model.dto.message;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
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
public class AddCommentRequest extends AddMessageRequest implements Serializable {

    private UUID parentId;
}
