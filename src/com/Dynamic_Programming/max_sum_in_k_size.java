package com.Dynamic_Programming;

public class max_sum_in_k_size {
//    118 119
    public static void main ( String[] args ) {
        int k = 3;
        int [] arr = {2, 7, 3, 5, 8, 1};
        int start = 0;
        int maxSum = 0, windowSum = 0;

        for (int end = 0; end < arr.length; end++) {
            windowSum = windowSum + arr[end];
            if ( end >= k - 1) {
                maxSum = Math.max (windowSum, maxSum);
                windowSum = windowSum - arr[start];
                start++;
            }
        }

        System.out.println (maxSum);
    }
}
