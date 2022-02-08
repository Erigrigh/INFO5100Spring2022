package com.algorithm;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        IsAnagrams ia = new IsAnagrams();
        ia.isAnagram("abcdefg","abcdefg");
        ia.isAnagram("abcdefg","bcdefga");
        ia.isAnagram("abcdefg","bcdefg");
        ia.isAnagram("abcdefg","abcdeff");
        ia.isAnagram("","");
        ia.isAnagram(""," ");
        ia.isAnagram("123456","654321");
        ia.isAnagram("123456","012345");

    }
}
