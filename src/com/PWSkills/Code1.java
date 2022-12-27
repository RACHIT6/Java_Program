package com.PWSkills;

import java.util.Arrays;
import java.util.HashMap;

public class Code1 {
    public static int findTwoSum(int[] nums, int target) {
        HashMap <Integer, Integer> map = new HashMap<> ();
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if ( map.containsKey (complement) ){
                ans++;
            }

            else {
                map.put (nums[i], i);
            }
        }

        return ans;
    }

    public static void main ( String[] args ) {
        System.out.println (findTwoSum (new int[]{4, 6, 5, 3, 8, 2} , 7));
    }
}
