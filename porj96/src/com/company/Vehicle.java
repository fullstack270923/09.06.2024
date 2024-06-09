package com.company;

public class Vehicle {

    protected String brand;

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
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
