package fr.abes.theses.diffusion.database;

import org.springframework.beans.factory.annotation.Autowired;
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
        nnt = this.verifieNnt(nnt);
        These these = this.findTheseByNnt(nnt);
        these.initTef();
        return these;
    }
    public String verifieNnt(String nnt) throws Exception {
        nnt = nnt.toUpperCase();
        if (nnt.length()!=12)
            throw new Exception("erreur sur la longueur du nnt");
        return nnt;
    }

}
