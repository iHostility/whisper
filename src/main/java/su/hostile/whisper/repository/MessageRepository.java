package su.hostile.whisper.repository;

import org.springframework.stereotype.Repository;
import su.hostile.whisper.model.entity.MessageEntity;
import su.hostile.whisper.repository.common.CommonRepository;

import java.util.List;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 20:54
 * E-mail: voloshin.developer@gmail.com
 */
@Repository
public interface MessageRepository extends CommonRepository<MessageEntity> {

    List<MessageEntity> findAllByParentId(final MessageEntity messageEntity);
}
