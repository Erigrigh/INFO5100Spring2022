package com.algorithm;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        ContainsDuplicates cd = new ContainsDuplicates();

        cd.checkDuplicates("abcdefgab");
        cd.checkDuplicates("abcdefg");
        cd.checkDuplicates("");
        cd.checkDuplicates(" ");
        cd.checkDuplicates("a");
        cd.checkDuplicates("aa");
        cd.checkDuplicates("ab");

        ContainsDuplicates cd1 = new ContainsDuplicates();
        cd1.checkDuplicates("1234561");
        cd1.checkDuplicates("123456");
    }
}
