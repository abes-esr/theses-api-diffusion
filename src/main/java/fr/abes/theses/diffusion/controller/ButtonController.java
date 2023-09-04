package fr.abes.theses.diffusion.controller;

import fr.abes.theses.diffusion.buttons.Button;
import fr.abes.theses.diffusion.service.Diffusion;
import fr.abes.theses.diffusion.utils.Restriction;
import fr.abes.theses.diffusion.utils.TypeAcces;
import fr.abes.theses.diffusion.buttons.ResponseButtons;
import fr.abes.theses.diffusion.database.Service;
import fr.abes.theses.diffusion.database.These;
import fr.abes.theses.diffusion.service.VerificationDroits;
import fr.abes.theses.diffusion.utils.TypeRestriction;
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
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/")
public class ButtonController {

    @Autowired
    VerificationDroits verificationDroits;

    @Autowired
    Service service;
    @Autowired
    Diffusion diffusion;

    @GetMapping(value = "button/{nnt}")
    public ResponseEntity<ResponseButtons> buttons(@PathVariable String nnt) throws Exception {

        try {
            ResponseButtons responseButtons = new ResponseButtons();
            List<Button> buttonList = new ArrayList<>();
            responseButtons.setButtons(buttonList);

            These these = service.renvoieThese(nnt);
            String scenario = verificationDroits.getScenario(these.getTef(), nnt);
            Restriction restriction = verificationDroits.restrictionsTemporelles(these.getTef(), nnt);

            boolean cas1cas2cas3 = scenario.equals("cas1") || scenario.equals("cas2") || scenario.equals("cas3");
            boolean cas1cas2 = scenario.equals("cas1") || scenario.equals("cas2");
            boolean cas3cas4 = scenario.equals("cas3") || scenario.equals("cas4");
            boolean cas5cas6 = scenario.equals("cas5") || scenario.equals("cas6");

            if (cas1cas2
                    && restriction.getType().equals(TypeRestriction.AUCUNE)) {

                Button button = new Button();
                button.setLibelle("Accès en ligne");
                button.setUrl("document/".concat(service.verifieNnt(nnt)));
                button.setTypeAcces(TypeAcces.ACCES_LIGNE);
                buttonList.add(button);

            }

            if (cas1cas2
                    && restriction.getType().equals(TypeRestriction.EMBARGO)) {

                // bouton acces esr
                Button button = new Button();
                button.setLibelle("Accès ESR");
                button.setUrl("document/protected/".concat(service.verifieNnt(nnt)));
                button.setTypeAcces(TypeAcces.ACCES_ESR);
                buttonList.add(button);

                getButtonLibelle(buttonList, restriction);

            }

            if (cas3cas4
                    && restriction.getType().equals(TypeRestriction.AUCUNE)) {

                // bouton acces en ligne
                Button button = new Button();
                button.setLibelle("Accès en ligne à la version incomplète");
                button.setUrl("document/".concat(service.verifieNnt(nnt)));
                button.setTypeAcces(TypeAcces.ACCES_LIGNE);
                buttonList.add(button);

            }

            if (scenario.equals("cas3")) {

                Button button = new Button();
                button.setLibelle("Accès Intranet Etablissement");
                button.setUrl("document/protected/".concat(service.verifieNnt(nnt)));
                button.setTypeAcces(TypeAcces.ACCES_ESR);
                buttonList.add(button);

                if (restriction.getType().equals(TypeRestriction.EMBARGO)) {
                    getButtonLibelle(buttonList, restriction);
                }

            }

            if (scenario.equals("cas4") && diffusion.diffusionEtablissementIntranet(these.getTef(), nnt, null, true)) {

                // bouton acces intranet établissement
                Button button = new Button();
                button.setLibelle("Accès Intranet Etablissement");
                button.setUrl("document/intranetEtab/".concat(service.verifieNnt(nnt)));
                button.setTypeAcces(TypeAcces.ACCES_ESR);
                buttonList.add(button);

            }

            if (scenario.equals("cas4") && restriction.getType().equals(TypeRestriction.EMBARGO)) {

                getButtonLibelle(buttonList, restriction);

            }

            if (scenario.equals("cas5")
                    && !restriction.getType().equals(TypeRestriction.CONFIDENTIALITE)) {

                // bouton acces esr
                Button button = new Button();
                button.setLibelle("Accès ESR");
                button.setUrl("document/protected/".concat(service.verifieNnt(nnt)));
                button.setTypeAcces(TypeAcces.ACCES_ESR);
                buttonList.add(button);

            }


            if (scenario.equals("cas6")
                    && !restriction.getType().equals(TypeRestriction.CONFIDENTIALITE)
                    && diffusion.diffusionEtablissementIntranet(these.getTef(), nnt, null, true)) {

                Button button = new Button();
                button.setLibelle("Accès Intranet Etablissement");
                button.setUrl("document/intranetEtab/".concat(service.verifieNnt(nnt)));
                button.setTypeAcces(TypeAcces.ACCES_ESR);
                buttonList.add(button);

            }


            if ((cas1cas2cas3 || scenario.equals("cas4") || cas5cas6)
                    && restriction.getType().equals(TypeRestriction.CONFIDENTIALITE)) {

                // libelle confidentialite
                Button button = new Button();
                button.setLibelle("Confidentialité");
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
                SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
                Date date = inputFormatter.parse(restriction.getDateFin());
                SimpleDateFormat outputFormatter = new SimpleDateFormat("dd-MM-yyyy");
                button.setDateFin(outputFormatter.format(date));
                button.setTypeAcces(TypeAcces.CONFIDENTIALITE);
                buttonList.add(button);

            }

            return new ResponseEntity<>(responseButtons, HttpStatus.OK);
        }
        catch (Exception e) {
            log.error(e.toString());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    private void getButtonLibelle(List<Button> buttonList, Restriction restriction) throws ParseException {
        Button libelleEmbargo = new Button();
        libelleEmbargo.setLibelle("Embargo");
        SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = inputFormatter.parse(restriction.getDateFin());
        SimpleDateFormat outputFormatter = new SimpleDateFormat("dd-MM-yyyy");
        libelleEmbargo.setDateFin(outputFormatter.format(date));
        libelleEmbargo.setTypeAcces(TypeAcces.EMBARGO);
        buttonList.add(libelleEmbargo);
    }
}
