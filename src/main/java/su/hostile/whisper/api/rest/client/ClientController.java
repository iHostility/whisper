package su.hostile.whisper.api.rest.client;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import su.hostile.whisper.model.dto.client.CreateClientRequest;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 01:30
 * E-mail: voloshin.developer@gmail.com
 */
public interface ClientController {
    @PostMapping
    ResponseEntity<Void> createClient(@RequestBody @NotNull @Valid final CreateClientRequest createClientRequest);
}
