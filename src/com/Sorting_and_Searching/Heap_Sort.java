package com.Sorting_and_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Heap_Sort {
    public static void heapify (ArrayList<Integer> heap, int n, int currIndex){
        int largest = currIndex - 1;
        int left = 2 * currIndex - 1;
        int right = 2 * currIndex;

        if ( left < n && heap.get (left) > heap.get (largest) )
            largest = left;

        if ( right < n && heap.get (right) > heap.get (largest) )
            largest = right;

        if ( largest != currIndex - 1 ){
            Collections.swap (heap, largest, currIndex - 1);
            heapify (heap, n, largest + 1);
        }
    }

    public static void buildHeap (ArrayList<Integer> heap){
        for (int i = heap.size ()/2; i > 0; i--) {
            heapify (heap, heap.size () , i);
        }
    }

    public static void heapSort (ArrayList<Integer> arr){
        buildHeap (arr);
        for (int i = arr.size () - 1; i > 0; i--) {
            Collections.swap (arr, 0, i);
            heapify (arr, i, 1);
        }
    }

    public static void main (String[] args) {
        ArrayList<Integer> arr = new ArrayList<> (Arrays.asList (1, 200, 2, 43, 6, 65));
        heapSort (arr);
        System.out.println (arr);
    }
}
