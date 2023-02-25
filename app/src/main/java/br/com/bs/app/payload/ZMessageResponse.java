package br.com.bs.app.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ZMessageResponse {
   private String zaapId;
   private String messageId;
   private String id;
}
