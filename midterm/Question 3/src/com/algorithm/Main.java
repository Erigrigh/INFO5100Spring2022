package com.algorithm;

public class Main {

    public static void main(String[] args) {

        Psychiatrist psychiatrist = new Psychiatrist();
        HappyObject happyObject = new HappyObject();
        SadObject sadObject = new SadObject();
        psychiatrist.attach(happyObject);
        psychiatrist.attach(sadObject);

        psychiatrist.examine(happyObject);
        psychiatrist.observe(happyObject);

        System.out.println();

        psychiatrist.examine(sadObject);
        psychiatrist.observe(sadObject);
    }
}
