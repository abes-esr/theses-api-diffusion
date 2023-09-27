package fr.abes.theses.diffusion.buttons;

import fr.abes.theses.diffusion.utils.TypeAcces;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bouton {
    String libelle;
    String url;
    String dateFin; // fin d'embargo ou fin de confidentialité, vide sinon
    TypeAcces typeAcces;
}
