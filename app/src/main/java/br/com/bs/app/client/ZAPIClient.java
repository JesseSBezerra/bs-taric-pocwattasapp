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
        url = "https://api.z-api.io/instances/3B976F2A4D6D10D7EBE95ECBD9C20C92/token/226209EC08C7309758085967/"
)
public interface ZAPIClient {

    @PostMapping("send-messages")
    public ResponseEntity<ZMessageResponse> sendMessage(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-contact")
    public ResponseEntity<ZMessageResponse> sendContact(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-image")
    public ResponseEntity<ZMessageResponse> sendImage(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-document/{documentType}")
    public ResponseEntity<ZMessageResponse> sendFile(@RequestParam String documentType, @RequestBody ZMessageRequest zMessageRequest);
}
