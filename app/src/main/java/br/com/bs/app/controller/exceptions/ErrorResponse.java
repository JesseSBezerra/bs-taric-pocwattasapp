package br.com.bs.app.controller.exceptions;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class ErrorResponse {

    private LocalDateTime timestamp;
    @ApiModelProperty(value = "Descrição do erro")
    private String error;
    @ApiModelProperty(value = "Status da requisição HTTP")
    private Integer status;
    private String path;
}
