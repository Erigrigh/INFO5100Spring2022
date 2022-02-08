package com.algorithm;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        DetermineLeapYear dly = new DetermineLeapYear();

        dly.determineLeapYear(2022);
        dly.determineLeapYear(2000);
        dly.determineLeapYear(1900);
        dly.determineLeapYear(2020);
        dly.determineLeapYear(2010);
        dly.determineLeapYear(2008);
    }
}
