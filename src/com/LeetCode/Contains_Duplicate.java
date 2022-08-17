package com.LeetCode;

import java.util.Arrays;

public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++){
            if (nums[i - 1] == nums[i]){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println (containsDuplicate (new int[]{1,2,3,1}));
    }
}
