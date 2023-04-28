package fr.abes.theses.diffusion.controller;

import fr.abes.theses.diffusion.buttons.Button;
import fr.abes.theses.diffusion.buttons.ButtonType;
import fr.abes.theses.diffusion.buttons.ResponseButtons;
import fr.abes.theses.diffusion.database.These;
import fr.abes.theses.diffusion.service.VerificationDroits;
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

    @GetMapping(value = "button/{nnt}")
    public ResponseButtons buttons(@PathVariable String nnt) throws Exception {

        ResponseButtons responseButtons = new ResponseButtons();
        List<Button> buttonList = new ArrayList<>();
        responseButtons.setButtons(buttonList);

        These these = verificationDroits.renvoieThese(nnt);
        String scenario = verificationDroits.getScenario(these.getTef(), nnt);

        if ((scenario.equals("cas1") || scenario.equals("cas2"))
                && verificationDroits.restrictionsTemporellesOkPourAccesEnLigne(these.getTef(), nnt)) {

            Button button = new Button();
            button.setLibelle("Accès en ligne");
            button.setUrl("/document/".concat(verificationDroits.verifieNnt(nnt)));
            button.setButtonType(ButtonType.ACCES_LIGNE);
            buttonList.add(button);

        }
        return responseButtons;
    }
}
