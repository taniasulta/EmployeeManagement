/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.dao;

import com.emp.common.IUserDao;
import com.emp.model.Branch;
import com.emp.model.Employee;
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
public class BranchDao implements IUserDao<Branch> {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public int save(Branch b) {
        try {
          
            
            String sql = "insert into branch(branch_code, branch_name, branch_location, department_name) values(?,?,?,?)";
            con = DBConnectin.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, b.getBranch_code());
            ps.setString(2, b.getBranch_name());
            ps.setString(3, b.getBranch_location());
            ps.setString(4, b.getDep_name());
           int status = ps.executeUpdate();
           System.out.println("Hello");
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
    public Branch getByCode(String code) {
        Branch b = new Branch();
        try {
            String sql = "select * from branch where branch_code = '"+code+"' ";
            con = DBConnectin.getConnection();
            ps = con.prepareStatement(sql);
            rs= ps.executeQuery();
            while(rs.next()){
                b.setBranch_code(rs.getString("branch_code"));
                b.setBranch_name(rs.getString("branch_name"));
                b.setBranch_location(rs.getString("branch_location"));
                b.setDep_name("department_name");
            }
            con.close();
        } catch (Exception e) {
        }
        return b;
    }

    @Override
    public int update(Branch b) {
         try {
            String sql = "update branch set branch_code = '"+b.getBranch_code()+"', branch_name = '"+b.getBranch_name()+"', branch_location = '"+b.getBranch_location()+"', department_name = '"+b.getDep_name()+"' where branch_code = '"+b.getBranch_code()+"'";
            con = DBConnectin.getConnection();
            stmt = con.createStatement();
            int status = stmt.executeUpdate(sql);
            con.close();
            return status;
        } catch (Exception ex) {
            return 0;
        }
    }

    @Override
    public int delete(String code) {
        System.out.println("heooo");
         Branch b = new Branch();
        String sql = "delete from branch where branch_code = '" + code + "'";
        try {
            con = DBConnectin.getConnection();
            stmt = con.createStatement();
            int status = stmt.executeUpdate(sql);
            con.close();
            return status;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public List<Branch> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int saveAttendence(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Branch getCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
