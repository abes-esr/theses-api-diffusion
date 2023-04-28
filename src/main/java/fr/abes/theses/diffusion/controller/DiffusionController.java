package fr.abes.theses.diffusion.controller;

import fr.abes.theses.diffusion.database.Service;
import fr.abes.theses.diffusion.database.These;
import fr.abes.theses.diffusion.service.ServiceFichiers;
import fr.abes.theses.diffusion.service.VerificationDroits;
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

    /**
     * Renvoie les thèses disponibles en accès restreint Abes
     * @param nnt
     * @return
     * @throws Exception
     */
    @GetMapping(value = "document/protected/{nnt}")
    public ResponseEntity<byte[]> documentProtected(@PathVariable String nnt) throws Exception {
        log.info("protection passée pour ".concat(nnt));
        return verificationDroits.getFichierProtege();
    }

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

        These these = verificationDroits.renvoieThese(nnt);
        String scenario = verificationDroits.getScenario(these.getTef(), nnt);
        if ((scenario.equals("cas1") || scenario.equals("cas2"))
                && verificationDroits.restrictionsTemporellesOkPourAccesEnLigne(these.getTef(), nnt)) {

            // diffusion par l'établissement
            if (verificationDroits.diffusionEtablissementAvecUneSeuleUrl(these.getTef(), nnt, response))
                return ResponseEntity.status(HttpStatus.OK).build();
            // diffusion par le CCSD
            if (verificationDroits.diffusionCcsd(these.getTef(), nnt, response))
                return ResponseEntity.status(HttpStatus.OK).build();

            // diffusion par l'Abes
        }

        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    /**
     * Renvoie le lien de téléchargement du fichier pour le CCSD
     * @param nnt
     * @return
     * @throws Exception
     */
    @GetMapping(value = "document/ccsd/{nnt}")
    public ResponseEntity<byte[]> documentPourCcsd(
            @PathVariable
            @ApiParam(name = "nnt", value = "nnt de la thèse", example = "2023MON12345") String nnt) throws Exception {

        These these = verificationDroits.renvoieThese(nnt);
        String scenario = verificationDroits.getScenario(these.getTef(), nnt);
        if ((scenario.equals("cas1") || scenario.equals("cas2"))
                && verificationDroits.restrictionsTemporellesOkPourAccesEnLigne(these.getTef(), nnt)) {

        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}
