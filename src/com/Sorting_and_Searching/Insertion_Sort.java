package com.Sorting_and_Searching;

import java.util.Arrays;

public class Insertion_Sort {
    public static void insertionSort (int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while ( j >= 0 && key < arr[j] ){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int [] arr = {32,43,4,32,23,12,2};
        insertionSort (arr);
        System.out.println (Arrays.toString (arr));
    }
}
