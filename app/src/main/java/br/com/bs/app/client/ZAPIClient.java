package br.com.bs.app.client;

import br.com.bs.app.payload.ZMessageRequest;
import br.com.bs.app.payload.ZMessageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "z-api",
        url = "https://api.z-api.io/instances/3B98CC0F7561B05E769DB259EBB4EE58/token/C3C3DAF0B71C0D189309E098/"
)
public interface ZAPIClient {

    @PostMapping("send-messages")
    public ResponseEntity<ZMessageResponse> sendMessage(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-audio")
    public ResponseEntity<ZMessageResponse> sendAudio(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-contact")
    public ResponseEntity<ZMessageResponse> sendContact(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-link")
    public ResponseEntity<ZMessageResponse> sendLink(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-option-list")
    public ResponseEntity<ZMessageResponse> sendOptionList(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-button-list")
    public ResponseEntity<ZMessageResponse> sendButtonList(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-image")
    public ResponseEntity<ZMessageResponse> sendImage(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-document/{documentType}")
    public ResponseEntity<ZMessageResponse> sendFile(@RequestParam String documentType, @RequestBody ZMessageRequest zMessageRequest);
}
