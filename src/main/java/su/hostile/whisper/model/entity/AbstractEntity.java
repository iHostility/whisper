package su.hostile.whisper.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 18:13
 * E-mail: voloshin.developer@gmail.com
 */

/**
 * Абстрактная сущность.
 */
@Getter
@Setter
@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(doNotUseGetters = true, onlyExplicitlyIncluded = true)
public class AbstractEntity implements Serializable {

    /**
     * Идентификатор.
     */
    @Id
    @GeneratedValue
    @Column(name = "id")
    @EqualsAndHashCode.Include
    private UUID id;
}
