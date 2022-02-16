package com.algorithm;

public class Student {
    int rollNumber;
    String name;

    public Student() {

    }

    public Student(int i, String s) {
        this.rollNumber = i;
        this.name = s;
    }

    Student(Student s) {
        System.out.println();
        this.name = s.name;
        this.rollNumber = s.rollNumber;
    }


    public int printRoll() {
        return this.rollNumber;
    }

    public String printName() {
        return this.name;
    }
}
