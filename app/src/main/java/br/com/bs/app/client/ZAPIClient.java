package br.com.bs.app.client;

import br.com.bs.app.payload.ZMessageRequest;
import br.com.bs.app.payload.ZMessageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "z-api",
        url = "https://api.z-api.io/instances/3B96698E7937D0E31141C24260D5D464/token/524AE59E839C77C330EED53D/"
)
public interface ZAPIClient {

    @PostMapping("send-messages")
    public ResponseEntity<ZMessageResponse> sendMessage(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-image")
    public ResponseEntity<ZMessageResponse> sendImage(@RequestBody ZMessageRequest zMessageRequest);

    @PostMapping("send-document/pdf")
    public ResponseEntity<ZMessageResponse> sendPDF(@RequestBody ZMessageRequest zMessageRequest);
}
