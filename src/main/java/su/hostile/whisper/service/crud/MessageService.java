package su.hostile.whisper.service.crud;

import org.springframework.stereotype.Service;
import su.hostile.whisper.model.entity.MessageEntity;
import su.hostile.whisper.repository.MessageRepository;
import su.hostile.whisper.service.common.AbstractService;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 18:29
 * E-mail: voloshin.developer@gmail.com
 */
@Service
public class MessageService extends AbstractService<MessageEntity, MessageRepository> {

    public MessageService(MessageRepository repository) {
        super(repository);
    }


}
