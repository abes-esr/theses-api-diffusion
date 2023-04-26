package fr.abes.theses.diffusion.database;

import fr.abes.theses.diffusion.model.tef.Mets;
import fr.abes.theses.diffusion.utils.XMLJsonMarshalling;
import lombok.Getter;
import lombok.Setter;

import java.io.ByteArrayInputStream;

@Getter
@Setter
public class These {

    private final XMLJsonMarshalling marshall;

    private String doc;
    private String ips;

    private Mets tef;

    public These(XMLJsonMarshalling marshall) {
        this.marshall = marshall;
    }

    /**
     * Charge le tef dans la structure d'objets Java
     * @throws Exception
     */
    public void initTef() throws Exception {
        tef = marshall.chargerMets(new ByteArrayInputStream(this.getDoc().getBytes()));
    }
}
