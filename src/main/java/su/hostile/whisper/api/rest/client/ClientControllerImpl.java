package su.hostile.whisper.api.rest.client;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import su.hostile.whisper.mapper.ClientMapper;
import su.hostile.whisper.model.dto.client.CreateClientRequest;
import su.hostile.whisper.service.crud.ClientService;

/*
 * Author: Voloshin Denis
 * Date: 15-03-2025
 * Time: 01:54
 * E-mail: voloshin.developer@gmail.com
 */
@RestController
@RequestMapping("api/v1/client")
@RequiredArgsConstructor
public class ClientControllerImpl implements ClientController {

    @NonNull
    private final ClientService clientService;
    @NonNull
    private final ClientMapper clientMapper;

    @Override
    public ResponseEntity<Void> createClient(@RequestBody CreateClientRequest createClientRequest) {
        clientService.createUpdate(clientMapper.toClientBo(createClientRequest));
        return ResponseEntity.ok().build();
    }
}
