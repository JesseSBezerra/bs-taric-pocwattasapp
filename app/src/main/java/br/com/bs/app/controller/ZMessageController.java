package br.com.bs.app.controller;

import br.com.bs.app.enums.DocumentType;
import br.com.bs.app.payload.ZMessageRequest;
import br.com.bs.app.service.ZMessageService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;

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

    @ApiOperation("Envia uma mensagem que contém um link de acesso.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @PostMapping("link")
    public ResponseEntity sendLink(@Valid @RequestBody ZMessageRequest request) {
        return ResponseEntity.ok().body(service.sendLink(request));
    }

    @ApiOperation("Envia uma lista de opções para seleção do telefone informado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @PostMapping("option-list")
    public ResponseEntity sendOptionList(@Valid @RequestBody ZMessageRequest request) {
        return ResponseEntity.ok().body(service.sendOptionList(request));
    }

    @ApiOperation("Envia uma mensagem com botões de escolha para o telefone informado.")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @PostMapping("button-list")
    public ResponseEntity sendButtonList(@Valid @RequestBody ZMessageRequest request) {
        return ResponseEntity.ok().body(service.sendButtonList(request));
    }

    @ApiOperation("Envia um contato para o telefone informado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @PostMapping("contact")
    public ResponseEntity sendContact(@Valid @RequestBody ZMessageRequest request) {
        return ResponseEntity.ok().body(service.sendContact(request));
    }

    @ApiOperation("Envia uma imagem para o telefone informado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @PostMapping("image")
    public ResponseEntity sendImage(@RequestParam String phone,
                                    @RequestParam MultipartFile file) throws IOException {
        return ResponseEntity.ok().body(service.sendImage(phone,file));
    }

    @ApiOperation("Envia um audio para o telefone informado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @PostMapping("audio")
    public ResponseEntity sendAudio(@RequestParam String phone,
                                    @RequestParam MultipartFile file) throws IOException {
        return ResponseEntity.ok().body(service.sendAudio(phone,file));
    }

    @ApiOperation("Envia um arquivo para o telefone informado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @PostMapping("pdf")
    public ResponseEntity sendPDF(@RequestParam String phone,
                                  @RequestParam MultipartFile file,
                                  @RequestParam DocumentType documentType) throws IOException {
        return ResponseEntity.ok().body(service.sendFile(phone,file,documentType));
    }
}
