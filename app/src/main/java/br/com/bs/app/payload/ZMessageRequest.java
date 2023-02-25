package br.com.bs.app.payload;

import lombok.*;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZMessageRequest {

    @NotNull(message = "Atenção: é obrigatório informar o phone ")
    private String phone;
    private String message;

}
