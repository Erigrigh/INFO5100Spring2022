package com.algorithm;

public class Triangle extends Shape {

    private double base;
    private double height;
    //int side;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        setName("Triangle[base: " + base + ", height: " + height + "]");
    }

    public Triangle(double side) {
        //this.side = side;
        this.base = side;
        this.height = Math.sqrt(3) * (side / 2);
        setName("Triangle[side: " + side + "]");
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void printShape() {
        super.printShape();
        System.out.println("The Shape of the " + getName() + " is Triangle");
        System.out.println("The Base of the " + getName() + " is " + getBase());
        System.out.println("The Height of the " + getName() + " is " + getHeight());
        System.out.println();
    }

    @Override
    public double getArea() {
        System.out.println();
        setArea((getBase() * getHeight()) / 2);
        System.out.println("After calculation，the Area of the " + getName() + " is " + super.getArea());
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        setPerimeter(getBase() + 2 * Math.sqrt(getHeight() * getHeight() + (getBase() * getBase()) / 4));
        System.out.println("After calculation，the Perimeter of the " + getName() + " is " + super.getPerimeter());
        return super.getPerimeter();
    }




}
