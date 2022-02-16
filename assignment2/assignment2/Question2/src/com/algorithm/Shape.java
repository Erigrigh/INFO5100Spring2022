package com.algorithm;

public class Shape {
    private String name;
    private String color;
    private double area;
    private double perimeter;

    public Shape() {
    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, double perimeter, double area) {
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
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

    public void printShape() {
        System.out.println("The Name of the current shape is " + getName());
    }

}
