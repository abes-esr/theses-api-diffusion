package fr.abes.theses.diffusion.buttons;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Categorie {

    private String libelle;
    private List<SousCategorie> sousCategories;
    private List<Bouton> boutons;
}
