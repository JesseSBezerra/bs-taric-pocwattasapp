package br.com.bs.app.payload;

import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ZMessageHookResponseContact {
    public String displayName;
    public String vCard;
    public ArrayList<String> phones;
}
