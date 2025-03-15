package su.hostile.whisper.mapper;

import jakarta.validation.constraints.NotNull;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import su.hostile.whisper.mapper.annotations.ToEntityMapping;
import su.hostile.whisper.model.dto.message.AddMessageRequest;
import su.hostile.whisper.model.dto.message.MessagesResponse;
import su.hostile.whisper.model.entity.MessageEntity;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.HashSet;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 01:19
 * E-mail: voloshin.developer@gmail.com
 */
@Mapper(
        config = MainMapperConfig.class,
        uses = BaseMapper.class)
public interface MessageMapper {

    @NotNull
    @ToEntityMapping
    @Mapping(target = "parentId", ignore = true)
    @Mapping(target = "comments", ignore = true)
    MessageEntity toMessageEntity(@NotNull final AddMessageRequest addMessageRequest);

    @NotNull
    MessagesResponse toMessagesResponse(@NotNull final MessageEntity messageEntity);

    @NotNull
    HashSet<MessagesResponse> toCollectionOfMessageResponse(@NotNull final Collection<MessageEntity> messageEntities);

    default ZonedDateTime toZonedDateTime(@NotNull final Instant instant) {

        if (instant == null) return null;
        return ZonedDateTime.ofInstant(instant, ZoneId.of("Europe/Moscow"));
    }
}
