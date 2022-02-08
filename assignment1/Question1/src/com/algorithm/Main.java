package com.algorithm;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        IsPalindrome ip = new IsPalindrome();
        ip.checkPalindrome("");
        ip.checkPalindrome(" ");
        ip.checkPalindrome("abcdcba");
        ip.checkPalindrome("abcdefg");
        ip.checkPalindrome("12321");
        ip.checkPalindrome("123456");
    }
}
