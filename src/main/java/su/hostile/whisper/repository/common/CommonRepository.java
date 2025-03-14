package su.hostile.whisper.repository.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import su.hostile.whisper.model.entity.AbstractEntity;

import java.util.UUID;

/*
 * Author: Voloshin Denis
 * Date: 14-03-2025
 * Time: 22:31
 * E-mail: voloshin.developer@gmail.com
 */
@NoRepositoryBean
public interface CommonRepository<E extends AbstractEntity> extends JpaRepository<E, UUID> {

}
