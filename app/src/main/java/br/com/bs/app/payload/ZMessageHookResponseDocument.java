package br.com.bs.app.payload;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ZMessageHookResponseDocument {
    public String documentUrl;
    public String mimeType;
    public String title;
    public int pageCount;
    public String fileName;
}
