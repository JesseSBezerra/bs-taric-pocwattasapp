package br.com.bs.app.payload;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ZMessageHookResponseImage {
    public String mimeType;
    public String imageUrl;
    public String thumbnailUrl;
    public String caption;
}
