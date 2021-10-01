/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.dao;

import com.emp.common.IUserDao;
import com.emp.model.Employee;
import com.emp.model.User;
import com.emp.util.DBConnectin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;


public class EmpDao implements IUserDao<User>{
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    @Override
    public int save(User t) {
       try {
              
            
            String sql = "insert into users (code, name, address, username, password, email, mobile) values(?,?,?,?,?,?)";
            con = DBConnectin.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getCode());
            ps.setString(2, t.getName());
            ps.setString(3, t.getAddress());
            ps.setString(4, t.getUsername());
            ps.setString(5, t.getPassword());
            ps.setString(6, t.getRole_code());
            int status = ps.executeUpdate();
              
            con.close();
            return status;
        } catch (Exception e) {
            return 0;
    }
    
}

   

    @Override
    public int login(User l) {
        try {
            String sql = "select* from employees where username = ? and password = ? and role_name = ?";
            con = DBConnectin.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, l.getUsername());
            ps.setString(2, l.getPassword());
            ps.setString(3, l.getRole_code());
            rs = ps.executeQuery();
            System.out.println("Hello");
            if (rs.next()) {
                return 1;
                
            }else{
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public User getByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(User t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int saveAttendence(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
