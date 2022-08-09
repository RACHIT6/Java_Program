package com.DSA;

import java.util.Arrays;

public class sorting_practice2 {
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

    public static int maxElement (int [] arr){
        int max = Integer.MIN_VALUE;
        for (int element: arr){
            if (element > max){
                max = element;
            }
        }

        return max;
    }

    public static void countSort (int [] arr){
        int max = maxElement(arr);
        int [] entry = new int[max + 1];

        for (int j : arr){
            entry[j] += 1;
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

    public static void main(String[] args) {
        int [] arr = {12, 3, 5, 78, 5, 1, 88};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
