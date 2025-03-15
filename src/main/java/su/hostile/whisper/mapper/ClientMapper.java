package su.hostile.whisper.mapper;

import jakarta.validation.constraints.NotNull;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import su.hostile.whisper.mapper.annotations.ToEntityMapping;
import su.hostile.whisper.model.bo.ClientBo;
import su.hostile.whisper.model.dto.client.CreateClientRequest;
import su.hostile.whisper.model.entity.ClientEntity;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 02:04
 * E-mail: voloshin.developer@gmail.com
 */
@Mapper(
        config = MainMapperConfig.class,
        uses = BaseMapper.class)
public interface ClientMapper {

    @NotNull
    ClientBo toClientBo(@NotNull final CreateClientRequest createClientRequest);

    @NotNull
    @ToEntityMapping
    @Mapping(target = "statuses", ignore = true)
    ClientEntity toClientEntity(@NotNull final ClientBo clientBo);

    @NotNull
    @ToEntityMapping
    @Mapping(target = "clientId", ignore = true)
    void updateClient(@MappingTarget @NotNull final ClientEntity targetClientEntity,
                      @NotNull final ClientEntity sourceClientEntity);
}
