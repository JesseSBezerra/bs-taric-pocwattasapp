package br.com.bs.app.payload;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ZMessageHookResponseAudio {
    public String audioUrl;
    public String mimeType;
}
