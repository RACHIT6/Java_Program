package com.Arrays_Question;

import java.util.HashMap;

public class _2Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map  = new HashMap <>();

        for (int i = 0; i < nums.length; i++) {
            map.put (i, nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
//            if (map.containsValue (target - ))
        }
        return nums;
    }
}
