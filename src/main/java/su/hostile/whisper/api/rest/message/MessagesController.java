package su.hostile.whisper.api.rest.message;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import su.hostile.whisper.model.dto.message.AddMessageRequest;
import su.hostile.whisper.model.dto.message.MessagesResponse;

import java.util.HashSet;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 01:30
 * E-mail: voloshin.developer@gmail.com
 */
public interface MessagesController {

    @GetMapping
    ResponseEntity<HashSet<MessagesResponse>> getMessages();

    @PostMapping
    ResponseEntity<Void> postMessage(@Valid @RequestBody @NotNull final AddMessageRequest addMessageRequest);
}
