package com.algorithm;

public class PromptsGrade {

    private String grade;

    public PromptsGrade() {
    }

    public PromptsGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }


    public void promptsGrade (String grade) {

        this.setGrade(grade);

        if(getGrade().equals("A")) {
            System.out.println("Excellent");
        }
        else if (getGrade().equals("B")) {
            System.out.println("Good");
        }
        else if (getGrade().equals("C")) {
            System.out.println("Average");
        }
        else if (getGrade().equals("D")) {
            System.out.println("Deficient");
        }
        else if (getGrade().equals("F")) {
            System.out.println("Failing");
        }
        else {
            System.out.println("Null Grade Exception");
        }

    }



}
