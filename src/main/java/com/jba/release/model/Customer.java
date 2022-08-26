package com.jba.release.model;

import lombok.Data;

@Data
public class Customer {
    int name;
    int age;
    int address;

    public Customer(int name, int age, int address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

}
