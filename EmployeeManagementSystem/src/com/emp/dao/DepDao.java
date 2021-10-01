/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.dao;

import com.emp.common.IUserService;
import com.emp.model.Departments;
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
public class DepDao implements IUserService<Departments>{
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public int save(Departments d) {
         try {
              
             System.out.println("hi");
            String sql = "insert into departments (department_name, location, emp_code, dep_cod) values(?,?,?,?)";
            con = DBConnectin.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, d.getDepartment_name());
            ps.setString(2, d.getLocation());
            ps.setString(3, d.getEmp_code());
            ps.setString(4, d.getDep_code());
            int status = ps.executeUpdate();
             System.out.println("Hell");
              
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
    public Departments getByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Departments t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Departments> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int saveAttendence(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Departments getCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
