package com.algorithm;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        ConstructedFrom cf= new ConstructedFrom();
        Boolean isPossible = cf.constructedFrom("ransomNote","magazine");
        System.out.println(isPossible);
    }
}
