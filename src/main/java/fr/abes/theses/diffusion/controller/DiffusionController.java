package fr.abes.theses.diffusion.controller;

import fr.abes.theses.diffusion.utils.TypeAcces;
import fr.abes.theses.diffusion.database.Service;
import fr.abes.theses.diffusion.database.These;
import fr.abes.theses.diffusion.service.Diffusion;
import fr.abes.theses.diffusion.service.VerificationDroits;
import fr.abes.theses.diffusion.utils.TypeRestriction;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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

    @Operation(
            summary = "Renvoie un fichier de thèse (ou une liste HTML de liens si la thèse est constituée de plusieurs fichiers) en accès restreint",
            description = "Renvoie les thèses disponibles pour les membres de l'Enseignement Supérieur et de la Recherche après authentification via la fédération d'identité Renater")
    @ApiResponse(responseCode = "200", description = "Opération terminée avec succès, le fichier de thèse est renvoyé")
    @ApiResponse(responseCode = "400", description = "Le format du numéro national de thèse fourni est incorrect")
    @ApiResponse(responseCode = "403", description = "Accès refusé")
    @GetMapping(value = "document/protected/{nnt}")
    public ResponseEntity<byte[]> documentProtected(
            @PathVariable
            @Parameter(name = "nnt", description = "Numéro National de Thèse", example = "2013MON30092") String nnt, HttpServletResponse response) throws Exception {

        log.debug("protection passée pour ".concat(nnt));
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

    /**
     * Renvoie les thèses disponibles en accès libre
     * @param nnt
     * @return
     * @throws Exception
     */
    @Operation(
            summary = "Renvoie un fichier de thèse en accès libre",
            description = "Renvoie les thèses en accès libre")
    @ApiResponse(responseCode = "200", description = "Opération terminée avec succès, le fichier de thèse est renvoyé")
    @ApiResponse(responseCode = "400", description = "Le format du numéro national de thèse fourni est incorrect")
    @ApiResponse(responseCode = "403", description = "Accès refusé")
    @GetMapping(value = "document/{nnt}")
    public ResponseEntity<byte[]> document(
            @PathVariable
            @Parameter(name = "nnt", description = "Numéro National de Thèse", example = "2013MON30092") String nnt, HttpServletResponse response) throws Exception {

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
                return ResponseEntity.status(HttpStatus.OK).build();
            }
            // renvoie une liste de liens sur l'établissement
            if (diffusion.diffusionEtablissementAvecPlusieursUrls(these.getTef(), nnt)) {
                return new ResponseEntity<>(diffusion.listeFichiersEtablissement(these.getTef()), HttpStatus.OK);
            }
            // diffusion par le CCSD
            if (diffusion.diffusionCcsd(these.getTef(), nnt)) {
                diffusion.redirectionCcsd(these.getTef(), response);
                return ResponseEntity.status(HttpStatus.OK).build();
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
    @Operation(
            summary = "Redirige sur l'intranet de l'établissement où est disponible le fichier de thèse",
            description = "il faut disposer d'un compte local à l'établissement pour accéder au fichier de la thèse")
    @ApiResponse(responseCode = "200", description = "Opération terminée avec succès, redirection sur l'intranet de l'établissement")
    @ApiResponse(responseCode = "400", description = "Le format du numéro national de thèse fourni est incorrect")
    @ApiResponse(responseCode = "403", description = "Accès refusé")
    @ApiResponse(responseCode = "404", description = "L'url de la thèse n'est pas trouvée dans les métadonnées de description de la thèse (TEF) ou l'url ne répond pas")
    @GetMapping(value = "document/intranetEtab/{nnt}")
    public ResponseEntity<byte[]> documentIntranetEtab(
            @PathVariable
            @Parameter(name = "nnt", description = "Numéro National de Thèse", example = "2013MON30092") String nnt, HttpServletResponse response) throws Exception {

        if (!service.verifieNnt(nnt)) {
            log.error("nnt incorrect");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        These these = service.renvoieThese(nnt);
        String scenario = verificationDroits.getScenario(these.getTef(), nnt);

        // cas 4 intranet, renvoie sur l'intranet de l'établissement si l'url est renseignée et répond (url dans les identifier)
        if (verificationDroits.getScenario(these.getTef(), nnt).equals("cas4")) {
            if (diffusion.diffusionEtablissementIntranet(these.getTef())) {
                diffusion.redirectionEtablissementIntranet(these.getTef(), response);
                return ResponseEntity.status(HttpStatus.OK).build();
            }
            else
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        // cas 6 intranet, renvoie sur l'intranet de l'établissement si l'url est renseignée et répond (url dans le bloc de gestion du tef)
        if (verificationDroits.getScenario(these.getTef(), nnt).equals("cas6")) {
            if (diffusion.diffusionEtablissementAvecUneSeuleUrl(these.getTef(), nnt)) {
                diffusion.redirectionEtabAvecUneSeuleUrl(these.getTef(), response, false);
                return ResponseEntity.status(HttpStatus.OK).build();
            }
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
    @Operation(
            summary = "Fournit un lien d'accès direct au fichier de thèse (ou de l'une de ses annexes) si la thèse est disponible en accès libre",
            description = "permet de télécharger le ou les fichiers de la thèse depuis la plateforme Abes")
    @ApiResponse(responseCode = "200", description = "Opération terminée avec succès, redirection sur l'intranet de l'établissement")
    @ApiResponse(responseCode = "400", description = "Le format du numéro national de thèse fourni est incorrect")
    @ApiResponse(responseCode = "403", description = "Accès refusé")
    @GetMapping(value = "document/{nnt}/{nomFichierAvecCheminLocal}")
    public ResponseEntity<byte[]> accesDirectAuFichier(
            @PathVariable
            @Parameter(name = "nnt", description = "Numéro National de Thèse", example = "2013MON30092") String nnt,
            @PathVariable
            @Parameter(name = "nomFichierAvecCheminLocal", description = "chemin local vers le fichier de thèse ou de l'une de ses annexes", example = "/0/0/these.pdf")
            String nomFichierAvecCheminLocal,
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
