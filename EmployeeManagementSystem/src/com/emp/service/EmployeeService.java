/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.service;

import com.emp.common.IUserDao;
import com.emp.common.IUserService;
import com.emp.dao.EmployeeDao;
import com.emp.model.Employee;
import com.emp.model.User;
import java.util.List;

/**
 *
 * @author Tania
 */
public class EmployeeService implements IUserService<Employee>{
   IUserDao employeeDao = new EmployeeDao();
    @Override
    public int save(Employee e) {
       return employeeDao.save(e);
    }

    @Override
    public int login(User l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getByCode(String code) {
        return (Employee) employeeDao.getByCode(code);
        
    }

    @Override
    public int update(Employee e) {
        return employeeDao.update(e);
    }

    @Override
    public int delete(String code) {
       return employeeDao.delete(code);
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
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
