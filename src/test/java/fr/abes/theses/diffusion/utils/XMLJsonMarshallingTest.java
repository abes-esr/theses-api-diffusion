package fr.abes.theses.diffusion.utils;

import fr.abes.theses.diffusion.model.tef.Mets;
import fr.abes.theses.diffusion.service.VerificationDroits;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;

class XMLJsonMarshallingTest {

    private final XMLJsonMarshalling marshalling = new XMLJsonMarshalling();
    private final VerificationDroits verificationDroits = new VerificationDroits();

    @Test
    void chargerMets_parseTefAvecStarGestion() throws Exception {
        try (InputStream tef = getClass().getResourceAsStream("/tef/tef_with_rcr.xml")) {
            Mets mets = marshalling.chargerMets(tef);

            assertNotNull(mets.getMetsHdr());
            assertFalse(mets.getDmdSec().isEmpty());
            assertNotNull(mets.getStructMap());
            assertEquals("logical", mets.getStructMap().getTYPE());

            String scenario = verificationDroits.getScenario(mets, "2010ABCD0097");
            assertEquals("cas1", scenario);

            var starGestion = mets.getDmdSec().stream()
                    .filter(d -> d.getMdWrap().getXmlData().getStarGestion() != null)
                    .findFirst()
                    .orElseThrow()
                    .getMdWrap()
                    .getXmlData()
                    .getStarGestion();

            assertEquals("cas1", starGestion.getTraitements().getScenario());
            assertEquals("sansObjet",
                    starGestion.getTraitements().getSorties().getDiffusion().getRestrictionTemporelleType());
            assertEquals("oui",
                    starGestion.getTraitements().getSorties().getDiffusion().getEtabDiffuseur().getEtabDiffuseurPolEtablissement());
        }
    }
}
