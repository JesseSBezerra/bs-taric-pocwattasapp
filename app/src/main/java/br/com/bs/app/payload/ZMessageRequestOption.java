package br.com.bs.app.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZMessageRequestOption {
    public String id;
    public String description;
    public String title;
}
