package com.Sorting_and_Searching;

import java.util.Arrays;

public class Bubble_Sort {
    public static void bubbleSort (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if ( arr[j - 1] > arr[j] ){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {32,43,4,32,23,12,2};
        bubbleSort (arr);
        System.out.println (Arrays.toString (arr));
    }
}
