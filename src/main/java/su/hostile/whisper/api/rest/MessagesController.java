package su.hostile.whisper.api.rest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import su.hostile.whisper.model.dto.AddMessageRequest;
import su.hostile.whisper.model.dto.MessagesResponse;

import java.util.HashSet;

/*
 * Author: Voloshin Denis
 * Date: 22-08-2023
 * Time: 21:44
 * E-mail: voloshin.developer@gmail.com
 */
public interface MessagesController {

    @GetMapping
    ResponseEntity<HashSet<MessagesResponse>> getMessages();

    @PostMapping
    ResponseEntity<Void> postMessage(@Valid @RequestBody @NotNull final AddMessageRequest addMessageRequest);
}
