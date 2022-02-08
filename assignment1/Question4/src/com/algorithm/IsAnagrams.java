package com.algorithm;

import java.util.Arrays;

public class IsAnagrams {
    public boolean isAnagram(String s, String t) {

        int size1 = s.length();
        int size2 = t.length();

        if ( size1 != size2) {
            System.out.println(s + " and " + t + " are not anagrams");
            return false;
        }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        for (int i = 0; i < size1; i++)

            if (sc[i] != tc[i]) {
                System.out.println(s + " and " + t + " are not anagrams");
                return false;
            }

        System.out.println(s + " and " + t + " are anagrams");
        return true;

    }
}
