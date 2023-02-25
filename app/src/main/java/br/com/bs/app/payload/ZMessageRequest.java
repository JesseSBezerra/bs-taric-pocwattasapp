package br.com.bs.app.payload;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZMessageRequest {

    private String phone;
    private String message;

}
