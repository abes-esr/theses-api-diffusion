package fr.abes.theses.diffusion.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Service {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private These findTheseByNnt (String nnt) {
        String sql = "select d.doc, e.IP from PORTAIL.document d, PORTAIL.etablissement e where d.nnt=? and d.codeetab=e.code(+)";
        return jdbcTemplate.queryForObject(sql, new TheseRowMapper(), nnt);
    }

    public These renvoieThese(String nnt) throws Exception {
        if (!verifieNnt(nnt)) {
            throw new Exception("nnt incorrect");
        }
        These these = this.findTheseByNnt(nnt);
        these.initTef();
        return these;
    }
    public Boolean verifieNnt(String nnt) throws Exception {
        // TODO: 27/09/2023 renforcer la vérification du nnt
        nnt = nnt.toUpperCase();
        if (nnt.length()!=12)
            return false;
        return true;
    }

}
