/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author student
 */
public class TestJdbcTemplate {

    public static void main(String[] args) throws SQLException {
        
        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample",
                    "app",
                    "app")) {
       
            JdbcTemplate<Customer> jdbc = new JdbcTemplate<>();
            
            int id = 1;
            
            Customer res = jdbc.load(connection, "select * from customer where customer_id = ?", 1, new RowMapper<Customer>() {
                
                @Override
                public Customer mapRow(ResultSet rs) throws SQLException{
                    Customer c = new Customer();
                    c.setName(rs.getString("name"));
                    c.setId(rs.getInt("customer_id"));
                    return c;
                }
            });
            
            System.out.println(res);
            
        }    
        
    }
    
}
