package fr.abes.theses.diffusion.controller;

import fr.abes.theses.diffusion.database.Service;
import fr.abes.theses.diffusion.database.These;
import fr.abes.theses.diffusion.model.tef.DmdSec;
import fr.abes.theses.diffusion.model.tef.Mets;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.io.File;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/")
public class DiffusionController {

    @Autowired
    Service service;

    @GetMapping("/redirectWithRedirectView")
    public RedirectView redirectWithUsingRedirectView(
            RedirectAttributes attributes) {
        attributes.addFlashAttribute("flashAttribute", "redirectWithRedirectView");
        attributes.addAttribute("attribute", "redirectWithRedirectView");
        return new RedirectView("redirectedUrl");
    }

    @GetMapping(value = "document/protected/{nnt}")
    public ResponseEntity<byte[]> documentProtected(@PathVariable String nnt) throws Exception {
        log.info("protection passée pour ".concat(nnt));
        return getFichier();
    }
    @GetMapping(value = "document/{nnt}")
    public ResponseEntity<byte[]> document(
            @PathVariable
            @ApiParam(name = "nnt", value = "nnt de la thèse", example = "2023MON12345") String nnt) throws Exception {

        nnt = nnt.toUpperCase();
        These these = service.findTheseByNnt(nnt);
        these.initTef();
        String scenario = this.getScenario(these.getTef(), nnt);
        if (scenario.equals("cas1") && this.restrictionsTemporellesOkPourAccesEnLigne(these.getTef(), nnt)) {

        }
        if (scenario.equals("cas2") && this.restrictionsTemporellesOkPourAccesEnLigne(these.getTef(), nnt)) {

        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    private String getScenario(Mets tef, String nnt) throws Exception {
        try {
            Optional<DmdSec> starGestion = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst();
            if (starGestion.isPresent()) {
                return starGestion.get().getMdWrap().getXmlData().getStarGestion().getTraitements().getScenario();
            }
        } catch (NullPointerException e) {
            log.error("Erreur pour récupérer le scenario de ".concat(nnt).concat(e.getMessage()));
            throw e;
        }
        throw new Exception("scenario absent");
    }
    private Boolean restrictionsTemporellesOkPourAccesEnLigne(Mets tef, String nnt) throws Exception {

        String restrictionTemporelleType;
        String restrictionTemporelleFin;

        log.info("Récupération de restriction temporelle type ");
        try {
            if (!tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst().orElse(null)
                    .getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties().getDiffusion().getRestrictionTemporelleType().isEmpty())
                restrictionTemporelleType = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst().orElse(null)
                        .getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties().getDiffusion().getRestrictionTemporelleType();
            else
                throw new Exception("restriction temporelle type est vide");
        } catch (NullPointerException e) {
            log.error("Erreur pour récupérer la restriction temporelle type de " + nnt + "," + e.getMessage());
            throw e;
        }

        log.info("Récupération de restriction temporelle fin ");
        try {
            if (!tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst().orElse(null)
                    .getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties().getDiffusion().getRestrictionTemporelleFin().isEmpty())
                restrictionTemporelleFin = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst().orElse(null)
                        .getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties().getDiffusion().getRestrictionTemporelleFin();
            else
                throw new Exception("restriction temporelle fin est vide");
        } catch (NullPointerException e) {
            log.error("Erreur pour récupérer la restriction temporelle fin de " + nnt + "," + e.getMessage());
            throw e;
        }

        if (restrictionTemporelleType.equals("sansObjet"))
            return true;
        if (
                (restrictionTemporelleType.equals("embargo")
                || restrictionTemporelleType.equals("confidentialite")
                || restrictionTemporelleType.equals("confEmbargo"))
        && (LocalDate.parse(restrictionTemporelleFin).isBefore(LocalDate.now())))
        {
            return true;
        }
        return false;
    }
    private ResponseEntity<byte[]> getFichier() throws Exception {
        File file = new File("/74979_GERARDIN_2018_archivage.pdf");
        byte[] bytes = Files.readAllBytes(file.toPath());
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_OCTET_STREAM_VALUE);
        httpHeaders.set(HttpHeaders.CONTENT_DISPOSITION, ContentDisposition.attachment().filename("74979_GERARDIN_2018_archivage.pdf").build().toString());
        return ResponseEntity.ok().headers(httpHeaders).body(bytes);
    }
}
