package su.hostile.whisper.repository;

import org.springframework.stereotype.Repository;
import su.hostile.whisper.model.entity.MessageEntity;
import su.hostile.whisper.repository.common.CommonRepository;

import java.util.List;

/*
 * Author: Voloshin Denis
 * Date: 14-03-2025
 * Time: 22:31
 * E-mail: voloshin.developer@gmail.com
 */
@Repository
public interface MessageRepository extends CommonRepository<MessageEntity> {

    List<MessageEntity> findAllByParentId(final MessageEntity messageEntity);
}
