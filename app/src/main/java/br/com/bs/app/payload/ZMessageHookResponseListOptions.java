package br.com.bs.app.payload;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ZMessageHookResponseListOptions {
    public String message;
    public String title;
    public String selectedRowId;
}
