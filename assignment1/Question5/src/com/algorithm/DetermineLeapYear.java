package com.algorithm;

public class DetermineLeapYear {

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void determineLeapYear(int year) {
        this.setYear(year);

        if(getYear() < 0) {
            System.out.println("Invalid Input");
            return;
        }

        if(year % 100 ==0 && year % 400 == 0 ) {
            System.out.println( year + " is a leap year");
            return;
        }
        else if(year % 100 != 0 && year % 4 == 0) {
            System.out.println( year + " is a leap year");
            return;
        }
        else {
            System.out.println( year + " is not a leap year");
            return;
        }
    }




}
