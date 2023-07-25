package fr.abes.theses.diffusion.service;

import fr.abes.theses.diffusion.database.Service;
import fr.abes.theses.diffusion.database.These;
import fr.abes.theses.diffusion.model.tef.DmdSec;
import fr.abes.theses.diffusion.model.tef.Mets;
import fr.abes.theses.diffusion.utils.TypeAcces;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class VerificationDroits {


    public String getScenario(Mets tef, String nnt) throws Exception {
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

    /**
     * teste si la thèse est en accès libre ou bien soumise en un embargo ou confidentialité
     * @param tef
     * @param nnt
     * @return
     * renvoie true si il n'y a pas de restriction temporelle ou si la restriction temporelle est passée
     * renvoie false si la restriction temporelle n'est pas passée
     * @throws Exception
     */
    public TypeAcces restrictionsTemporelles(Mets tef, String nnt) throws Exception {

        String restrictionTemporelleType = this.getRestrictionTemporelleType(tef, nnt);

        if (restrictionTemporelleType.equals("sansObjet"))
            return TypeAcces.ACCES_EN_LIGNE;

        boolean restrictionTemporelleExiste = restrictionTemporelleType.equals("embargo")
                || restrictionTemporelleType.equals("confidentialite")
                || restrictionTemporelleType.equals("confEmbargo");
        if (
                // la restrhiction temporelle est passée
                restrictionTemporelleExiste
                        && (LocalDate.parse(this.getRestrictionTemporelleFin(tef, nnt)).isBefore(LocalDate.now())))
        {
            return TypeAcces.ACCES_EN_LIGNE;
        }

        if (
            // encore sous confidentialité mais plus sous embargo
                restrictionTemporelleExiste
                        && (
                        (this.getConfidentialiteFin(tef, nnt).equals("confidentialiteVide") || (LocalDate.parse(this.getConfidentialiteFin(tef, nnt)).isBefore(LocalDate.now())))
                                &&
                                (LocalDate.parse(this.getEmbargoFin(tef, nnt)).isAfter(LocalDate.now()))
                )
        )
        {
            return TypeAcces.ACCES_ESR;
        }
        return TypeAcces.AUCUN_ACCES;
    }

    private String getRestrictionTemporelleType (Mets tef, String nnt) throws Exception {
        log.info("Récupération de restriction temporelle type ");
        String restrictionTemporelleType;
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
        return restrictionTemporelleType;
    }
    private String getRestrictionTemporelleFin (Mets tef, String nnt) throws Exception {
        log.info("Récupération de restriction temporelle fin ");
        String restrictionTemporelleFin;
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
        return restrictionTemporelleFin;
    }

    private String getEmbargoFin (Mets tef, String nnt) throws Exception {
        log.info("Récupération de embargo fin ");
        String embargoFin;
        try {
            if (!tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst().orElse(null)
                    .getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties().getDiffusion().getEmbargoFin().isEmpty())
                embargoFin = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst().orElse(null)
                        .getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties().getDiffusion().getEmbargoFin();
            else
                throw new Exception("embargo fin est vide");
        } catch (NullPointerException e) {
            log.error("Erreur pour récupérer l'embargo fin de " + nnt + "," + e.getMessage());
            throw e;
        }
        return embargoFin;
    }

    private String getConfidentialiteFin (Mets tef, String nnt) {
        log.info("Récupération de confidentialite fin ");
        String confidentialiteFin;
        try {
            if (!tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst().orElse(null)
                    .getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties().getDiffusion().getConfidentialiteFin().isEmpty())
                confidentialiteFin = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst().orElse(null)
                        .getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties().getDiffusion().getConfidentialiteFin();
            else
                return "confidentialiteVide";
        } catch (NullPointerException e) {
            log.error("Erreur pour récupérer confidentialiteFin de " + nnt + "," + e.getMessage());
            throw e;
        }
        return confidentialiteFin;
    }




}
