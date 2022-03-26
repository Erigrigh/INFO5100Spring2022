package com.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {

    public int longestSubstring(String str){
        int size = str.length();
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();

        int res = Integer.MIN_VALUE;

//        int j = 0;
//        for(int i = 0; i <size; i++){
//
//            while(set.contains(str.charAt(i))){
//
//                if(str.charAt(j) ==  str.charAt(i)){
//                    set.remove(str.charAt(i));
//                    res = Math.max(res, i - j + 1);
//                    break;
//                }
//                set.remove(str.charAt(i));
//                j++;
//            }

//            set.add(str.charAt(i));
//


            int left = 0;
            for(int right = 0; right < size; right++) {

                while ( right < size && map.get(str.charAt(right)) > 1 ) {
                    map.put(str.charAt(left), map.get(str.charAt(left)) - 1);
                    left++;

                    if (map.get(str.charAt(right)) ==  1) {

                        res = Math.max(res, right - left + 1);
                        break;
                    }
                }

                if(right >= size) break;
            }


        System.out.println(res);
        return res;
    }
}
