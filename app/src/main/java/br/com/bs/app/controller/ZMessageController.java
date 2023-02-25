package br.com.bs.app.controller;

import br.com.bs.app.payload.ZMessageRequest;
import br.com.bs.app.service.ZMessageService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/z-watts")
public class ZMessageController {

    @Autowired
    private ZMessageService service;
    @ApiOperation("Envia uma mensagem para o telefone informado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @PostMapping("message")
    public ResponseEntity sendMessage(@Valid @RequestBody ZMessageRequest request) {
        return ResponseEntity.ok().body(service.sendMessage(request));
    }
}
