/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.service;

import com.emp.common.IUserDao;
import com.emp.common.IUserService;
import com.emp.dao.SalaryDao;
import com.emp.model.Employee;
import com.emp.model.User;
import java.util.List;

/**
 *
 * @author Tania
 */
public class SalaryService implements IUserService<Employee>{
     IUserDao salaryDao = new SalaryDao();
    @Override
    public int save(Employee t) {
         return salaryDao.save(t);
    }

    @Override
    public int login(User l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee getByCode(String code) {

        return (Employee) salaryDao.getByCode(code);
    }

    @Override
    public int update(Employee t) {
     return 0;  
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
        return salaryDao.saveAttendence(e);
    }

    @Override
    public Employee getCode(String code) {
        return  (Employee) salaryDao.getCode(code);
        
    }
}
