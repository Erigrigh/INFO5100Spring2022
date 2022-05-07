package com.algorithm;

public class UniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
       int[] res = new int[n];

       for(int i = 0; i < n - 1; i = i + 2){
           res[i] = i + 1;
           res[i + 1] = -(i + 1);
       }

//        for(int e : res){
//            System.out.println(e);
//        }

       return res;
    }
}
