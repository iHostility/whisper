package su.hostile.whisper.mapper;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;

/*
 * Author: Voloshin Denis
 * Date: 14-03-2025
 * Time: 23:54
 * E-mail: voloshin.developer@gmail.com
 */
@MapperConfig(
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        collectionMappingStrategy = CollectionMappingStrategy.ACCESSOR_ONLY,
        componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface MainMapperConfig {
}
