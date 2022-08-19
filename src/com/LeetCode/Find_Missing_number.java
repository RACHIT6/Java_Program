package com.LeetCode;

public class Find_Missing_number {
    public static int missingNumber (int [] arr){
        int n = arr.length;
        int sum = n * (n + 1) / 2;

        int ESum = 0;
        for (int j : arr){
            ESum += j;
        }

        return Math.abs(sum - ESum);
    }

    public static void main(String[] args) {
        System.out.println (missingNumber (new int[] {0,3}));
    }
}
