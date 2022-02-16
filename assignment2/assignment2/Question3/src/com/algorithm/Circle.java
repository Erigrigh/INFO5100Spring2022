package com.algorithm;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        setName("Circle[radius: " + radius + "]");
    }

    public double getRadius() {
        return radius;
    }

    public void computeArea() {
        setArea(getRadius() * getRadius() * Math.PI);
        System.out.println("After calculation, the Area of the " + getName() + " is " + getArea());
    }

    public void computePerimeter() {
        setPerimeter(2 * getRadius() * Math.PI);
        System.out.println("After calculation, the Perimeter of the "+ getName() + " is " + getPerimeter());
    }

    public void display() {
        super.display();
    }
}
