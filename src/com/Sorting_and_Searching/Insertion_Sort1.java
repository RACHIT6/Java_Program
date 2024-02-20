package com.Sorting_and_Searching;

import java.util.Arrays;

public class Insertion_Sort1 {
    public static void main ( String[] args ) {
        int [] arr = {7, 2, 4, 1, 5};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while ( j >= 0 && arr[j] > key ) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println (Arrays.toString (arr));
    }
}
