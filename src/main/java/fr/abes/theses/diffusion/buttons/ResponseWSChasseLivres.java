package fr.abes.theses.diffusion.buttons;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseWSChasseLivres {
    private String lastUpdate;
    private String itemFinded;
    private String bestPrice;
    private String url;
    private String currency;
}
