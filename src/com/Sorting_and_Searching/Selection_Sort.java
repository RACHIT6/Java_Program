package com.Sorting_and_Searching;

import java.util.Arrays;

public class Selection_Sort {
    public static void selectionSort (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if ( arr[i] > arr[j] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {32,43,4,32,23,12,2};
        selectionSort (arr);
        System.out.println (Arrays.toString (arr));
    }
}
