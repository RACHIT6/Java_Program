package com.LeetCode;

public class Find_Peek_Number {
    public static int findPeakElement(int[] nums) {
        if (nums.length <= 1){
            return 0;
        }

        if (nums[0] > nums[1]){
            return 0;
        }

        if (nums[nums.length - 1] > nums[nums.length - 2]){
            return (nums.length - 1);
        }

        int ans = 1;
        for (int i = 1; i < nums.length - 1; i++){
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]){
                ans = i;
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println (findPeakElement (new int[] {1, 2}));
    }
}
