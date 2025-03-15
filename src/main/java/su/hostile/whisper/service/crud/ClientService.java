package su.hostile.whisper.service.crud;

import lombok.NonNull;
import su.hostile.whisper.model.bo.ClientBo;
import su.hostile.whisper.model.entity.ClientEntity;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 00:31
 * E-mail: voloshin.developer@gmail.com
 */
public interface ClientService {
    @NonNull
    ClientEntity createUpdate(@NonNull ClientBo clientBo);
}
