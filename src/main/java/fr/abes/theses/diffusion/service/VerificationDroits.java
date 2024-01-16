package fr.abes.theses.diffusion.service;

import fr.abes.theses.diffusion.model.tef.DmdSec;
import fr.abes.theses.diffusion.model.tef.Mets;
import fr.abes.theses.diffusion.utils.Restriction;
import fr.abes.theses.diffusion.utils.TypeRestriction;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
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
    public Restriction getRestrictionsTemporelles(Mets tef, String nnt) throws Exception {

        Restriction restriction = new Restriction();
        String restrictionTemporelleType = this.getRestrictionTemporelleType(tef, nnt);
        boolean restrictionTemporelleExiste = restrictionTemporelleType.equals("embargo")
                || restrictionTemporelleType.equals("confidentialite")
                || restrictionTemporelleType.equals("confEmbargo");

        // pas de restriction temporelle ou restriction temporelle est passée
        if (restrictionTemporelleType.equals("sansObjet") || (restrictionTemporelleExiste
                && (LocalDate.parse(this.getRestrictionTemporelleFin(tef, nnt)).isBefore(LocalDate.now())))) {
            restriction.setType(TypeRestriction.AUCUNE);
            return restriction;
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
            restriction.setType(TypeRestriction.EMBARGO);
            restriction.setDateFin(this.getEmbargoFin(tef, nnt));
            return restriction;
        }
        restriction.setType(TypeRestriction.CONFIDENTIALITE);
        restriction.setDateFin(this.getConfidentialiteFin(tef, nnt));
        return restriction;
    }

    /**
     * retourne la restriction temporelle si elle existe, chaine vide si le champ est absent du tef ou vide
     * @param tef
     * @param nnt
     * @return
     */
    private String getRestrictionTemporelleType (Mets tef, String nnt) {
        log.debug("Récupération de restriction temporelle type ");
        String restrictionTemporelleType = "sansObjet";
        try {
            if (!tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst().orElse(null)
                    .getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties().getDiffusion().getRestrictionTemporelleType().isEmpty())
                restrictionTemporelleType = tef.getDmdSec().stream().filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null).findFirst().orElse(null)
                        .getMdWrap().getXmlData().getStarGestion().getTraitements().getSorties().getDiffusion().getRestrictionTemporelleType();

        } catch (NullPointerException e) {
            log.error("Erreur pour récupérer la restriction temporelle type de " + nnt + "," + e.getMessage());
        }
        return restrictionTemporelleType;
    }
    private String getRestrictionTemporelleFin (Mets tef, String nnt) throws Exception {
        log.debug("Récupération de restriction temporelle fin ");
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
        log.debug("Récupération de embargo fin ");
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
        log.debug("Récupération de confidentialite fin ");
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
