package br.com.bs.app.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZMessageRequestButtonList {
    public ArrayList<ZMessageRequestButton> buttons;
}
