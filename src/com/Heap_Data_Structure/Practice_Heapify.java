package com.Heap_Data_Structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice_Heapify {

    /*NOTE - n is compulsory for HeapSort. */
    public static void heapify (ArrayList<Integer> heap, int i, int n){
        int largest = i - 1;
        int left = 2 * i - 1;
        int right = 2 * i;

        if ( left < n && heap.get (left) > heap.get (largest) )
            largest = left;

        if ( right < n && heap.get (right) > heap.get (largest) )
            largest = right;

        if ( largest != i - 1 ){
            Collections.swap (heap, largest, i - 1);
            heapify (heap, largest + 1, n);  /* Note - largest + 1 is for heapify the largest element in 0 indexing */
        }
    }

    public static void buildHeap (ArrayList<Integer> heap){
        for (int i = heap.size ()/2; i > 0; i--) {
            heapify (heap, i, heap.size ());
        }
    }


    public static void main (String[] args) {
        ArrayList<Integer> arr = new ArrayList<> (Arrays.asList (3, 43, 34, 65, 1, 100));
        buildHeap (arr);
        System.out.println (arr);
    }
}
