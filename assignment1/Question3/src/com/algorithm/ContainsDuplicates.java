package com.algorithm;

import java.util.HashSet;

public class ContainsDuplicates {



    public void checkDuplicates (String str) {
        int size = str.length();
        HashSet<Character> set = new HashSet<>();

//        for(int i = 0; i < size; i++) {
//
//            if (set.contains(str.charAt(i))) {
//                System.out.println("Input String contains duplicates");
//                return;
//            }
//            set.add(str.charAt(i));
//        }
//
//        System.out.println("Input String doesn't contains duplicates");

        for(int i = 0; i < size; i++) {
            set.add(str.charAt(i));
        }

        if (set.size() == size) {
            System.out.println("Input String doesn't contains duplicates");
        }
        else{
            System.out.println("Input String contains duplicates");
        }
    }

}
