package com.algorithm;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1 = new Student("ABC",123, 3.0 );

        // deep copy
        Student s2 = new Student(s1);

        System.out.println(s1.getName());
        System.out.println(s2.getName());

        s1.setName("CBA");

        System.out.println(s1.getName());
        System.out.println(s2.getName());


        // shallow copy
        Student s3 = s1;

        System.out.println(s3.getName());


    }
}
