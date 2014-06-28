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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Main {
    
    public static void main(String[] args)  {
        
        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample",
                    "app",
                    "app")) {
            
            Iterable<Customer> cust = loadAllCustomers(connection);
            System.out.println(cust);
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static Iterable<Customer> loadAllCustomers(Connection connection) throws SQLException {
        
        List<Customer> res = new ArrayList<>();
        
        Statement stmt = connection.createStatement();
        
        try (ResultSet rs = stmt.executeQuery("select * from customer")) {
            while(rs.next()) {
                Customer c = new Customer();
                c.setId(rs.getInt("customer_id"));
                c.setName(rs.getString("name"));
                res.add(c);
            }
        }
        return res;
    }
    
    public static Customer loadById() {
        
        return null;
    }
    
}
