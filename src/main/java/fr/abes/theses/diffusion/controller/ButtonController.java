package fr.abes.theses.diffusion.controller;

import fr.abes.theses.diffusion.buttons.Button;
import fr.abes.theses.diffusion.buttons.ButtonType;
import fr.abes.theses.diffusion.buttons.ResponseButtons;
import fr.abes.theses.diffusion.database.Service;
import fr.abes.theses.diffusion.database.These;
import fr.abes.theses.diffusion.service.VerificationDroits;
import fr.abes.theses.diffusion.utils.TypeAcces;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

            if ((scenario.equals("cas1") || scenario.equals("cas2"))
                    && verificationDroits.restrictionsTemporelles(these.getTef(), nnt).equals(TypeAcces.ACCES_EN_LIGNE)) {

                Button button = new Button();
                button.setLibelle("Accès en ligne");
                button.setUrl("/document/".concat(service.verifieNnt(nnt)));
                button.setButtonType(ButtonType.ACCES_LIGNE);
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
