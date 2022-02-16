package com.algorithm;

public class Rectangle extends Shape {

    private double length;

    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        setName("Rectangle[length: " + length + ", width: " + width + "]");
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void computeArea() {
        setArea(getLength() * getWidth());
        System.out.println("After calculation，the Area of the " + getName() + " is " + getArea());
    }

    public void computePerimeter() {
        setPerimeter(2 * (getLength() + getWidth()));
        System.out.println("After calculation, the Perimeter of the "+ getName() + " is " + getPerimeter());
    }

    @Override
    public void display() {
        super.display();
    }
}
