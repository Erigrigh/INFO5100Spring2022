package com.algorithm;

public class Main {

    public static void main(String[] args) {

        Shape s = new Shape();
        Triangle t1= new Triangle(10, 12);
        Triangle t2 = new Triangle(6.0);
        Rhombus r1 = new Rhombus(6.0, 8.0);
        Rhombus r2 = new Rhombus(6.0);


        t1.printShape();
        t2.printShape();
        r1.printShape();
        r2.printShape();

        t1.getArea();
        t1.getPerimeter();
        t2.getArea();
        t2.getPerimeter();

        r1.getArea();
        r1.getPerimeter();
        r2.getArea();
        r2.getPerimeter();
    }
}
