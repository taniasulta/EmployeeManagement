/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.service;

import com.emp.common.IUserDao;
import com.emp.common.IUserService;
import com.emp.dao.AttendanceDao;
import com.emp.model.Employee;
import com.emp.model.User;
import java.util.List;

/**
 *
 * @author Tania
 */
public class AttendanceService implements IUserService<Employee>{
    IUserDao atdDao = new AttendanceDao();

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
        return (Employee) atdDao.getByCode(code);
        
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
        return atdDao.getAll();
    }

    @Override
    public int saveAttendence(Employee e) {
        return atdDao.saveAttendence(e);
    }

    @Override
    public Employee getCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
