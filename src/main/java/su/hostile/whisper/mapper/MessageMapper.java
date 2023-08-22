package su.hostile.whisper.mapper;

import jakarta.validation.constraints.NotNull;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import su.hostile.whisper.model.dto.AddMessageRequest;
import su.hostile.whisper.model.dto.MessagesResponse;
import su.hostile.whisper.model.entity.MessageEntity;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.HashSet;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 21:16
 * E-mail: voloshin.developer@gmail.com
 */
@Mapper(componentModel = "spring",
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MessageMapper {

    @NotNull
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
