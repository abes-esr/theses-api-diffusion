package fr.abes.theses.diffusion.controller;

import fr.abes.theses.diffusion.buttons.Button;
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

    @GetMapping(value = "button/{nnt}")
    public ResponseEntity<ResponseButtons> buttons(@PathVariable String nnt) throws Exception {

        try {
            ResponseButtons responseButtons = new ResponseButtons();
            List<Button> buttonList = new ArrayList<>();
            responseButtons.setButtons(buttonList);

            These these = service.renvoieThese(nnt);
            String scenario = verificationDroits.getScenario(these.getTef(), nnt);
            Restriction restriction = verificationDroits.restrictionsTemporelles(these.getTef(), nnt);

            // Acces en ligne
            boolean cas1cas2cas3cas4 = scenario.equals("cas1") || scenario.equals("cas2") || scenario.equals("cas3") || scenario.equals("cas4");
            boolean cas1cas2 = scenario.equals("cas1") || scenario.equals("cas2");
            boolean cas3cas4 = scenario.equals("cas3") || scenario.equals("cas4");
            boolean cas5cas6 = scenario.equals("cas5") || scenario.equals("cas6");

            if (cas1cas2
                    && restriction.getType().equals(TypeRestriction.AUCUNE)) {

                // bouton acces en ligne
                Button button = new Button();
                button.setLibelle("Accès en ligne");
                button.setUrl("document/".concat(service.verifieNnt(nnt)));
                button.setTypeAcces(TypeAcces.ACCES_LIGNE);
                buttonList.add(button);

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

            // Acces ESR : embargo
            if (cas1cas2cas3cas4
                    && restriction.getType().equals(TypeRestriction.EMBARGO)) {

                // bouton acces esr
                Button button = new Button();
                button.setLibelle("Accès ESR");
                button.setUrl("document/protected/".concat(service.verifieNnt(nnt)));
                button.setTypeAcces(TypeAcces.ACCES_ESR);
                buttonList.add(button);

                // libellé embargo
                Button button2 = new Button();
                button2.setLibelle("Embargo");
                SimpleDateFormat inputFormatter = new SimpleDateFormat("yyyy-MM-dd");
                Date date = inputFormatter.parse(restriction.getDateFin());
                SimpleDateFormat outputFormatter = new SimpleDateFormat("dd-MM-yyyy");
                button2.setDateFin(outputFormatter.format(date));
                button2.setTypeAcces(TypeAcces.EMBARGO);
                buttonList.add(button2);

            }

            // Acces ESR
            if (cas5cas6
                    && !restriction.getType().equals(TypeRestriction.CONFIDENTIALITE)) {

                // bouton acces esr
                Button button = new Button();
                button.setLibelle("Accès ESR");
                button.setUrl("document/protected/".concat(service.verifieNnt(nnt)));
                button.setTypeAcces(TypeAcces.ACCES_ESR);
                buttonList.add(button);

            }

            // Confidentialité

            if ((cas1cas2cas3cas4 || cas5cas6)
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
}
