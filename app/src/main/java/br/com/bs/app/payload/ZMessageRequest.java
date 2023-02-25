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
    private String image;
    private String audio;
    private String document;
    private String contactName;
    private String contactPhone;
    private String title;
    private String linkUrl;
    private String linkDescription;
    private ZMessageRequestOptionList optionList;
    private ZMessageRequestButtonList buttonList;

}
