package com.jba.release.services;

import com.jba.release.model.Employee;

public interface EmployeeService {
    public Employee getEmployee(int id);
    public Employee getEmployee(String name);
    public Employee getEmployee(int id, String name);
    
}
