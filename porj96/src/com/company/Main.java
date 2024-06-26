package com.company;

public class Main {

    public static void main(String[] args) {

        Vehicle lamburgini = new Vehicle("Lamburgini");
        lamburgini.honk();

        Bicycle bmx = new Bicycle("BMX", 2);
        bmx.honk();
        System.out.println(bmx);
        System.out.println(bmx.manufactured);

        Rectangle r1 = new Rectangle(10, 20);
        calcHekef(r1);

        //calcHekef(bmx); // Error

        //new BaseHekef();

        Triangle t1 = new Triangle(3, 4, 5);
        calcHekef(t1);
    }

    static void calcHekef(IHekef t) {
        System.out.println(t.calcHekef());
    }

    static void calcHekefBase(BaseHekef t) {
        System.out.println(t.calcHekef());
    }
}
