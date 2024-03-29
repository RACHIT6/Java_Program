package com.Sorting_and_Searching;

import java.util.Arrays;

public class Insertion_sort_practice {
    public static void insertionSort (int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while ( j >= 0 && arr[j] > key ){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main (String[] args) {
        int [] arr = {2, 3, 54, 43, 1, 21};
        insertionSort (arr);
        System.out.println (Arrays.toString (arr));
    }
}
