package fr.abes.theses.diffusion.buttons;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class SousCategorie {

    private String libelle;
    private List<Bouton> boutons;
}
