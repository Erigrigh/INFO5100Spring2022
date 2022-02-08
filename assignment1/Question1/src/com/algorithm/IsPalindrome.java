package com.algorithm;

public class IsPalindrome {

    public void checkPalindrome(String s) {

        if (s.isEmpty()) {
            System.out.println("The input String is a Palindrome");
            return;
        }

        int start = 0;
        int right = s.length() - 1;

        while (start < right) {
            if (s.charAt(start) != s.charAt(right)) {
                System.out.println("The input String is not a Palindrome");
                return;
            }
            start++;
            right--;
        }
        System.out.println("The input String is a Palindrome");
        return;
    }

}
