/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.service;

import com.emp.common.IUserDao;
import com.emp.common.IUserService;
import com.emp.dao.BranchDao;
import com.emp.model.Branch;
import com.emp.model.Employee;
import com.emp.model.User;
import java.util.List;

/**
 *
 * @author Tania
 */
public class BranchService implements IUserService<Branch>{
    IUserDao branchdao=new BranchDao();
    @Override
    public int save(Branch b) {
      return branchdao.save(b);
    }

    @Override
    public int login(User l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Branch getByCode(String code) {
        return (Branch) branchdao.getByCode(code);
    }

    @Override
    public int update(Branch b) {
        return branchdao.update(b);
    }

    @Override
    public int delete(String code) {
       return branchdao.delete(code);
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
