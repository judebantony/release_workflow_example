package com.jba.release.services;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp implements CustomerService {
    @Override
    public String getCustomerName(int id) {
        return "John";
    }
    @Override
    public String getCustomerAddress(int id) {
        return "New York";
    }
    @Override
    public String getCustomerAge(int id) {
        return "30";
    }
}
    

