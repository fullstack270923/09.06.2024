package com.cars;

import com.company.Bicycle;

public class Main {

    public static void main(String[] args) {
        Bicycle bmx = new Bicycle("BMX", 2);
        bmx.honk();
        System.out.println(bmx);
        //System.out.println(bmx.manufactured); // cannot -- diff pck.

        Honda civic = new Honda();
        System.out.println(civic.current_speed);

        System.out.println(Car.MAX_SPEED);
        System.out.println(Car.passedMaxSpeed(210));
    }
}
