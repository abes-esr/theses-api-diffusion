package fr.abes.theses.diffusion.controller;

import fr.abes.theses.diffusion.buttons.*;
import fr.abes.theses.diffusion.database.Anrt;
import fr.abes.theses.diffusion.model.tef.DmdSec;
import fr.abes.theses.diffusion.model.tef.Identifier;
import fr.abes.theses.diffusion.service.Diffusion;
import fr.abes.theses.diffusion.utils.Restriction;
import fr.abes.theses.diffusion.utils.TypeAcces;
import fr.abes.theses.diffusion.database.Service;
import fr.abes.theses.diffusion.database.These;
import fr.abes.theses.diffusion.service.VerificationDroits;
import fr.abes.theses.diffusion.utils.TypeRestriction;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/")
public class BoutonController {

    @Autowired
    VerificationDroits verificationDroits;

    @Autowired
    ChasseLivres chasseLivres;
    @Autowired
    Service service;
    @Autowired
    Diffusion diffusion;

    @Operation(
            summary = "Retourne une liste de boutons permettant l'accès aux fichiers de thèses",
            description = "Les thèses peuvent être disponibles à plusieurs endroits et sous différentes formes, potentiellement être sous accès restreint, les boutons et leurs liens y donnent accès.")
    @ApiResponse(responseCode = "400", description = "Le format du numéro national de thèse fourni est incorrect")
    @ApiResponse(responseCode = "200", description = "Opération terminée avec succès")
    @ApiResponse(responseCode = "500", description = "Service indisponible")
    @GetMapping(value = "button/{nnt}")
    public ResponseEntity<ResponseBoutons> boutons(@PathVariable @Parameter(name = "nnt", description = "Numéro National de Thèse", example = "2013MON30092") String nnt) {

        try {
            if (!service.verifieNnt(nnt)) {
                log.error("nnt incorrect");
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }

            ResponseBoutons responseBoutons = initialiseResponseBoutons();

            These these = service.renvoieThese(nnt);

            Restriction restriction = verificationDroits.getRestrictionsTemporelles(these.getTef(), nnt);

            ajouteBoutonsStar(responseBoutons, restriction, these, nnt);
            ajouteBoutonsSudoc(responseBoutons, restriction, these, nnt);

            return new ResponseEntity<>(responseBoutons, HttpStatus.OK);
        }
        catch (Exception e) {
            log.error(e.toString());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    /**
     * Ajoute les boutons d'accès aux thèses provenant de l'application STAR.
     * Il peut exister plusieurs versions de diffusion de la thèse (complète, incomplète) et cett
     * dernière peut être soumise à des restrictions d'accès, embargo ou confidentialité.
     * @param responseBoutons
     * @param restriction
     * @param these
     * @param nnt
     * @throws Exception
     */
    private void ajouteBoutonsStar (ResponseBoutons responseBoutons, Restriction restriction, These these, String nnt) throws Exception {

        String scenario = verificationDroits.getScenario(these.getTef(), nnt);

        boolean cas1cas2cas3 = scenario.equals("cas1") || scenario.equals("cas2") || scenario.equals("cas3");
        boolean cas1cas2 = scenario.equals("cas1") || scenario.equals("cas2");
        boolean cas3cas4 = scenario.equals("cas3") || scenario.equals("cas4");
        boolean cas5cas6 = scenario.equals("cas5") || scenario.equals("cas6");

        if (cas1cas2
                && restriction.getType().equals(TypeRestriction.AUCUNE)) {

            Bouton bouton = new Bouton();
            bouton.setLibelle("Accès en ligne");
            bouton.setUrl("document/".concat(nnt));
            bouton.setTypeAcces(TypeAcces.ACCES_LIGNE);
            // validé par le jury / dépôt national
            responseBoutons.getCategories().get(0).getSousCategories().get(0).getBoutons().add(bouton);
        }

        /*
        if (cas1cas2
                && restriction.getType().equals(TypeRestriction.EMBARGO)) {

            // bouton acces esr
            Bouton bouton = new Bouton();
            bouton.setLibelle("Accès réservé aux membres de l’enseignement supérieur français");
            bouton.setUrl("document/protected/".concat(nnt));
            bouton.setTypeAcces(TypeAcces.ACCES_ESR);
            // validé par le jury / dépôt national
            responseBoutons.getCategories().get(0).getSousCategories().get(0).getBoutons().add(bouton);

            // ajout du libellé embargo
            Bouton libelleEmbargo = getBoutonLibelle(restriction, nnt, TypeAcces.EMBARGO, "Embargo");
            responseBoutons.getCategories().get(0).getSousCategories().get(0).getBoutons().add(libelleEmbargo);

        }
        */
        if (cas3cas4
                && restriction.getType().equals(TypeRestriction.AUCUNE)) {

            // bouton acces en ligne
            Bouton bouton = new Bouton();
            bouton.setLibelle("Accès en ligne à la version incomplète");
            bouton.setUrl("document/".concat(nnt));
            bouton.setTypeAcces(TypeAcces.ACCES_LIGNE);
            // autres versions
            responseBoutons.getCategories().get(1).getBoutons().add(bouton);

        }

        /*
        if (scenario.equals("cas3") && !restriction.getType().equals(TypeRestriction.CONFIDENTIALITE)) {

            Bouton bouton = new Bouton();
            bouton.setLibelle("Accès réservé aux membres de l’enseignement supérieur français");
            bouton.setUrl("document/protected/".concat(nnt));
            bouton.setTypeAcces(TypeAcces.ACCES_ESR);
            // validé par le jury / dépôt national
            responseBoutons.getCategories().get(0).getSousCategories().get(0).getBoutons().add(bouton);

            if (restriction.getType().equals(TypeRestriction.EMBARGO)) {
                // ajout du libellé embargo
                Bouton libelleEmbargo = getBoutonLibelle(restriction, nnt, TypeAcces.EMBARGO, "Embargo");
                responseBoutons.getCategories().get(0).getSousCategories().get(0).getBoutons().add(libelleEmbargo);
            }

        }
        */
        if (scenario.equals("cas4")
                && !restriction.getType().equals(TypeRestriction.CONFIDENTIALITE)
                && diffusion.diffusionEtablissementIntranet(these.getTef())) {

            // bouton acces intranet établissement
            Bouton bouton = new Bouton();
            bouton.setLibelle("Accès Intranet Etablissement");
            bouton.setUrl("document/intranetEtab/".concat(nnt));
            bouton.setTypeAcces(TypeAcces.ACCES_ESR);
            // validé par le jury / dépôt national
            responseBoutons.getCategories().get(0).getSousCategories().get(0).getBoutons().add(bouton);

        }

        if (scenario.equals("cas4") && restriction.getType().equals(TypeRestriction.EMBARGO)) {

            // ajout du libellé embargo
            Bouton libelleEmbargo = getBoutonLibelle(restriction, nnt, TypeAcces.EMBARGO, "Embargo");
            responseBoutons.getCategories().get(0).getSousCategories().get(0).getBoutons().add(libelleEmbargo);

        }

        /*
        if (scenario.equals("cas5")
                && !restriction.getType().equals(TypeRestriction.CONFIDENTIALITE)) {

            // bouton acces esr
            Bouton bouton = new Bouton();
            bouton.setLibelle("Accès réservé aux membres de l’enseignement supérieur français");
            bouton.setUrl("document/protected/".concat(nnt));
            bouton.setTypeAcces(TypeAcces.ACCES_ESR);
            // validé par le jury / dépôt national
            responseBoutons.getCategories().get(0).getSousCategories().get(0).getBoutons().add(bouton);

        }
        */

        if (scenario.equals("cas6")
                && !restriction.getType().equals(TypeRestriction.CONFIDENTIALITE)
                && diffusion.diffusionEtablissementAvecUneSeuleUrl(these.getTef(), nnt)) {

            Bouton bouton = new Bouton();
            bouton.setLibelle("Accès Intranet Etablissement");
            bouton.setUrl("document/intranetEtab/".concat(nnt));
            bouton.setTypeAcces(TypeAcces.ACCES_ESR);
            // validé par le jury / dépôt national
            responseBoutons.getCategories().get(0).getSousCategories().get(0).getBoutons().add(bouton);

        }


        if ((cas1cas2cas3 || scenario.equals("cas4") || cas5cas6)
                && restriction.getType().equals(TypeRestriction.CONFIDENTIALITE)) {

            // ajout du libelle confidentialite
            Bouton libelleConfidentialite = getBoutonLibelle(restriction, nnt, TypeAcces.CONFIDENTIALITE, "Confidentialite");
            // validé par le jury / dépôt national
            responseBoutons.getCategories().get(0).getSousCategories().get(0).getBoutons().add(libelleConfidentialite);

        }
    }

    /**
     * Ajoute les boutons d'accès aux thèses provenant du Sudoc.
     * Elles peuvent être disponibles directement en bibliothèque, sous différentes formes : papier, microfiche...
     * @param responseBoutons
     * @param restriction
     * @param these
     * @param nnt
     */
    private void ajouteBoutonsSudoc (ResponseBoutons responseBoutons, Restriction restriction, These these, String nnt) {
        Iterator<DmdSec> iterator = these.getTef().getDmdSec().iterator();
        while (iterator.hasNext()) {

            DmdSec dmdSec = iterator.next();

            if (!restriction.getType().equals(TypeRestriction.CONFIDENTIALITE)
            && dmdSec.getID().contains("EDITION_DEPOT_NATIONAL")) {
                Bouton bouton = new Bouton();
                bouton.setLibelle("Accès en bibliothèque");
                bouton.setUrl(recupereUrlSudoc(dmdSec));
                bouton.setTypeAcces(TypeAcces.SUDOC);
                // validé par le jury / dépôt national
                responseBoutons.getCategories().get(0).getSousCategories().get(0).getBoutons().add(bouton);
            }

            if (dmdSec.getID().contains("EDITION_AO")) {
                Bouton bouton = new Bouton();
                bouton.setLibelle("Accès en ligne");
                bouton.setUrl(recupereUrlNonSudoc(dmdSec));
                bouton.setTypeAcces(TypeAcces.SUDOC);
                // validé par le jury / reproduction conforme
                responseBoutons.getCategories().get(0).getSousCategories().get(1).getBoutons().add(bouton);
            }

            if (dmdSec.getID().contains("EDITION_REPRO_PAPIER")) {
                Bouton bouton = new Bouton();
                bouton.setLibelle("Accès en bibliothèque à une copie imprimée");
                bouton.setUrl(recupereUrlSudoc(dmdSec));
                bouton.setTypeAcces(TypeAcces.SUDOC);
                // validé par le jury / reproduction conforme
                responseBoutons.getCategories().get(0).getSousCategories().get(1).getBoutons().add(bouton);
            }

            if (dmdSec.getID().contains("EDITION_MICROFICHE")) {
                Bouton bouton = new Bouton();
                bouton.setLibelle("Accès en bibliothèque à une copie sur microfiches de la thèse");
                bouton.setUrl(recupereUrlSudoc(dmdSec));
                bouton.setTypeAcces(TypeAcces.SUDOC);
                // validé par le jury / reproduction conforme
                responseBoutons.getCategories().get(0).getSousCategories().get(1).getBoutons().add(bouton);
            }

            if (dmdSec.getID().contains("EDITION_COM_ELEC")) {
                Bouton bouton = new Bouton();
                bouton.setLibelle("Accès en ligne à une version remaniée par l'auteur");
                bouton.setUrl(recupereUrlNonSudoc(dmdSec));
                bouton.setTypeAcces(TypeAcces.SUDOC);
                // autres versions
                responseBoutons.getCategories().get(1).getBoutons().add(bouton);
            }

            if (dmdSec.getID().contains("EDITION_COM_PAPIER_1")) {
                Bouton bouton = new Bouton();
                bouton.setLibelle("Accès en bibliothèque à la version publiée chez un éditeur");
                bouton.setUrl(recupereUrlSudoc(dmdSec));
                bouton.setTypeAcces(TypeAcces.SUDOC);
                // autres versions
                responseBoutons.getCategories().get(1).getBoutons().add(bouton);

                if (dmdSec.getMdWrap().getXmlData().getEdition().getISBN() != null
                && !dmdSec.getMdWrap().getXmlData().getEdition().getISBN().isEmpty()) {

                    try {
                        BoutonChasseLivres boutonChasseLivres = new BoutonChasseLivres();
                        chasseLivres.configureBouton(boutonChasseLivres, dmdSec.getMdWrap().getXmlData().getEdition().getISBN(), nnt);
                        boutonChasseLivres.setLibelle("Achat en ligne");
                        boutonChasseLivres.setTypeAcces(TypeAcces.SUDOC);
                        // autres versions
                        responseBoutons.getCategories().get(1).getBoutons().add(boutonChasseLivres);
                    }
                    catch (Exception e) {
                        log.error("erreur lors de la configuration du bouton chasse aux livres pour " + nnt);
                    }
                }
            }
        }

        Anrt anrt = service.findAnrtByNnt(nnt);
        if (anrt != null) {
            Bouton bouton = new Bouton();
            bouton.setLibelle("Achat d'une impression à l'ANRT");
            bouton.setUrl(anrt.getUrl());
            bouton.setTypeAcces(TypeAcces.SUDOC);
            // autres versions
            responseBoutons.getCategories().get(1).getBoutons().add(bouton);
        }
    }

    /**
     * parcourt les identifier et renvoie la première url trouvée contenant la chaine sudoc.fr
     * @param dmdSec
     * @return
     */
    private String recupereUrlSudoc(DmdSec dmdSec) {

       Iterator<Identifier> iteratorIdentifier;
       iteratorIdentifier = dmdSec.getMdWrap().getXmlData().getEdition().getIdentifier().iterator();
        String urlSudoc = "";
        while (iteratorIdentifier.hasNext()) {
            Identifier identifier = iteratorIdentifier.next();
            if (estUrlSudoc(identifier.getValue().trim())) {
                urlSudoc = identifier.getValue().trim();
                break;
            }
        }
        return urlSudoc;
    }

    /**
     * parcourt les identifier et renvoie la première url trouvée ne contenant pas la chaine sudoc.fr
     * @param dmdSec
     * @return
     */
    private String recupereUrlNonSudoc(DmdSec dmdSec) {

        Iterator<Identifier> iteratorIdentifier;
        iteratorIdentifier = dmdSec.getMdWrap().getXmlData().getEdition().getIdentifier().iterator();
        String urlNonSudoc = "";
        while (iteratorIdentifier.hasNext()) {
            Identifier identifier = iteratorIdentifier.next();
            if (!estUrlSudoc(identifier.getValue().trim())) {
                urlNonSudoc = identifier.getValue().trim();
                break;
            }
        }
        return urlNonSudoc;
    }
    private boolean estUrlSudoc(String identifier) {
        if (identifier.contains("sudoc.fr"))
            return true;
        return false;
    }

    private ResponseBoutons initialiseResponseBoutons() {
        ResponseBoutons responseBoutons = new ResponseBoutons();

        Categorie valideParLeJury = new Categorie();
        valideParLeJury.setLibelle("Validé par le jury");
        Categorie autresVersions = new Categorie();
        autresVersions.setLibelle("Autres versions");
        SousCategorie depotNational = new SousCategorie();
        depotNational.setLibelle("Dépôt national");
        SousCategorie reproductionConforme = new SousCategorie();
        reproductionConforme.setLibelle("Reproduction(s) conforme(s)");

        List<SousCategorie> sousCategories = new ArrayList<>();
        sousCategories.add(depotNational);
        sousCategories.add(reproductionConforme);
        valideParLeJury.setSousCategories(sousCategories);

        List<Categorie> categories = new ArrayList<>();
        categories.add(valideParLeJury);
        categories.add(autresVersions);
        responseBoutons.setCategories(categories);

        List<Bouton> btnDepotNational = new ArrayList<>();
        List<Bouton> btnReproductionConforme = new ArrayList<>();
        List<Bouton> btnAutresVersions = new ArrayList<>();

        depotNational.setBoutons(btnDepotNational);
        reproductionConforme.setBoutons(btnReproductionConforme);
        autresVersions.setBoutons(btnAutresVersions);

        return responseBoutons;
    }

    private Bouton getBoutonLibelle(Restriction restriction, String nnt, TypeAcces typeAcces, String libelle) throws Exception {
        Bouton btnLibelle = new Bouton();
        btnLibelle.setLibelle(libelle);
        SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = inputFormatter.parse(restriction.getDateFin());
        } catch (ParseException e) {
            log.error("impossible de parser " + restriction.getDateFin() + " pour " + nnt);
            throw e;
        }
        SimpleDateFormat outputFormatter = new SimpleDateFormat("dd-MM-yyyy");
        btnLibelle.setDateFin(outputFormatter.format(date));
        btnLibelle.setTypeAcces(typeAcces);
        return btnLibelle;
    }
}
