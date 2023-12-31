package su.hostile.whisper.model.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Collection;


/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 20:54
 * E-mail: voloshin.developer@gmail.com
 */
@Entity
@Table(schema = "public", name = "wh_messages")
@Getter
@Setter
@RequiredArgsConstructor
@SuperBuilder
public class MessageEntity extends AbstractEntity implements Serializable {

    @NotNull
    @Column(name = "message", nullable = false)
    private String message;

    @NotNull
    @Column(name = "sign", nullable = false)
    private String sign;

    @Nullable
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private MessageEntity parentId;

    @Nullable
    @OneToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            mappedBy = "parentId")
    private Collection<MessageEntity> comments;
}
