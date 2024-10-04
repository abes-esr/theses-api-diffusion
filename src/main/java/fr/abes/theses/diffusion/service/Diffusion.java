package fr.abes.theses.diffusion.service;

import fr.abes.theses.diffusion.model.tef.DmdSec;
import fr.abes.theses.diffusion.model.tef.Identifier;
import fr.abes.theses.diffusion.model.tef.Mets;
import fr.abes.theses.diffusion.model.tef.XmlData;
import fr.abes.theses.diffusion.utils.TypeAcces;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class Diffusion {

    @Value("${tel.userId}")
    String loginTel;
    @Value("${tel.password}")
    String pwdTel;
    @Value("${tel.hostSword}")
    String apiTel;
    @Value("${theses.path.local}")
    String thesesPathLocal;
    @Value("${portail.url}")
    String urlPortail;

    @Autowired
    ServiceFichiers serviceFichiers;

    /**
     * vérifie si la diffusion de la thèse doit se faire via l'établissement
     * @param tef permet de vérifier que l'établissement veut et peut diffuser la thèse
     * @param nnt identifiant de la thèse
     * @return booléen indiquant si la diffusion par l'établissement est possible
     */
    public Boolean diffusionEtablissementAvecUneSeuleUrl(Mets tef, String nnt) {

        log.debug("diffusionEtablissementAvecUneSeuleUrl...");
        Boolean urlRepond;
        try {
            Optional<DmdSec> starGestion = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst();
            if (starGestion.isPresent()) {
                if (starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                        .getDiffusion().getEtabDiffuseur().getEtabDiffuseurPolEtablissement().equals("oui")
                        && starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                        .getDiffusion().getEtabDiffuseur().getUrlEtabDiffuseur().size() == 1
                        && !starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                        .getDiffusion().getEtabDiffuseur().getUrlEtabDiffuseur().get(0).getValue().trim().isEmpty()) {

                    String urlEtab = starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                            .getDiffusion().getEtabDiffuseur().getUrlEtabDiffuseur().get(0).getValue().trim();
                    // Vérification que l'établissement n'a pas saisi une url theses.fr (risque de boucle infinie)
                    if (!urlEtab.contains("theses.fr")) {
                        urlEtab = formateUrl(urlEtab);

                        // Vérification que le fichier est bien disponible à l'url donnée
                        urlRepond = this.urlExists(urlEtab);

                        if (urlRepond) {
                            log.debug("diffusionEtablissementAvecUneSeuleUrl, urlRepond = true");
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (NullPointerException e) {
            log.error("Erreur pour récupérer getEtabDiffuseurPolEtablissement de ".concat(nnt).concat(e.getMessage()));
            throw e;
        }
    }
    public void redirectionEtabAvecUneSeuleUrl(Mets tef, HttpServletResponse response, boolean dryRun) {
        log.debug("redirectionEtabAvecUneSeuleUrl...");
        Optional<DmdSec> starGestion = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst();

        String urlEtab = starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                .getDiffusion().getEtabDiffuseur().getUrlEtabDiffuseur().get(0).getValue().trim();

        try {
            redirectionSurUrl(response, dryRun, urlEtab);
        }
        catch (IOException e) {
                log.error("Erreur lors de la redirection vers l'url de l'établissement : ".concat(e.toString()));
        }
    }

    public Boolean diffusionEtablissementAvecPlusieursUrls(Mets tef, String nnt) {
        log.debug("diffusionEtablissementAvecPlusieursUrls...");
        try {
            Optional<DmdSec> starGestion = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst();
            if (starGestion.isPresent()) {
                if (starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                        .getDiffusion().getEtabDiffuseur().getEtabDiffuseurPolEtablissement().equals("oui")
                        && starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                        .getDiffusion().getEtabDiffuseur().getUrlEtabDiffuseur().size() > 1
                        && !starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                        .getDiffusion().getEtabDiffuseur().getUrlEtabDiffuseur().get(0).getValue().trim().isEmpty()) {

                    log.debug("diffusionEtablissementAvecPlusieursUrls : true");
                    return true;
                }
            }
            return false;
        } catch (NullPointerException e) {
            log.error("Erreur pour récupérer getEtabDiffuseurPolEtablissement de ".concat(nnt).concat(e.getMessage()));
            throw e;
        }
    }
    public byte[] listeFichiersEtablissement(Mets tef)  {
        Optional<DmdSec> starGestion = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst();
        Iterator<XmlData.StarGestion.Traitements.Sorties.Diffusion.EtabDiffuseur.UrlEtabDiffuseur> iterator =
                starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                .getDiffusion().getEtabDiffuseur().getUrlEtabDiffuseur().iterator();
        String listeFichiers = "";
        listeFichiers = "<ul class='listeFichiers'>";
        while (iterator.hasNext()) {

            XmlData.StarGestion.Traitements.Sorties.Diffusion.EtabDiffuseur.UrlEtabDiffuseur urlEtabDiffuseur = iterator.next();

            listeFichiers += "<li><a href=\"" + urlEtabDiffuseur.getValue() + "\">" + urlEtabDiffuseur.getValue() + "</a></li>";

        }
        listeFichiers += "</ul>";
        return listeFichiers.getBytes();
    }


    public Boolean diffusionEtablissementIntranet(Mets tef) {


        Iterator<DmdSec> iterator = tef.getDmdSec().iterator();
        while (iterator.hasNext()) {
            DmdSec dmdSec = iterator.next();
            Iterator<Identifier> iteratorIdentifier;
            try {
                iteratorIdentifier = dmdSec.getMdWrap().getXmlData().getEdition().getIdentifier().iterator();
            } catch (NullPointerException e) {
                continue;
            }


            while (iteratorIdentifier.hasNext()) {
                Identifier identifier = iteratorIdentifier.next();
                if (this.estUrlIntranetEtab(identifier.getValue().trim())) {
                    return true;
                }
            }
        }

        return false;
    }
    public void redirectionEtablissementIntranet(Mets tef, HttpServletResponse response) {
        Iterator<DmdSec> iterator = tef.getDmdSec().iterator();
        while (iterator.hasNext()) {
            DmdSec dmdSec = iterator.next();
            Iterator<Identifier> iteratorIdentifier;
            try {
                iteratorIdentifier = dmdSec.getMdWrap().getXmlData().getEdition().getIdentifier().iterator();
            } catch (NullPointerException e) {
                continue;
            }


            while (iteratorIdentifier.hasNext()) {
                Identifier identifier = iteratorIdentifier.next();
                if (this.estUrlIntranetEtab(identifier.getValue().trim())) {
                    try {
                        redirectionSurUrl(response, false, identifier.getValue().trim());

                    }
                    catch (IOException e) {
                        log.error("Erreur lors de la redirection vers l'url intranet de l'établissement : ".concat(e.toString()));
                    }
                }
            }
        }
    }
    private void redirectionSurUrl(HttpServletResponse response, boolean dryRun, String url) throws IOException {

        if (!dryRun) {
            log.debug("redirection sur : " + url);
            response.sendRedirect(url);
        }
    }

    private Boolean estUrlIntranetEtab (String url) {
        if (!url.contains("sudoc")) {
            return true;
        }
        return false;
    }

    public Boolean diffusionCcsd (Mets tef, String nnt) {
        log.debug("diffusionCcsd...");
        Boolean urlRepond;

        try {
            Optional<DmdSec> starGestion = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst();
            if (starGestion.isPresent()) {
                if (starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                        .getDiffusion().getCcsd().getCcsdDiffuseurPolEtablissement().equals("oui")
                        && !starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                        .getDiffusion().getCcsd().getUrlCcsd().trim().isEmpty()) {

                    String urlCcsd = starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                            .getDiffusion().getCcsd().getUrlCcsd().trim();
                    urlCcsd = formateUrl(urlCcsd);
                    String identifiantCcsd = starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                            .getDiffusion().getCcsd().getIdentifiantCcsd();

                    urlRepond = telOk(identifiantCcsd);

                    if (urlRepond) {
                        log.debug("diffusionCcsd, urlRepond = true");
                        return true;
                    }
                }
            }
            return false;
        } catch (NullPointerException e) {
            log.error("Erreur pour récupérer getEtabDiffuseurPolEtablissement de ".concat(nnt).concat(e.getMessage()));
            throw e;
        }
    }
    public void redirectionCcsd (Mets tef, HttpServletResponse response) {
        Optional<DmdSec> starGestion = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst();
        String urlCcsd = starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties()
                .getDiffusion().getCcsd().getUrlCcsd().trim();
        urlCcsd = formateUrl(urlCcsd);
        try {
            redirectionSurUrl(response, false, urlCcsd);
        }
        catch (IOException e) {
            log.error("Erreur lors de la redirection vers l'url du ccsd : ".concat(e.toString()));
        }

    }

    public byte[] diffusionAbes (Mets tef, String nnt, TypeAcces typeAcces, boolean protege, HttpServletResponse response) throws Exception {

        log.debug("diffusionAbes...");
        String codeEtab = "";
        String scenario = "";
        String idThese = "";

        try {
            Optional<DmdSec> starGestion = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst();
            if (starGestion.isPresent()) {

                codeEtab = starGestion.get().getMdWrap().getXmlData().getStarGestion().getCodeEtab();
                scenario = starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getScenario();
                idThese = starGestion.get().getMdWrap().getXmlData().getStarGestion().getIDTHESE();
            }

            String chemin = thesesPathLocal + codeEtab + "/" + idThese + "/document/";
            String rep = this.versionADiffuser(scenario, typeAcces);
            chemin += rep;

            log.debug("Diffusion => Abes diffuseur : scenario=" + scenario + " chemin=" + chemin);
            if (!rep.equals("")) {
                List<String> liste = new ArrayList<>();
                serviceFichiers.listerFichiers(chemin, liste);
                if (liste.size() > 0) {
                    // Renvoie l'unique fichier du répertoire
                    if (liste.size() == 1) {
                        log.debug("un seul fichier dans le répertoire :" + liste.get(0));
                        serviceFichiers.renvoyerFichier(response, liste.get(0));
                    } else { // Sinon renvoie la liste des
                        // fichiers
                        String listeFichiers = "";
                        listeFichiers = "<ul class='listeFichiers'>";
                        for (String fichier : liste) {
                            String nomFic = fichier.substring(fichier.indexOf("document") + 13)
                                    .replace("\\", "/");
                            if (protege) {
                                listeFichiers += "<li><a href=\"" + urlPortail + "/api/v1/document/protected/" + nnt + "/"
                                        + nomFic.replaceAll(" ", "_-_") + "\">" + nomFic + "</a></li>";
                            }
                            else {
                                listeFichiers += "<li><a href=\"" + urlPortail + "/api/v1/document/" + nnt + "/"
                                        + nomFic.replaceAll(" ", "_-_") + "\">" + nomFic + "</a></li>";
                            }
                        }
                        listeFichiers += "</ul>";
                        return listeFichiers.getBytes();
                    }
                }
            }
            return "Ce fichier n'a pas pu être trouvé".getBytes();
        } catch (Exception e) {
            log.error("erreur dans diffusionAbes : " + e);
            throw e;
        }
    }

    public byte[] diffusionAccesDirectAuFichier (Mets tef, String nnt, String nomFichierAvecCheminLocal, TypeAcces typeAcces, HttpServletResponse response) throws Exception {

        String codeEtab = "";
        String scenario = "";
        String idThese = "";

        try {
            Optional<DmdSec> starGestion = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst();
            if (starGestion.isPresent()) {

                codeEtab = starGestion.get().getMdWrap().getXmlData().getStarGestion().getCodeEtab();
                scenario = starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getScenario();
                idThese = starGestion.get().getMdWrap().getXmlData().getStarGestion().getIDTHESE();
            }

            String chemin = thesesPathLocal + codeEtab + "/" + idThese + "/document/";
            String rep = this.versionADiffuser(scenario, typeAcces);
            chemin += rep;

            log.info("recherche de " + chemin + nomFichierAvecCheminLocal);
            if (!rep.equals("")) {
                File f = new File(chemin + nomFichierAvecCheminLocal);
                if (f.exists()) {
                    serviceFichiers.renvoyerFichier(response, chemin + nomFichierAvecCheminLocal);
                }
            }
            throw new FileNotFoundException();

        } catch (Exception e) {
            log.error("erreur dans diffusionAccesDirectAuFichier : " + e);
            throw e;
        }
    }

    /**
     * renvoie le chemin permettant d'accéder à la version à diffuser (cf. https://documentation.abes.fr/aidetheses/index.html#Cas1Cas2:6.1.2.0) :
     * 0/0/ : la version d'archivage est la version à diffuser
     * 0/1/ : la version à diffuser n'est pas celle d'archivage : difference de format par exemple (xml vs pdf)
     * 1/0/ : la version à diffuser n'est pas celle d'archivage : c'est une version expurgée, par exemple en enlevant des images soumises à droits d'auteur
     * @param scenario détermine le scénario de diffusion qui indique : les versions de thèses à diffuser (l'accès (en ligne ou ESR) est modulé par d'éventuelles restrictions de diffusion (confidentialité, embargo).
     * @param typeAcces le cas 3 permet en parallèle une diffusion acces esr et une autre acces en ligne, typeAcces permet de distinguer les deux.
     * @return le chemin d'accès à la thèse
     */
    private String versionADiffuser(String scenario, TypeAcces typeAcces) {

        String rep ="";
        boolean accesEnLigneEtAccesESR = typeAcces.equals(TypeAcces.ACCES_LIGNE) || typeAcces.equals(TypeAcces.ACCES_ESR);

        if (scenario.equals("cas1") && accesEnLigneEtAccesESR) {
            rep = "0/0/";
        } else if (scenario.equals("cas2") && accesEnLigneEtAccesESR) {
            rep = "0/1/";
        } else if (scenario.equals("cas3") && typeAcces.equals(TypeAcces.ACCES_LIGNE)) {
            rep = "1/0/";
        } else if (scenario.equals("cas3") && typeAcces.equals(TypeAcces.ACCES_ESR)) {
            rep = "0/0/";
        } else if (scenario.equals("cas4") && typeAcces.equals(TypeAcces.ACCES_LIGNE)) {
            rep = "1/0/";
        } else if (scenario.equals("cas4") && typeAcces.equals(TypeAcces.ACCES_ESR)) {
            // todo : attention, pas encore géré dans STAR
            rep = "0/1/";
        } else if (scenario.equals("cas5") && typeAcces.equals(TypeAcces.ACCES_ESR)) {
            rep = "0/0/";
        } else if (scenario.equals("cas6") && typeAcces.equals(TypeAcces.ACCES_ESR)) {
            // todo : attention, pas encore géré dans STAR
            rep = "0/1/";
        }

        return rep;
    }

    private String formateUrl(String url) {
        String debUrl = url.substring(0, url.lastIndexOf("/") + 1);
        String finUrl = java.net.URLEncoder
                .encode(url.substring(url.lastIndexOf("/") + 1));
        finUrl = finUrl.replace("%3F", "?");
        finUrl = finUrl.replaceAll("%25", "%");
        finUrl = finUrl.replaceAll("%26", "&");
        finUrl = finUrl.replaceAll("%3D", "=");
        url = debUrl + finUrl;
        return url;
    }

    /**
     * Retourne true si l'url répond, false sinon
     */
    public Boolean urlExists(String URLName) {
        try {
            if (URLName.trim().toLowerCase().startsWith("ftp://")) {
                URL url = new URL(URLName);
                URLConnection yc = url.openConnection();
                yc.setConnectTimeout(5000);
                yc.connect();
                return true;
            }
            else {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(URLName))
                        .method("HEAD", HttpRequest.BodyPublishers.noBody())
                        .build();
                HttpResponse<Void> response = client.send(request, HttpResponse.BodyHandlers.discarding());

                boolean reponse = false;
                if (response.statusCode() == HttpURLConnection.HTTP_OK
                        || response.statusCode() == HttpURLConnection.HTTP_MOVED_TEMP
                        || response.statusCode() == HttpURLConnection.HTTP_MOVED_PERM
                        || response.statusCode() == HttpURLConnection.HTTP_SEE_OTHER
                        || response.statusCode() == HttpURLConnection.HTTP_UNAUTHORIZED
                        || response.statusCode() == HttpURLConnection.HTTP_MOVED_PERM
                        || response.statusCode() == HttpURLConnection.HTTP_FORBIDDEN) {
                    reponse = true;
                }
                return reponse;
            }
        } catch (Exception e) {
            log.error(e.toString());
            return false;
        }
    }


    /*
     * Retourne true si l'url est "accept" chez TEL
     */
    public boolean telOk(String idTel) {
        boolean reponse = false;
        try {

            String loginPassword = loginTel + ":" + pwdTel;
            byte[] authEncBytes = Base64.encodeBase64(loginPassword.getBytes());
            String httpBasicAuthentication = new String(authEncBytes);

            URL url = new URL("http://" + apiTel + "/sword/tel/" + idTel);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");
            con.setDoInput(true);
            con.setDoOutput(true);
            con.setConnectTimeout(60000);
            con.setReadTimeout(60000);

            con.setRequestProperty("GET", "/sword/tel/" + idTel + " HTTP/1.1");
            con.setRequestProperty("Authorization", "Basic " + httpBasicAuthentication);
            con.setRequestProperty("Host", apiTel);

            InputStreamReader reader = null;

            if (con.getResponseCode() >= 400) {
                reader = new InputStreamReader(con.getErrorStream());
            } else {
                reader = new InputStreamReader(con.getInputStream());
            }
            StringBuilder buf = new StringBuilder();
            char[] cbuf = new char[2048];
            int num;
            while (-1 != (num = reader.read(cbuf))) {
                buf.append(cbuf, 0, num);
            }

            String result = buf.toString();
            log.debug("\nDans telOk : Response from server after GET :\n" + result);

            if (result.contains("<status>accept")) {
                reponse = true;
            }
            reader.close();
            con.disconnect();
        } catch (Exception e) {
            log.error("Erreur dans telOk = ".concat(e.getMessage()));
            reponse = false;
        }
        return reponse;
    }
}
