package com.company;

public class Main {

    public static void main(String[] args) {

        Person danny = new Person("001", "danny", 18, 50.5f);
        Person johnDoe = new Person();
        johnDoe.setAge(25);

        System.out.println("dannys age is " + danny.getAge());
        danny.setAge(-1);
        System.out.println("dannys age after the change is " + danny.getAge());

        System.out.println(danny);

    }
}
