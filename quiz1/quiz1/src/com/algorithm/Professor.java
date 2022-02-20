package com.algorithm;

public class Professor extends Person{

    public Professor(String name, int age, int id) {
        super(name, age, id);
    }

    public String giveQuiz() {

        return "GiveQuiz";
    }
}
