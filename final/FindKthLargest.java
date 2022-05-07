package com.algorithm;

import java.util.PriorityQueue;

public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();

        for(int i : nums){
            pq.offer(i);

            if(pq.size() > k){
                pq.poll();
            }
        }


        int res = pq.peek();

        //System.out.println(res);
        return res;
    }
}
