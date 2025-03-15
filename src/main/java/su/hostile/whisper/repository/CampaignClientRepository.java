package su.hostile.whisper.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import su.hostile.whisper.model.entity.CampaignClientEntity;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 03:45
 * E-mail: voloshin.developer@gmail.com
 */
public interface CampaignClientRepository
        extends JpaRepository<CampaignClientEntity, CampaignClientEntity.CampaignClientPk> {
}
