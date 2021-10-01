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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Tania
 */
public class AttendanceDao implements IUserDao<Employee>{
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    @Override
    public int save(Employee t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int login(User l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getByCode(String code) {
         Employee e = new Employee();
         try {
            String sql = "select * from emp_management.employees where emp_code = '"+code+"'";
            con = DBConnectin.getConnection();
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
            while (rs.next()) {
                e.setEmp_code(rs.getString("emp_code"));
                e.setFirst_name(rs.getString("first_name"));
                e.setLast_name(rs.getString("last_name"));  
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         System.out.println(e.getFirst_name());
         return e;
    }

    @Override
    public int update(Employee t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAll() {
      try {
            String sql = "select * from attendance";
            con = DBConnectin.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            List<Employee> empList = new ArrayList<Employee>();
            while (rs.next()) {
                Employee e = new Employee();
                e.setEmp_code(rs.getString("emp code"));
               e.setFirst_name(rs.getString("First Name"));
               e.setLast_name(rs.getString("Last Name"));
               e.setDate(rs.getString("Time And Date"));
               e.setAttendancy(rs.getString("Attedency"));
              
               
                empList.add(e);
            }
            con.close();
            return empList;
        } catch (Exception e) {
            return null;
        }  
    }

    @Override
    public int saveAttendence(Employee e) {
        int flag = -1;
        try {
            String sql = "insert into emp_management.attendance (emp_code, fist_name, last_name, attend_time, attendencey) values (?, ?, ?, CURRENT_TIMESTAMP(), ?)";
            con = DBConnectin.getConnection();
             ps = con.prepareStatement(sql);
             ps.setString(1, e.getEmp_code());
             ps.setString(2, e.getFirst_name());
             ps.setString(3, e.getLast_name());
             ps.setString(4, "attended");

             flag = ps.executeUpdate();
             if(flag == 1){
                 JOptionPane.showMessageDialog(null, "inserted");
             }else{
                 JOptionPane.showMessageDialog(null, "not inserted");
             }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return flag;
    }

    @Override
    public Employee getCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
