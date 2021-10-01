/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tania Aktar
 */
public class DBConnectin {
     public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_management", "root", "1234");
            return con;
            
        } catch (Exception e) {
            return null;
        }
    }
    
}
