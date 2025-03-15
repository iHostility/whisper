package su.hostile.whisper.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
 * Time: 01:33
 * E-mail: voloshin.developer@gmail.com
 */
@Entity
@Table(schema = "public", name = "wh_campaign")
@Getter
@Setter
@RequiredArgsConstructor
@SuperBuilder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CampaignEntity extends AbstractEntity implements Serializable {

    @Column(name = "campaign_id", nullable = false, unique = true)
    String campaignId;
    @Column(name = "campaign_name", nullable = false)
    String campaignName;

    @OneToMany(mappedBy = "campaign")
    Set<CampaignClientEntity> statuses;
}
