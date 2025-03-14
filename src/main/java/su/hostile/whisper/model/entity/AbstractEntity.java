package su.hostile.whisper.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

/*
 * Author: Voloshin Denis
 * Date: 14-03-2025
 * Time: 22:31
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

    /**
     * Дата и время создания.
     */
    @Setter(AccessLevel.PRIVATE)
    @CreationTimestamp
    @Column(name = "created", columnDefinition = "timestamptz", nullable = false, updatable = false)
    private Instant created = Instant.now();

    /**
     * Дата и время изменения.
     */
    @Setter(AccessLevel.PRIVATE)
    @UpdateTimestamp
    @Column(name = "changed", columnDefinition = "timestamptz")
    private Instant changed;

    /**
     * Версия записи.
     */
    @Setter(AccessLevel.PRIVATE)
    @Version
    private int version;
}
