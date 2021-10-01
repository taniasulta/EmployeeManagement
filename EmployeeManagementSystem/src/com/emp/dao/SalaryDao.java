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
import javax.swing.JOptionPane;

/**
 *
 * @author Tania
 */
public class SalaryDao implements IUserDao<Employee>{
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
   
    @Override
    public int save(Employee e) {
         int flag = -1;
        try {
               System.out.println("Hello");
            
            String sql = "insert into emp_management.salary(first_name, last_name, basic_salary, maximum_salary, emp_code) values(?, ?, ?, ?, ?)";
            con = DBConnectin.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, e.getFirst_name());
            ps.setString(2, e.getLast_name());
            ps.setDouble(3, e.getSalary());
            ps.setDouble(4, e.getMax_salary());
            ps.setString(5, "paid");
            ps.setString(6, e.getEmp_code());
            flag = ps.executeUpdate();
            System.out.println("Hellooo");
             if(flag == 1){
                 JOptionPane.showMessageDialog(null, "inserted");
             }else{
                 JOptionPane.showMessageDialog(null, "not inserted");
             }

             
            con.close();
            return flag;
        } catch (Exception ex) {
            return 0;
    }
    }

    @Override
    public int login(User l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getByCode(String code) {
         Employee e = new Employee();
         try {
            String sql = "select * from employees where emp_code = '" + code + "' ";
            con = DBConnectin.getConnection();
             ps = con.prepareStatement(sql);
             rs = ps.executeQuery();
            
            while (rs.next()) {  
                e.setEmp_code(rs.getString("emp_code"));
                e.setFirst_name(rs.getString("first_name"));
                e.setLast_name(rs.getString("last_name"));
                e.setSalary(rs.getDouble("salar"));
               
               
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int saveAttendence(Employee e) {
        int status = -1;
        try {
            String sql = "insert into emp_management.salary (first_name, last_name, basic_salary, maximum_salary, date, salarypaid, emp_code) values (?, ?, ?, ?, ?CURRENT_TIMESTAMP(), ?, ?)";
            con = DBConnectin.getConnection();
             ps = con.prepareStatement(sql);
             ps.setString(1, e.getFirst_name());
            ps.setString(2, e.getLast_name());
            ps.setDouble(3, e.getSalary());
            ps.setDouble(4, e.getMax_salary());
            ps.setString(5, "paid");
            ps.setString(6, e.getEmp_code());
             status = ps.executeUpdate();
             if(status == 1){
                 JOptionPane.showMessageDialog(null, "inserted");
             }else{
                 JOptionPane.showMessageDialog(null, "not inserted");
             }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return status;
    }

    @Override
    public Employee getCode(String code) {
         try {
            String sql = "select * from employees where emp_code = '" + code + "' ";
            con = DBConnectin.getConnection();
             ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
        
    }
              


    

