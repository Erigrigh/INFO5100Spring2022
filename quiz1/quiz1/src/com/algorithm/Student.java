package com.algorithm;

public class Student extends Person{

    public Student(String name, int age, int id) {
        super(name, age, id);
    }

    public String takeQuiz () {

        return "Take Quiz";
    }
}
