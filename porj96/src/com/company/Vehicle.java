package com.company;

import java.time.LocalDateTime;

// final class cannot be extended
public class Vehicle {

    protected String brand;

    // final = const
    // 1.
    //protected final LocalDateTime manufactured = LocalDateTime.now();
    // 2.
    protected final LocalDateTime manufactured;

    // final method cannot be override
    public void honk() {
        System.out.println("Tuut Tuut");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Vehicle(String brand) {
        this.brand = brand;
        this.manufactured = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
