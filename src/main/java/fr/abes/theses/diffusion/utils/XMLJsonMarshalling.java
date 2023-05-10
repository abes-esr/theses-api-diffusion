package fr.abes.theses.diffusion.utils;

import fr.abes.theses.diffusion.model.tef.Mets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@Slf4j
public class XMLJsonMarshalling {

    public Mets chargerMets(InputStream tef) throws Exception {
        try {
            final JAXBContext jc2 = JAXBContext.newInstance("fr.abes.theses.diffusion.model.tef");
            final Unmarshaller unmarshaller2 = jc2.createUnmarshaller();

            InputStreamReader isr = new InputStreamReader(tef, StandardCharsets.UTF_8);
            return (Mets) unmarshaller2.unmarshal(isr);

        } catch (Exception e) {
            log.error("Erreur dans chargerMets : " + e.toString());
            throw e;
        }
    }
}
