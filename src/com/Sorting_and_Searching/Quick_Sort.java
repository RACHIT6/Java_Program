package com.Sorting_and_Searching;

import java.util.Arrays;

public class Quick_Sort {
    public static int partition (int [] arr, int low, int high){
        int pivot = arr[low];
        int i = low, j = high;

        while ( i < j ){
            while ( arr[i] <= pivot && i < high)
                i++;
            while ( arr[j] > pivot && j > low)
                j--;

            if ( i < j ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quickSort (int [] arr, int low, int high) {
        if ( low < high ){
            int index = partition (arr, low, high);
            quickSort (arr, low, index - 1);
            quickSort (arr, index + 1, high);
        }
    }

    public static void main (String[] args) {
        int [] arr = {21, 43, 233, 343, 4};
        quickSort (arr, 0, arr.length - 1);
        System.out.println (Arrays.toString (arr));
    }
}
