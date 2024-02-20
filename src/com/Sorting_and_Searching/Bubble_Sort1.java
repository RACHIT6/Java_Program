package com.Sorting_and_Searching;

import java.util.Arrays;

public class Bubble_Sort1 {
    public static void main ( String[] args ) {
        int [] arr = {7, 2, 4, 1, 5};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if ( arr[j - 1] > arr[j] ) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println (Arrays.toString (arr));
    }
}
