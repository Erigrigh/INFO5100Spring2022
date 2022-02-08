package com.algorithm;

import java.util.HashSet;

public class AllUniqueCharacters {

    public void checkUniqueCharacters(String str) {
        int size = str.length();
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < size; i++) {
            set.add(str.charAt(i));
        }

        if (set.size() == size) {
            System.out.println("Input String has all unique characters");
        }
        else{
            System.out.println("Input String does not have all unique characters");
        }
    }
}
