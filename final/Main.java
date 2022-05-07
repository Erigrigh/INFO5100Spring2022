package com.algorithm;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = new int[]{3,2,1,5,6,4};
        int[] nums2 = new int[]{3,2,3,1,2,4,5,5,6};
        FindKthLargest findKthLargest = new FindKthLargest();
        findKthLargest.findKthLargest(nums, 2);
        findKthLargest.findKthLargest(nums2, 4);


        UniqueIntegersSumUpToZero uniqueIntegersSumUpToZero = new UniqueIntegersSumUpToZero();
        uniqueIntegersSumUpToZero.sumZero(5);
        uniqueIntegersSumUpToZero.sumZero(3);

        LengthOfTheLongestSubstring lengthOfTheLongestSubstring = new LengthOfTheLongestSubstring();
        lengthOfTheLongestSubstring.lengthOfLongestSubstring("bbbbb");
        lengthOfTheLongestSubstring.lengthOfLongestSubstring("abba");
        lengthOfTheLongestSubstring.lengthOfLongestSubstring("pwwkew");

        StringCompression stringCompression = new StringCompression();
        stringCompression.compressString("aabcccccaaa");
        stringCompression.compressString("ab");

        ValidParentheses validParentheses = new ValidParentheses();
        validParentheses.isValid("()[]{}");
        validParentheses.isValid("(]");

    }
}
