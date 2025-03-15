package su.hostile.whisper.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import su.hostile.whisper.model.CampaignClientStatus;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 03:51
 * E-mail: voloshin.developer@gmail.com
 */
@Getter
@Setter
@Entity
@Table(schema = "public", name = "wh_campaign_client")
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CampaignClientEntity {

    @EmbeddedId
    private CampaignClientPk id;

    @CreationTimestamp
    @Column(name = "created", columnDefinition = "timestamptz", nullable = false, updatable = false)
    private Instant created = Instant.now();

    @UpdateTimestamp
    @Column(name = "changed", columnDefinition = "timestamptz")
    private Instant changed;

    @Version
    private int version;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("campaignId")
    @JoinColumn(name = "campaign_id")
    private CampaignEntity campaign;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("clientId")
    @JoinColumn(name = "client_id")
    private ClientEntity client;

    CampaignClientStatus status;

    public CampaignClientEntity(CampaignClientPk id, CampaignEntity campaign, ClientEntity client, CampaignClientStatus status) {
        this.id = id;
        this.campaign = campaign;
        this.client = client;
        this.status = status;
    }


    /*
     * Author: Voloshin Denis
     * Date: 15-03-2025
     * Time: 02:12
     * E-mail: voloshin.developer@gmail.com
     */
    @Getter
    @Setter
    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
    public static class CampaignClientPk implements Serializable {

        @EqualsAndHashCode.Include
        @Column(name = "campaign_id")
        private UUID campaignId;
        @Column(name = "client_id")
        @EqualsAndHashCode.Include
        private UUID clientId;
    }
}
