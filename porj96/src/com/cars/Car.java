package com.cars;

public abstract class Car {

    public static int MAX_SPEED = 180;
    public static boolean passedMaxSpeed(float speed) {
        return speed > MAX_SPEED;
    }

    protected float current_speed = 0f;

}
