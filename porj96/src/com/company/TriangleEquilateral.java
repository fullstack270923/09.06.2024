package com.company;

public class TriangleEquilateral extends Triangle {

    public void setA(float a) {

        this.a = a; // this.setA(a);
        this.b = a;
        this.c = a;
    }

    public void setB(float b) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public void setC(float c) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public TriangleEquilateral(float a) {
        //new Triangle(a, a, a);
        super(a, a, a);
    }

    // perimeter
    @Override
    public float calcHekef() {
        return this.a * 3;
    }

    public float getAngle() {
        return 60f;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a + '}';
    }
}
