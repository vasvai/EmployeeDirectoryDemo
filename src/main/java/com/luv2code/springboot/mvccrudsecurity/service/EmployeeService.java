package com.luv2code.springboot.mvccrudsecurity.service;

import java.util.List;

import com.luv2code.springboot.mvccrudsecurity.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
    
    List<Employee> findAllByOrderByLastNameAsc();

}
