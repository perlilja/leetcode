package se.codemnky.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */
public class ContainsDuplicate {


    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> values = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (values.containsKey(nums[i])) {
                return true;
            } else {
                values.put(nums[i], 1);
            }
        }

        return false;
    }
}
