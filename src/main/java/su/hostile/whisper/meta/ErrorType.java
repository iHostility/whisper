package su.hostile.whisper.meta;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 18:13
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
