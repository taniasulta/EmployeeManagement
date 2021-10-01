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
public class Employee {
    String  first_name, last_name, address, date_of_birth, nid_numbur, gender, nationality, email, phone_number, department_name, branch_name, emp_code, education, post, date, attendancy;
    double salary, max_salary;

    public String getAttendancy() {
        return attendancy;
    }

    public void setAttendancy(String attendancy) {
        this.attendancy = attendancy;
    }
    
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getNid_numbur() {
        return nid_numbur;
    }

    public void setNid_numbur(String nid_numbur) {
        this.nid_numbur = nid_numbur;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getEmp_code() {
        return emp_code;
    }

    public void setEmp_code(String emp_code) {
        this.emp_code = emp_code;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMax_salary() {
        return max_salary;
    }

    public void setMax_salary(double max_salary) {
        this.max_salary = max_salary;
    }

  
    

    @Override
    public String toString() {
        return "Employee{" + "first_name=" + first_name + ", last_name=" + last_name + ", address=" + address + ", date_of_birth=" + date_of_birth + ", nid_numbur=" + nid_numbur + ", gender=" + gender + ", nationality=" + nationality + ", email=" + email + ", phone_number=" + phone_number + ", department_name=" + department_name + ", branch_name=" + branch_name + ", emp_code=" + emp_code + ", education=" + education + ", post=" + post + ", salary=" + salary + '}';
    }
    

    }

  
    

