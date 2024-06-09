package com.company;

public class Bicycle extends Vehicle {

    protected int num_hand_brakes;

    public int getNum_hand_brakes() {
        return num_hand_brakes;
    }

    public void setNum_hand_brakes(int num_hand_brakes) {
        this.num_hand_brakes = num_hand_brakes;
    }

    @Override
    public void honk() {
        super.honk();
        System.out.println("Tzzzz");
    }

    public Bicycle(String brand, int num_hand_brakes) {
//        new Vehicle();
//        super()

        super(brand);
        this.num_hand_brakes = num_hand_brakes;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "Bicycle{" +
                "num_hand_brakes=" + num_hand_brakes +
                '}';
    }
}
