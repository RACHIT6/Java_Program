package com.DSA;

import java.util.Arrays;

public class sorting_practice3 {
    public static void insertionSort (int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void countSort (int [] arr){
        int max = maxElement(arr); // function to find out max element of array.
        int [] entry = new int[max + 1];

        for (int element : arr){
            entry[element] += 1;
        }

        int i = 0, j = 0;
        while (i <= max){
            if (entry[i] > 0){
                arr[j] = i;
                entry[i]--;
                j++;
            }

            else {
                i++;
            }
        }
    }

    private static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int j : arr){
            if (max < j){
                max = j;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int [] arr = {32, 23, 21, 4, 3, 1, 3, 3434};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
