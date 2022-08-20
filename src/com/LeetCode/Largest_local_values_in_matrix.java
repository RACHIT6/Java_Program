package com.LeetCode;

import java.util.Arrays;

/*
* In this Question we have given an n x n matrix, we have to find the largest element in each sub array and return n - 2 and n - 2 matrix
* 3 <= n <= 100
*/
public class Largest_local_values_in_matrix {
    public static int max (int r, int c, int [][]arr){
        int max = Integer.MIN_VALUE;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                max = Math.max (max, arr[i][j]);
            }
        }

        return max;
    }

    public static int[][] largest (int [][]arr){
        int n = arr.length - 2;
        int [][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = max (i, j, arr);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int [][] arr = {
                {9,9,8,1},
                {5,6,2,6},
                {8,2,6,4},
                {6,2,2,2},
        };

        System.out.println (Arrays.deepToString (largest (arr)));
    }
}
