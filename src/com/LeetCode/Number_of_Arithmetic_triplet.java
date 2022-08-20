package com.LeetCode;

public class Number_of_Arithmetic_triplet {
    public static int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length;
        int count = 0;

        for (int k = 0; k < n; k++)
            for (int j = 0; j < k; j++)
                for (int i = 0; i < j; i++)
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff)
                        count++;

        return count;
    }

    public static void main(String[] args) {

    }
}
