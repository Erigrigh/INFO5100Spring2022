package com.algorithm;

import java.util.Arrays;

public class ConstructedFrom {


    public boolean constructedFrom(String s, String t) {
        int size1 = s.length();
        int size2 = t.length();

        if ( size1 != size2) {
            System.out.println(s + " can not be constructed from " + t);
            return false;
        }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);


        for (int i = 0; i < size1; i++)

            if (sc[i] != tc[i]) {
                System.out.println(s + " can not be constructed from " + t);
                return false;
            }
        System.out.println(s + " can be constructed from " + t);
        return true;
    }
}
