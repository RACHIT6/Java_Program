package com.DSA;

import java.util.Arrays;

public class Practice_Sorting1 {
    public static void bubbleSort (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean elimination = false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]){
                    arr[j - 1] ^= arr[j];
                    arr[j] ^= arr[j - 1];
                    arr[j - 1] ^= arr[j];
                    elimination = true;
                }
            }

            if (!elimination){
                return;
            }
        }
    }

    public static void selectionSort (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void insertionSort (int [] arr){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >=0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static int maxElement (int [] arr){
        int max = Integer.MIN_VALUE;
        for (int element : arr){
            if (max < element){
                max = element;
            }
        }

        return max;
    }

    public static void countSort (int [] arr){
        int max = maxElement(arr);
        int [] entry = new int[max + 1];

        for(int element: arr){
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

    public static void main(String[] args) {
        int [] arr= {23, 54, 534, 87, 1, 4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
