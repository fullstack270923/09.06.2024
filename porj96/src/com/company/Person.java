package com.company;

public class Person {

    String id;
    String name;
    int age;
    float weight;

    public Person(String id, String name, int age, float weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
