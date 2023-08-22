package su.hostile.whisper.service.common;

import jakarta.validation.constraints.NotNull;
import su.hostile.whisper.exception.EntityNotFoundException;
import su.hostile.whisper.model.entity.AbstractEntity;
import su.hostile.whisper.repository.common.CommonRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static su.hostile.whisper.meta.ErrorType.ENTITY_NOT_FOUND;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 18:13
 * E-mail: voloshin.developer@gmail.com
 */
public abstract class AbstractService<E extends AbstractEntity, R extends CommonRepository<E>>
        implements CommonService<E> {

    private final R repository;

    protected AbstractService(final R repository) {

        this.repository = repository;
    }

    @NotNull
    @Override
    public Optional<E> save(@NotNull final E entity) {

        return Optional.of(repository.save(entity));
    }

    @NotNull
    @Override
    public List<E> saveAll(@NotNull final List<E> entities) {

        return repository.saveAll(entities);
    }

    @NotNull
    @Override
    public Optional<E> update(@NotNull final E entity) {

        return Optional.of(repository.save(entity));
    }

    @NotNull
    @Override
    public Optional<E> get(@NotNull final UUID id) {

        return repository.findById(id);
    }

    @NotNull
    @Override
    public List<E> getAll() {

        return repository.findAll();
    }

    @NotNull
    @Override
    public Boolean deleteById(@NotNull final UUID id) {

        E entity = get(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format(String.valueOf(ENTITY_NOT_FOUND), id)));
        repository.delete(entity);
        return repository.findById(entity.getId()).isEmpty();
    }

    @NotNull
    @Override
    public Boolean deleteAll() {

        repository.deleteAll();
        return repository.findAll().isEmpty();
    }
}
