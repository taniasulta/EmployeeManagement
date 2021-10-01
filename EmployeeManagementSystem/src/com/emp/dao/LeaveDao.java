/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.dao;

import com.emp.common.IUserDao;
import com.emp.model.Employee;
import com.emp.model.Leave;
import com.emp.model.User;
import com.emp.util.DBConnectin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Tania
 */
public class LeaveDao implements IUserDao<Leave>{
     Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public int save(Leave t) {
        int status = 0;
        con = DBConnectin.getConnection();
         try {
            ps = con.prepareStatement("select emp_code from employees");
            ResultSet rs = ps.executeQuery();
            String empvalue;
            while(rs.next()){
                empvalue = rs.getString("emp_code");
                ps = con.prepareStatement("insert into leave(emp_code, casual, medical, annual, year) values(?,?,?,?,?)");
                Leave l = new Leave();
                ps.setString(1, empvalue);
                ps.setInt(2, l.getCasual());
                ps.setInt(3, l.getMedical());
                ps.setInt(4, l.getAnnual());
                ps.setInt(5, l.getYear());
                status = ps.executeUpdate();
            }
            return  status;
        } catch (Exception e) {
            return 0;
        }
         
    }

    @Override
    public int login(User l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Leave getByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Leave t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Leave> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int saveAttendence(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Leave getCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
