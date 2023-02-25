package br.com.bs.app.service;

import br.com.bs.app.client.ZAPIClient;
import br.com.bs.app.payload.ZMessageResponse;
import br.com.bs.app.payload.ZMessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZMessageService {

    @Autowired
    private ZAPIClient client;

    public ZMessageResponse sendMessage(ZMessageRequest request){
       var response = client.sendMessage(request);
       return  response.getBody();
    }
}
