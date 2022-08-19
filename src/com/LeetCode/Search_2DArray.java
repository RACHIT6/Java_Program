package com.LeetCode;

public class Search_2DArray {
    public static boolean searchMatrix(int[][] matrix , int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while ( r < matrix.length && c >= 0 ) {
            if ( matrix[r][c] == target ) {
                return true;
            }

            if ( target > matrix[r][c] ) {
                r++;
            } else {
                c--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
