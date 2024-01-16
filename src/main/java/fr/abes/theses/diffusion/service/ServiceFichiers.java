package fr.abes.theses.diffusion.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

@Slf4j
@Component
public class ServiceFichiers {

    /**
     * fournit le fichier de thèse
     * uniquement utilisé lorsque le fichier est stocké / diffusé par l'Abes
     * @return
     * @throws Exception
     */
    public void renvoyerFichier(HttpServletResponse response, String fichier) throws Exception {

        log.debug("début de renvoyerFichier, fichier : " + fichier);

        ServletOutputStream stream = null;
        FileInputStream fs = null;

        try {
            File file = new File(fichier);
            // sécurité héritée de la précédente version de theses.fr
            if (!file.exists()) {
                fichier = fichier.replaceAll(" ", "_-_");
            }
            if (file.exists() && !file.isDirectory()) {
                // Essaie de trouver le bon type du document
                response.reset();
                response.setContentType(this.renvoieTypeDocUrl("file:///" + file));
                if (fichier.toLowerCase().endsWith(".xml")) {
                    response.setContentType("text/xml"); // ;charset=UTF-8
                } else if (fichier.toLowerCase().endsWith(".wav")) {
                    response.setContentType("audio/x-wav");
                } else if (fichier.toLowerCase().endsWith(".mp4")) {
                    response.setContentType("video/mp4");
                } else if (fichier.toLowerCase().endsWith(".m4a")) {
                    response.setContentType("audio/mp4a-latm");
                }

                String nomFichier = this.extraitNomFichier(fichier);

                log.debug("dans renvoyerFichier, le nomFichier avec extension est : " + nomFichier);

                // Mis en fichier attaché (s'ouvre dans 1 autre fenetre de
                // navigateur), sinon bug rencontré sur gros fichier
                response.addHeader("Content-Disposition", "attachment; filename=" + nomFichier);

                // Renvoi le fichier tel quel
                stream = response.getOutputStream();
                response.setContentLength((int) file.length());
                fs = new FileInputStream(file.getAbsolutePath());
                byte[] buf = new byte[4 * 1024]; // 4K buffer
                int bytesRead;
                while ((bytesRead = fs.read(buf)) != -1) {
                    stream.write(buf, 0, bytesRead);
                }
            } else {
                response.setContentType("text/html;charset=UTF-8");
                response.setStatus(404);
                PrintWriter out = null;
                out = response.getWriter();
                out.println("<b>Ce fichier n'a pas pu être trouvé</b>");
                out = null;
            }
        }
        catch (Exception e) {
            log.error("erreur dans renvoyerFichier :" + e.getMessage());
            throw e;
        }
        finally {
            if (stream != null) {
                stream.flush();
                stream.close();
            }
            if (fs != null) {
                fs.close();
            }
            if (response != null) {
                response.flushBuffer();
            }
        }
    }

    private String extraitNomFichier (String cheminFichier) {

        String nomFichier = cheminFichier.substring(cheminFichier.lastIndexOf("/") + 1).replaceAll(" ", "_-_");
        nomFichier = nomFichier.substring(0, nomFichier.lastIndexOf("."));
        nomFichier = nomFichier.replaceAll("[^A-Za-z0-9\\-\\_]", "");
        String extensionFichier = cheminFichier.substring(cheminFichier.lastIndexOf("."));
        nomFichier = nomFichier + extensionFichier;
        return nomFichier;
    }
    public static String renvoieTypeDocUrl(String urlDoc) throws IOException {
        // note : se base uniquement sur l'extension
        // préfixer les chemins locaux avec le protocole "file:///"
        String type = null;
        URL u;
        try {
            u = new URL(urlDoc);
            URLConnection uc = null;
            uc = u.openConnection();
            type = uc.getContentType();

        } catch (MalformedURLException e) {
            log.error("pb lors de la recup du type du doc = " + e.getMessage());
            throw e;
        } catch (IOException e) {
            log.error("pb lors de la recup du type du doc = " + e.getMessage());
            throw e;
        }
        return type;
    }

    /**
     * Liste tous les fichiers d'un répertoire (même les sous-répertoires)
     */
    public void listerFichiers(String chemin, List<String> liste) {
        log.debug("dans listerFichiers..." + chemin);

        File f = new File(chemin);
        File[] listFiles = f.listFiles();

        for (File file : listFiles) {
            if (file.isDirectory()) {
                listerFichiers(file.getAbsolutePath(), liste);
            } else {
                log.debug(file.getAbsolutePath());
                liste.add(file.getAbsolutePath());
            }
        }
    }
}
