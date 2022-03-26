package com.algorithm;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //prove there  would  be  just  one  instance  of  Camera

        Camera camera1 = Camera.getInstance();

        camera1.setName("Camera1");

        Camera camera2 = Camera.getInstance();

        camera2.setName("Camera2");

        System.out.println(camera1.getName());

    }
}
