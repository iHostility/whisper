package su.hostile.whisper.service.crud;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import su.hostile.whisper.model.entity.MessageEntity;
import su.hostile.whisper.repository.MessageRepository;
import su.hostile.whisper.service.common.AbstractService;

import java.util.List;
import java.util.Optional;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 00:31
 * E-mail: voloshin.developer@gmail.com
 */
@Service
public class MessageServiceImpl extends AbstractService<MessageEntity, MessageRepository> {

    public MessageServiceImpl(MessageRepository repository) {
        super(repository);
    }

    @Override
    @Transactional
    public Optional<MessageEntity> save(final MessageEntity entity) {

        return super.save(entity);
    }

    @Override
    @Transactional(readOnly = true)
    public List<MessageEntity> getAll() {

        return super.getRepository().findAllByParentId(null);
    }
}
