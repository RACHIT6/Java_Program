package com._2D_Array;

public class Matrix_Search {
    /* {{Only applicable for sorted 2D array}} */
    public static Boolean _2DArrayBinarySearch (int [][] arr, int target){
        int r = 0, c = arr[0].length - 1;

        while ( r < arr.length && c>= 0){
            if ( arr[r][c] == target){
                return true;
            }

            if ( arr[r][c] < target){
                r++;
            }

            else{
                c--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int [][] arr = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10 ,13, 14, 17},
        };

        System.out.println (_2DArrayBinarySearch (arr, 21));
    }
}
