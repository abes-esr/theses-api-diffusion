package fr.abes.theses.diffusion.buttons;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
@Component
public class ChasseLivres {

    @Value("${chasseAuxLivres.url}")
    String urlWSChasseLivres;

    @Value("${chasseAuxLivres.key}")
    String keyWSChasseLivres;
    ObjectMapper objectMapper = new ObjectMapper();

    public void configureBouton(BoutonChasseLivres bouton, String isbn, String nnt) throws Exception {

        try {
            ResponseWSChasseLivres responseWSChasseLivres = objectMapper.readValue(appelWSChasseLivres(isbn), ResponseWSChasseLivres.class);
            bouton.setUrl(responseWSChasseLivres.getUrl());
            bouton.setChasseLivreBestPrice(responseWSChasseLivres.getBestPrice());
            bouton.setChasseLivresCurrency(responseWSChasseLivres.getCurrency());
        } catch (JsonProcessingException e) {
            log.error("erreur lors du mapping de la réponse du ws chasse aux livres pour nnt = " + nnt + " et isbn = " + isbn);
            log.error(e.toString());
            throw e;
        }
    }

    public String appelWSChasseLivres(String isbn) throws Exception {

        BufferedReader reader = null;
        try {
            isbn = isbn.replaceAll("-", "");
            URL url = new URL(urlWSChasseLivres + isbn + keyWSChasseLivres);
            reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            String line = "";
            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            reader.close();
            return builder.toString();
        } catch (Exception e) {
            log.error("erreur lors de l'appel au WS chasse aux livres");
            log.error(e.toString());
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    log.error(e1.toString());
                }
            }
            throw e;
        }
    }

}
