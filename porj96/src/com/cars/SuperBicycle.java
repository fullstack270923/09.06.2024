package com.cars;

import com.company.Bicycle;

public class SuperBicycle extends Bicycle {

    public SuperBicycle(String brand, int num_hand_brakes) {
        super(brand, num_hand_brakes);
    }

    public void ride() {
        System.out.println(manufactured);
    }

}
