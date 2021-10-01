/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.common;

import com.emp.model.Employee;
import com.emp.model.User;
import java.util.List;

/**
 *
 * @author Tania Aktar
 */
public interface IUserDao <T>{
     public int save(T t);
     public int login(User l);
     public T getByCode(String code);
     public int update(T t);
     public int delete(String code);
     public List<T> getAll();

    public int saveAttendence(Employee e);

    public T getCode(String code);
    
}
