/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author student
 */
public class JdbcTemplate<T> {
    
    T load(Connection connection, String sql, int id, RowMapper<T> rowMapper) {
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            
            stmt.execute();
            
            try (ResultSet rs = stmt.getResultSet()) {
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
