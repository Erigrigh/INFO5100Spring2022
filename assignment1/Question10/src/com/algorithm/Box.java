package com.algorithm;

public class Box {

    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public  void calculateBoxVolume () {

        double volume;

        if(getWidth() < 0 || getDepth() < 0 || getHeight() < 0) {
            System.out.println("Invalid input");
            return;
        }

        volume =  this.getDepth() * this.getHeight() * this.getWidth();

        System.out.println("The Volume of Box is " + volume);

    }
}
