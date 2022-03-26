package com.algorithm;

public class Student {

    private String name;

    private int studentID;

    private Double gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Student(String name, int studentID, double gpa) {
        this.name = name;
        this.studentID = studentID;
        this.gpa = gpa;

    }

    public Student(Student student){
        this.name = student.getName();
        this.studentID = student.getStudentID();
        this.gpa = student.getGpa();
    }


}
