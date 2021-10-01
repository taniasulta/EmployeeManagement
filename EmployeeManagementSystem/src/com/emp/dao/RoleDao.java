/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.dao;

import com.emp.common.IUserDao;
import com.emp.model.Role;
import com.emp.model.User;
import com.emp.util.DBConnectin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author Tania
 */
public class RoleDao implements IUserDao<Role>{
     Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public int save(Role t) {
        try {
              
            
            String sql = "insert into role (code, name, dec) values(?,?,?)";
            con = DBConnectin.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getRole_code());
            ps.setString(2, t.getRole_name());
            ps.setString(3, t.getRole_desc());
            int status = ps.executeUpdate();
              
            con.close();
            return status;
        } catch (Exception e) {
            return 0;
       
    }
    }

    @Override
    public int login(User l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Role getByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Role t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
