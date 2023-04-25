package fr.abes.theses.diffusion.database;


import fr.abes.theses.diffusion.utils.XMLJsonMarshalling;
import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.OracleResultSet;
import oracle.xdb.XMLType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

@Slf4j
public class TheseRowMapper implements RowMapper<These> {

    @Override
    public These mapRow(ResultSet rs, int rowNum) throws SQLException {

        try {
            These these = new These(new XMLJsonMarshalling());
            OracleResultSet rsOra = (OracleResultSet) rs;

            these.setIps(rsOra.getString("ip"));
            these.setDoc(XMLType.createXML(rsOra.getOPAQUE("doc")).getStringVal());

            return these;

        }
        catch (NullPointerException e) {
            log.error("dans TheseRowMapper : " + e.toString());
            return null;
        }
    }

}
