package br.com.bs.app.command;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class Base64ConverterCommand {

    public String converter(MultipartFile file) throws IOException {
        byte[] encoded =  Base64.encodeBase64(file.getBytes());
        var fileConverterd = new String(encoded, StandardCharsets.US_ASCII);
        return fileConverterd;
    }
}
