package com.algorithm;

public class Shape {

    private String name;
    private double area;
    private double perimeter;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public Shape() {
        setName("Shape");
    }

    public void display() {
        System.out.println();
        System.out.println("The Area of the " + getName() + " is " + getArea());
        System.out.println("The Perimeter of the "+ getName() + " is " + getPerimeter());
        //System.out.println();
    }
}
