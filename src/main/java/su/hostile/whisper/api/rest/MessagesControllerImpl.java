package su.hostile.whisper.api.rest;

import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import su.hostile.whisper.mapper.MessageMapper;
import su.hostile.whisper.model.dto.AddMessageRequest;
import su.hostile.whisper.model.dto.MessagesResponse;
import su.hostile.whisper.service.crud.MessageService;

import java.util.HashSet;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 21:47
 * E-mail: voloshin.developer@gmail.com
 */
@Slf4j
@RestController
@RequestMapping("api/v1/messages")
@RequiredArgsConstructor
public class MessagesControllerImpl implements MessagesController {

    private final MessageService messageService;
    private final MessageMapper messageMapper;

    @Override
    public ResponseEntity<HashSet<MessagesResponse>> getMessages() {

        return ResponseEntity
                .ok()
                .body(messageMapper.toCollectionOfMessageResponse(messageService.getAll()));
    }

    @Override
    public ResponseEntity<Void> postMessage(@RequestBody @NotNull final AddMessageRequest addMessageRequest) {
        messageService.save(messageMapper.toMessageEntity(addMessageRequest));
        return ResponseEntity.ok().build();
    }
}
