package com.LeetCode;

public class Make_array_zero_by_subtracting_equal_amount {
    public static int max (int [] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr)
            max = Math.max(max, j);

        return max;
    }

    public static int minimumOperations(int[] nums) {
        int [] map = new int[max(nums) + 1];

        for(int j : nums)
            if (j != 0)
                map[j] += 1;

        int count = 0;
        for(int j : map)
            if (j >= 1)
                count++;

        return count;
    }

    public static void main(String[] args) {

    }
}
