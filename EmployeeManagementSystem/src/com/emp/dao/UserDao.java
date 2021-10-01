/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.dao;

import com.emp.common.IUserDao;
import com.emp.model.Employee;
import com.emp.model.User;
import com.emp.model.Role;
import com.emp.util.DBConnectin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Tania Aktar
 */
public class UserDao implements IUserDao<User> {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    public int login(User l) {
        try {
            String sql = "select* from users where username = ? and password = ?";
            con = DBConnectin.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, l.getUsername());
            ps.setString(2, l.getPassword());
            rs = ps.executeQuery();
            System.out.println("Hello");
            if (rs.next()) {
                return 1;

            } else {
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int save(User t) {
        int status = -1;
        try {
            String sql = "insert into users (name, address, email, phone_number, username, password) values(?,?,?,?,?,?)";
            con = DBConnectin.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getAddress());
            ps.setString(3, t.getEmail());
            ps.setString(4, t.getMobile());
            ps.setString(5, t.getUsername());
            ps.setString(6, t.getPassword());

            status = ps.executeUpdate();
            System.out.println("Hell");

            con.close();
            return status;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
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
