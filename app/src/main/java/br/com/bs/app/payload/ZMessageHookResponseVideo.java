package br.com.bs.app.payload;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ZMessageHookResponseVideo {
    public String videoUrl;
    public String caption;
    public String mimeType;
}
