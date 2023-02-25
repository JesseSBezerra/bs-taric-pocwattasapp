package br.com.bs.app.service;

import br.com.bs.app.client.ZAPIClient;
import br.com.bs.app.command.Base64ConverterCommand;
import br.com.bs.app.enums.DocumentType;
import br.com.bs.app.payload.ZMessageResponse;
import br.com.bs.app.payload.ZMessageRequest;
import br.com.bs.app.util.Constante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Optional;

@Service
public class ZMessageService {

    @Autowired
    private ZAPIClient client;

    @Autowired
    private Base64ConverterCommand base64ConverterCommand;

    public ZMessageResponse sendMessage(ZMessageRequest request){
       var response = client.sendMessage(request);
       return  response.getBody();
    }

    public ZMessageResponse sendOptionList(ZMessageRequest request){
        var response = client.sendOptionList(request);
        return  response.getBody();
    }

    public ZMessageResponse sendButtonList(ZMessageRequest request){
        var response = client.sendButtonList(request);
        return  response.getBody();
    }

    public ZMessageResponse sendLink(ZMessageRequest request){
        var response = client.sendLink(request);
        return  response.getBody();
    }

    public ZMessageResponse sendContact(ZMessageRequest request){
        var response = client.sendContact(request);
        return  response.getBody();
    }

    public ZMessageResponse sendImage(String phone, MultipartFile file) throws IOException {
        var image = base64ConverterCommand.converter(file);
        ZMessageRequest request = new ZMessageRequest();
        request.setPhone(phone);
        request.setImage(Constante.BASE64_IMAGE.concat(image));
        var response = client.sendImage(request);
        return  response.getBody();
    }

    public ZMessageResponse sendAudio(String phone, MultipartFile file) throws IOException {
        var image = base64ConverterCommand.converter(file);
        ZMessageRequest request = new ZMessageRequest();
        request.setPhone(phone);
        request.setAudio(Constante.BASE64_AUDIO.concat(image));
        var response = client.sendAudio(request);
        return  response.getBody();
    }

    public ZMessageResponse sendFile(String phone, MultipartFile file, DocumentType documentType) throws IOException {
        var arquivo = base64ConverterCommand.converter(file);
        ZMessageRequest request = new ZMessageRequest();
        request.setPhone(phone);
        ResponseEntity<ZMessageResponse> response = ResponseEntity.of(Optional.empty());
        if(documentType.equals(DocumentType.PDF)) {
            request.setDocument(Constante.BASE64_PDF.concat(arquivo));
            response = client.sendFile("pdf", request);
        } else if (documentType.equals(DocumentType.DOCX)) {
            request.setDocument(Constante.BASE64_DOCX.concat(arquivo));
            response = client.sendFile("docx", request);
        }
        return response.getBody();
    }
}
