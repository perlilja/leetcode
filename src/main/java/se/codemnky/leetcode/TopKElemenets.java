package se.codemnky.leetcode;

import java.util.*;

public class TopKElemenets {

    /*                                                                                                                        *
    * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numbersSet = new HashMap<>();
        if (nums == null) {
            throw new IllegalArgumentException("Given array can't be null");
        }

        if (k == 0) {
            return new int[]{};
        }

        for (int num : nums) {
            numbersSet.put(num, numbersSet.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[k];

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return numbersSet.get(b)-numbersSet.get(a);
            }
        });

        queue.addAll(numbersSet.keySet());

        for(int i=0; i<k; i++){
            ans[i] = queue.poll();
        }

        return ans;
    }
}
