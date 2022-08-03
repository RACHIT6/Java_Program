package com.DSA;

import java.util.Arrays;

public class Sorting_Algorithms {
    public static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int eliminate = -1;
             for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]){
                    eliminate = 0;
                    arr[j - 1] = arr[j - 1] ^ arr[j];
                    arr[j] = arr[j - 1] ^ arr[j];
                    arr[j - 1] = arr[j - 1] ^ arr[j];
                }
            }

            if (eliminate == -1){
                return;
            }
        }
    }

    public static void selectionSort (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[i] ^ arr[j];
                }
            }
        }
    }

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

    public static int [] mergeSort (int [] A, int [] B){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] arr = new int[(A.length + B.length)];

        while (i < A.length && j < B.length){
            if (A[i] < B[j]){
                arr[k] = A[i];
                i++;
            }

            else {
                arr[k] = A[j];
                j++;
            }
            k++;

        }

        System.out.println(k);
        while (i < A.length){
            arr[k++] = A[i++];
        }

        while (j < B.length){
            arr[k++] = B[j++];
        }

        return arr;
    }

    public static int partition(int [] arr, int l, int h){
        int pivot = arr[arr.length/2];
        int i = l + 1;
        int j = h;

        while (i < j) {
            while (arr[i] <= pivot){
                i++;
            }

            while (arr[j] > pivot){
                j--;
            }

            if (i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quickSort (int [] arr, int start, int end){
        if (start < end){
            int partitionIndex = partition(arr, start, end);
            System.out.println(partitionIndex);
            quickSort(arr, start, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }

    }

    public static int maxElement (int [] arr){
        int max = Integer.MIN_VALUE;
        for (int element : arr){
            if (element > max){
                max = element;
            }
        }

        return max;
    }

    public static void countSort (int [] arr){
        int max = maxElement(arr);
        int [] entry = new int[max + 1];

//        Marking value of arr as index
        for (int element: arr){
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
        int [] arr = {6, 9, 1, 4, 6, 4, 14, 4, 15, 6};
        countSort(arr);
//        int [] arr1 = mergeSort(arr, new int[]{2, 4, 16});
        System.out.println(Arrays.toString(arr));
    }
}
