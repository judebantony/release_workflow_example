package com.jba.release.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jba.release.model.Employee;
import com.jba.release.services.EmployeeService;

@RestController(value = "/api/v1/employee")
public class EmployeeRestController {
    
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/name/{id}")
    public Employee getEmployeeName(String name) {
        return employeeService.getEmployee(name);
    }
    

    

}
