/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author student
 */
public class JdbcTemplate<T> {
    
    T load(Connection connection, String sql, RowMapper<T> rowMapper) {
        
        try {
            Statement stmt = connection.createStatement();

            try (ResultSet rs = stmt.executeQuery(sql)) {
                rs.next();
                return rowMapper.mapRow(rs);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    Iterable<T> loadAll(String sql, RowMapper<T> rowMapper) {
        
        return null;
    }
    
    
    
}
