/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emp.model;

/**
 *
 * @author Tania
 */
public class Salary {
    private String first_name, last_name, date, paid_roll, emp_code;
    private double basic_salary; 
    private double maximum_salary;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPaid_roll() {
        return paid_roll;
    }

    public void setPaid_roll(String paid_roll) {
        this.paid_roll = paid_roll;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public double getBasic_salary() {
        return basic_salary;
    }

    public void setBasic_salary(double basic_salary) {
        this.basic_salary = basic_salary;
    }

    public double getMaximum_salary() {
        return maximum_salary;
    }

    public void setMaximum_salary(double maximum_salary) {
        this.maximum_salary = maximum_salary;
    }
    
}
