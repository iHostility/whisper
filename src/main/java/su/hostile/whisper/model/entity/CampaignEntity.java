package su.hostile.whisper.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/*
 * Author: Voloshin Denis
 * Date: 14-03-2025
 * Time: 22:31
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
}
