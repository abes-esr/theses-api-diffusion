package fr.abes.theses.diffusion.database;

import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.OracleResultSet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Slf4j
public class AnrtRowMapper implements RowMapper<Anrt> {

    @Override
    public Anrt mapRow(ResultSet rs, int rowNum) throws SQLException {

        try {
            Anrt anrt = new Anrt();
            OracleResultSet rsOra = (OracleResultSet) rs;

            anrt.setUrl(rsOra.getString("url"));

            return anrt;

        }
        catch (NullPointerException e) {
            log.error("dans AnrtRowMapper : " + e.toString());
            return null;
        }
    }

}
