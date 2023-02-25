package br.com.bs.app.controller;

import br.com.bs.app.payload.ZMessageRequest;
import br.com.bs.app.service.ZMessageService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

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

    @ApiOperation("Envia uma imagem para o telefone informado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @PostMapping("image")
    public ResponseEntity sendImage(@RequestParam String phone,
                                    @RequestParam MultipartFile file) throws IOException {
        return ResponseEntity.ok().body(service.sendImage(phone,file));
    }

    @ApiOperation("Envia um pdf para o telefone informado")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
    })
    @PostMapping("pdf")
    public ResponseEntity sendPDF(@RequestParam String phone,
                                    @RequestParam MultipartFile file) throws IOException {
        return ResponseEntity.ok().body(service.sendPDF(phone,file));
    }
}
