package br.com.bs.app.service;

import br.com.bs.app.client.ZAPIClient;
import br.com.bs.app.command.Base64ConverterCommand;
import br.com.bs.app.payload.ZMessageResponse;
import br.com.bs.app.payload.ZMessageRequest;
import br.com.bs.app.util.Constante;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

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

    public ZMessageResponse sendImage(String phone, MultipartFile file) throws IOException {
        var image = base64ConverterCommand.converter(file);
        ZMessageRequest request = new ZMessageRequest();
        request.setPhone(phone);
        request.setImage(Constante.BASE64_IMAGE.concat(image));
        var response = client.sendImage(request);
        return  response.getBody();
    }

    public ZMessageResponse sendPDF(String phone, MultipartFile file) throws IOException {
        var arquivo = base64ConverterCommand.converter(file);
        ZMessageRequest request = new ZMessageRequest();
        request.setPhone(phone);
        request.setDocument(Constante.BASE64_PDF.concat(arquivo));
        var response = client.sendPDF(request);
        return  response.getBody();
    }
}
