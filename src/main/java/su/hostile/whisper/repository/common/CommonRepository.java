package su.hostile.whisper.repository.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import su.hostile.whisper.model.entity.AbstractEntity;

import java.util.UUID;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 18:13
 * E-mail: voloshin.developer@gmail.com
 */
@NoRepositoryBean
public interface CommonRepository<E extends AbstractEntity> extends JpaRepository<E, UUID> {

}
