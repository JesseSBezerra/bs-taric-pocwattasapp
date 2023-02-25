package br.com.bs.app.payload;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ZMessageHookResponse {
    public boolean waitingMessage;
    public boolean isGroup;
    public String instanceId;
    public String messageId;
    public String phone;
    public boolean fromMe;
    public long momment;
    public String status;
    public String chatName;
    public String senderPhoto;
    public String senderName;
    public Object participantPhone;
    public String photo;
    public boolean broadcast;
    public String type;
    public ZMessageHookResponseText text;
    public ZMessageHookResponseDocument document;
    public ZMessageHookResponseVideo video;
    public ZMessageHookResponseContact contact;
    public ZMessageHookResponseImage image;
    public ZMessageHookResponseAudio audio;
    public ZMessageHookResponseListOptions listResponseMessage;
}
