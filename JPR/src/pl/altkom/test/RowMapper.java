/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.test;

import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author student
 */
public interface RowMapper<T> {
    
    T mapRow(ResultSet rs) throws SQLException ;
    
}
