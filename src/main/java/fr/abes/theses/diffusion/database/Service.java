package fr.abes.theses.diffusion.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class Service {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private These findTheseByNnt (String nnt) {
        String sql = "select d.doc, e.IP from PORTAIL.document d, PORTAIL.etablissement e where d.nnt=? and d.codeetab=e.code(+)";
        return jdbcTemplate.queryForObject(sql, new TheseRowMapper(), nnt);
    }

    public Anrt findAnrtByNnt (String nnt) {
        try {
            String sql = "select distinct(url) from ANRT_CORRESP where nnt=?";
            return jdbcTemplate.queryForObject(sql, new AnrtRowMapper(), nnt);
        }
        catch (EmptyResultDataAccessException e) {
            return null;
        }
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

        String regex = "[1-2][0-9][0-9][0-9][A-Z][A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(nnt);
        return m.matches();
    }

}
