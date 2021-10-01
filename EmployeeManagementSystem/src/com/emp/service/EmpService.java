/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.service;

import com.emp.common.IUserDao;
import com.emp.common.IUserService;
import com.emp.dao.EmpDao;
import com.emp.model.Employee;
import com.emp.model.User;
import java.util.List;

/**
 *
 * @author Tania Aktar
 */
public class EmpService implements IUserService{
    IUserDao empdao = new EmpDao(); 
    @Override
    public int save(Object t) {
        return empdao.save(t);
        
        
    }

   

    @Override
    public int login(User l) {
       return empdao.login(l);
        
    }

    @Override
    public Object getByCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int saveAttendence(Employee e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getCode(String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
