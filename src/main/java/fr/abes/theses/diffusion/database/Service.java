package fr.abes.theses.diffusion.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Service {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public These findTheseByNnt (String nnt) {
        String sql = "select d.doc, e.IP from PORTAIL.document d, PORTAIL.etablissement e where d.nnt=? and d.codeetab=e.code(+)";
        return jdbcTemplate.queryForObject(sql, new TheseRowMapper(), nnt);
    }
}
