package su.hostile.whisper.mapper.annotations;

import org.mapstruct.Mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 01:12
 * E-mail: voloshin.developer@gmail.com
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@Mapping(target = "id", ignore = true)
@Mapping(target = "created", ignore = true)
@Mapping(target = "changed", ignore = true)
@Mapping(target = "version", ignore = true)
public @interface ToEntityMapping {
}
