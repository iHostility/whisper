package su.hostile.whisper.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Set;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 03:19
 * E-mail: voloshin.developer@gmail.com
 */
@Entity
@Table(schema = "public", name = "wh_client")
@Getter
@Setter
@RequiredArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientEntity extends AbstractEntity implements Serializable {

    @Column(name = "client_id", nullable = false, unique = true)
    String clientId;
    @Column(name = "client_login", nullable = false)
    String clientLogin;

    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    Set<CampaignClientEntity> statuses;
}
