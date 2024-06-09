package com.company;

//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;

//@AllArgsConstructor
//@ToString
public class Person {

//    @Getter
//    @Setter
    private String id;
    private String name;
    private int age;
    private float weight;

    public int getAge() {
        return this.age;
    }

    public void setAge(int new_age) {
        if (new_age > 0 && new_age < 120) {
            this.age = new_age;
        }
    }

//    setDistance(float miles) {
//        this.km = miles * 1.6;
//    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2)
            this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0 && weight < 500)
            this.weight = weight;
    }

    public Person(String id, String name, int age, float weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Person(String id, String name, int age) {
        this(id, name, age, 80f);
    }

    // empty ctor.
    public Person() {
        this.name = "john";
        this.id = "000";
        this.age = 1;
        this.weight = 1f;
    }

    @Override
    public String toString() {
        //Gson gson = new Gson();
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
