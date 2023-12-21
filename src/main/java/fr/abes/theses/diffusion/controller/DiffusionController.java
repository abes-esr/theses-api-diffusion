package fr.abes.theses.diffusion.controller;

import fr.abes.theses.diffusion.utils.TypeAcces;
import fr.abes.theses.diffusion.database.Service;
import fr.abes.theses.diffusion.database.These;
import fr.abes.theses.diffusion.service.Diffusion;
import fr.abes.theses.diffusion.service.VerificationDroits;
import fr.abes.theses.diffusion.utils.TypeRestriction;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@RequestMapping("/")
public class DiffusionController {

    @Autowired
    VerificationDroits verificationDroits;
    @Autowired
    Diffusion diffusion;

    @Autowired
    Service service;

    /**
     * Renvoie les thèses disponibles en accès restreint avec diffusion Abes
     * @param nnt
     * @return
     * @throws Exception
     */
    /*
    @GetMapping(value = "document/protected/{nnt}")
    public ResponseEntity<byte[]> documentProtected(
            @PathVariable
            @ApiParam(name = "nnt", value = "nnt de la thèse", example = "2023MON12345") String nnt, HttpServletResponse response) throws Exception {

        log.info("protection passée pour ".concat(nnt));
        if (!service.verifieNnt(nnt)) {
            log.error("nnt incorrect");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        These these = service.renvoieThese(nnt);

        // on renvoie le fichier uniquement si le scénario n'est pas cas6, pas cas4 ou s'il y n'y a pas de confidentialité
        if (
                (!verificationDroits.getScenario(these.getTef(), nnt).equals("cas6")) &&
                        !verificationDroits.getScenario(these.getTef(), nnt).equals("cas4") &&
                !verificationDroits.getRestrictionsTemporelles(these.getTef(), nnt).getType().equals(TypeRestriction.CONFIDENTIALITE)) {
            return new ResponseEntity<>(diffusion.diffusionAbes(these.getTef(), nnt, TypeAcces.ACCES_ESR, response), HttpStatus.OK);
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
    */

    /**
     * Renvoie les thèses disponibles en accès libre
     * @param nnt
     * @return
     * @throws Exception
     */
    @GetMapping(value = "document/{nnt}")
    public ResponseEntity<byte[]> document(
            @PathVariable
            @ApiParam(name = "nnt", value = "nnt de la thèse", example = "2023MON12345") String nnt, HttpServletResponse response) throws Exception {

        if (!service.verifieNnt(nnt)) {
            log.error("nnt incorrect");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        These these = service.renvoieThese(nnt);
        String scenario = verificationDroits.getScenario(these.getTef(), nnt);

        if ((scenario.equals("cas1") || scenario.equals("cas2")
                || scenario.equals("cas3") || scenario.equals("cas4"))
                && verificationDroits.getRestrictionsTemporelles(these.getTef(), nnt).getType().equals(TypeRestriction.AUCUNE)) {

            // diffusion par l'établissement
            if (diffusion.diffusionEtablissementAvecUneSeuleUrl(these.getTef(), nnt)) {

                diffusion.redirectionEtabAvecUneSeuleUrl(these.getTef(), response, false);
            }
            // renvoie une liste de liens sur l'établissement
            if (diffusion.diffusionEtablissementAvecPlusieursUrls(these.getTef(), nnt)) {
                return new ResponseEntity<>(diffusion.listeFichiersEtablissement(these.getTef()), HttpStatus.OK);
            }
            // diffusion par le CCSD
            if (diffusion.diffusionCcsd(these.getTef(), nnt)) {
                diffusion.redirectionCcsd(these.getTef(), response);;
            }
            // diffusion par l'Abes
            return new ResponseEntity<>(diffusion.diffusionAbes(these.getTef(), nnt, TypeAcces.ACCES_LIGNE, response), HttpStatus.OK);

        }

        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    /**
     * Renvoie les thèses disponibles en accès restreint avec diffusion intranet établissement
     * @param nnt
     * @return
     * @throws Exception
     */
    @GetMapping(value = "document/intranetEtab/{nnt}")
    public ResponseEntity<byte[]> documentIntranetEtab(
            @PathVariable
            @ApiParam(name = "nnt", value = "nnt de la thèse", example = "2023MON12345") String nnt, HttpServletResponse response) throws Exception {

        if (!service.verifieNnt(nnt)) {
            log.error("nnt incorrect");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        These these = service.renvoieThese(nnt);
        String scenario = verificationDroits.getScenario(these.getTef(), nnt);

        // cas 4 intranet, renvoie sur l'intranet de l'établissement si l'url est renseignée et répond (url dans les identifier)
        if (verificationDroits.getScenario(these.getTef(), nnt).equals("cas4")) {
            if (diffusion.diffusionEtablissementIntranet(these.getTef()))
                diffusion.redirectionEtablissementIntranet(these.getTef(), response);
            else
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        // cas 6 intranet, renvoie sur l'intranet de l'établissement si l'url est renseignée et répond (url dans le bloc de gestion du tef)
        if (verificationDroits.getScenario(these.getTef(), nnt).equals("cas6")) {
            if (diffusion.diffusionEtablissementAvecUneSeuleUrl(these.getTef(), nnt))
                diffusion.redirectionEtabAvecUneSeuleUrl(these.getTef(), response, false);
            else
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    /**
     * Renvoie le lien de téléchargement du fichier
     * @param nnt
     * @return
     * @throws Exception
     */
    @GetMapping(value = "document/{nnt}/{nomFichierAvecCheminLocal}")
    public ResponseEntity<byte[]> accesDirectAuFichier(
            @PathVariable
            @ApiParam(name = "nnt", value = "nnt de la thèse", example = "2023MON12345") String nnt,
            @PathVariable
            @ApiParam(name = "nomFichierAvecCheminLocal", value = "chemin local vers le fichier de thèse ou de l'une de ses annexes", example = "/0/0/these.pdf") String nomFichierAvecCheminLocal,
            HttpServletResponse response) throws Exception {

        if (!service.verifieNnt(nnt)) {
            log.error("nnt incorrect");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        These these = service.renvoieThese(nnt);
        String scenario = verificationDroits.getScenario(these.getTef(), nnt);

        if ((scenario.equals("cas1") || scenario.equals("cas2")
                || scenario.equals("cas3") || scenario.equals("cas4"))
                && verificationDroits.getRestrictionsTemporelles(these.getTef(), nnt).getType().equals(TypeRestriction.AUCUNE)) {

            return new ResponseEntity<>(diffusion.diffusionAccesDirectAuFichier(these.getTef(), nnt, nomFichierAvecCheminLocal, TypeAcces.ACCES_LIGNE, response), HttpStatus.OK);

        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}
