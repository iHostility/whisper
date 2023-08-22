package su.hostile.whisper.service.common;

import jakarta.validation.constraints.NotNull;
import su.hostile.whisper.model.entity.AbstractEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 18:13
 * E-mail: voloshin.developer@gmail.com
 */
public interface CommonService<E extends AbstractEntity> {

    @NotNull
    Optional<E> save(@NotNull E entity);

    @NotNull
    List<E> saveAll(@NotNull List<E> entities);

    @NotNull
    Optional<E> update(@NotNull E entity);

    @NotNull
    Optional<E> get(@NotNull UUID id);

    @NotNull
    List<E> getAll();

    @NotNull
    Boolean deleteById(@NotNull UUID id);

    @NotNull
    Boolean deleteAll();

}
