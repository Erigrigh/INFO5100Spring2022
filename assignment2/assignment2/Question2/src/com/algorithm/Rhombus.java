package com.algorithm;

public class Rhombus extends Shape{

    private double diagonal1;
    private double diagonal2;

    public Rhombus(double d1, double d2) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
        setName("Rhombus[diagonal1: " + d1 + ", diagonal2: " + d2 + "]");
    }

    public Rhombus(double d1) {
        this.diagonal1 = d1;
        this.diagonal2 = d1;
        setName("Rhombus[diagonal1: " + d1 + ", diagonal2: " + d1 + "]");
    }

    public double getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public void printShape() {
        super.printShape();
        System.out.println("The Shape of the " + getName() + " is Rhombus");
        System.out.println("The Diagonal1 of the " + getName() + " is " + getDiagonal1());
        System.out.println("The Diagonal2 of the " + getName() + " is " + getDiagonal2());
        System.out.println();
    }

    @Override
    public double getArea() {
        System.out.println();
        setArea((getDiagonal1() * getDiagonal2()) / 2);
        System.out.println("After calculation，the Area of the " + getName() + " is " + super.getArea());
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        setPerimeter(2 * Math.sqrt(getDiagonal1() * getDiagonal1() + getDiagonal2() * getDiagonal2()));
        System.out.println("After calculation，the Perimeter of the " + getName() + " is " + super.getPerimeter());
        return super.getPerimeter();
    }
}
