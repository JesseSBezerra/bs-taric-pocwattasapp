package br.com.bs.app.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZMessageRequestOptionList {
    public String title;
    public String buttonLabel;
    public ArrayList<ZMessageRequestOption> options;
}
