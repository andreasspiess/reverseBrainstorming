package com.example.reverseBrainstorming;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NegativRowMapper implements RowMapper <NegativForm> {

    @Override
    public NegativForm mapRow(ResultSet rs, int rowNum) throws SQLException {
        NegativForm result = new NegativForm();
        result.setId(rs.getInt("id"));
        result.setNegativ(rs.getString("description"));
        result.setNegativ_id(rs.getInt("positiv_id"));

        return result;
    }
}
