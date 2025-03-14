package su.hostile.whisper.meta;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/*
 * Author: Voloshin Denis
 * Date: 14-03-2025
 * Time: 22:31
 * E-mail: voloshin.developer@gmail.com
 */
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorType {

    ENTITY_NOT_FOUND("Entity not found by id: %s"),
    ENTITY_NOT_SAVED("Entity not saved: %s"),
    ENTITY_NOT_UPDATED("Entity not updated by id: %s");

    private final String description;
}
