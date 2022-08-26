package com.jba.release.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jba.release.services.CustomerService;

@RestController(value = "/api/v1/customer")
public class CustomerRestController {
   @Autowired
   private CustomerService customerService; 

    @GetMapping("/name/{id}")
    public String getCustomerName(int id) {
        return customerService.getCustomerName(id);
    }
    
    @GetMapping("/address/{id}")
    public String getCustomerAddress(int id) {
        return customerService.getCustomerAddress(id);
    }
    
    @GetMapping("/age/{id}")
    public String getCustomerAge(int id) {
        return customerService.getCustomerAge(id);
    }
}
