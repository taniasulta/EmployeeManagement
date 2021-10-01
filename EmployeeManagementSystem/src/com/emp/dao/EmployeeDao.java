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

/**
 *
 * @author Tania
 */
public class EmployeeDao implements IUserDao<Employee>{
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement ps = null;


    @Override
    public int save(Employee e) {
        try {
               System.out.println("Hello");
            
            String sql = "insert into employees(first_name, last_name, address, date_of_birth, gender, email, department_name, branch_name, emp_code, educational_qualification, salar, post) values(?,?,?,?,?,?,?,?,?,?,?,?)";
            con = DBConnectin.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, e.getFirst_name());
            ps.setString(2, e.getLast_name());
            ps.setString(5, e.getGender());
            ps.setString(3, e.getAddress());
            ps.setString(4, e.getDate_of_birth());
            ps.setString(6, e.getEmail());
            ps.setString(7, e.getDepartment_name());
            ps.setString(8, e.getBranch_name());
            ps.setString(9, e.getEmp_code());
            ps.setString(10, e.getEducation());
            ps.setDouble(11, e.getSalary());
            ps.setString(12, e.getPost());
            int status = ps.executeUpdate();
             
             
            con.close();
            return status;
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
                
               e.setFirst_name(rs.getString("first_name"));
               e.setLast_name(rs.getString("last_name"));
               e.setAddress(rs.getString("address"));
               e.setDate_of_birth(rs.getString("date_of_birth"));
               e.setGender(rs.getString("gender"));
               e.setEmail(rs.getString("email"));
               e.setDepartment_name(rs.getString("branch_name"));
               e.setEmp_code(rs.getString("emp_code"));
               e.setEducation(rs.getString("educational_qualification"));
               e.setSalary(rs.getDouble("salar"));
               e.setPost(rs.getString("post"));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         return e;
    }

    @Override
    public int update(Employee e) {
         try {
            String sql = "update employees set first_name = '" + e.getFirst_name()+ "', last_name = '" + e.getLast_name()+ "', address = '" + e.getAddress()+ "', date_of_birth = '" + e.getDate_of_birth()+ "', gender = '" + e.getGender()+ "', email = '" + e.getEmail()+ "', branch_name = '" + e.getBranch_name()+ "', department_name = '" + e.getDepartment_name()+ "', emp_code = '" + e.getEmp_code()+ "', educational_qualification = '" + e.getEducation()+ "', salar = '" + e.getSalary()+ "', post = '" + e.getPost()+ "' where emp_code = '" + e.getEmp_code() + "' ";
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
        String sql = "delete from employees where emp_code = '" + code + "'";
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
    public List<Employee> getAll() {
         try {
            String sql = "select * from employees";
            con = DBConnectin.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            List<Employee> empList = new ArrayList<Employee>();
            while (rs.next()) {
                Employee e = new Employee();
               e.setFirst_name(rs.getString("first_name"));
               e.setLast_name(rs.getString("last_name"));
               e.setAddress(rs.getString("address"));
               e.setDate_of_birth(rs.getString("date_of_birth"));
               e.setGender(rs.getString("gender"));
               e.setEmail(rs.getString("email"));
               e.setDepartment_name(rs.getString("department_name"));
               e.setDepartment_name(rs.getString("branch_name"));
               e.setEmp_code(rs.getString("emp_code"));
               e.setEducation(rs.getString("educational_qualification"));
               e.setSalary(rs.getDouble("salar"));
               e.setPost(rs.getString("post"));
               
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}