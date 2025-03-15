package su.hostile.whisper.repository;

import jakarta.validation.constraints.NotNull;
import su.hostile.whisper.model.entity.ClientEntity;
import su.hostile.whisper.repository.common.CommonRepository;

import java.util.Optional;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 03:18
 * E-mail: voloshin.developer@gmail.com
 */
public interface ClientRepository extends CommonRepository<ClientEntity> {

    Optional<ClientEntity> findByClientId(@NotNull final String clientId);
}
