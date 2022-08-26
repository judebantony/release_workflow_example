package com.jba.release.services;

import org.springframework.stereotype.Service;

import com.jba.release.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    
    @Override
    public Employee getEmployee(int id) {
        return new Employee(id, "John", "New York", "");
        
    }

    @Override
    public Employee getEmployee(String name) {
        return new Employee(1, name, "New York", "");

    }

    @Override
    public Employee getEmployee(int id, String name) {
        return new Employee(id, name, "New York", "");

        
    }

    
}
    

