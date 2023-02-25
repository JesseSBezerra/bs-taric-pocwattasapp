package br.com.bs.app.controller;

import br.com.bs.app.payload.ZMessageRequest;
import br.com.bs.app.service.ZMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/z-watts")
public class ZMessageController {

    @Autowired
    private ZMessageService service;

    @PostMapping("teste")
    public void teste(){
        System.out.println("teste");
    }


    @PostMapping("message")
    public ResponseEntity sendMessage(@RequestBody ZMessageRequest request) {
        return ResponseEntity.ok().body(service.sendMessage(request));
    }
}
