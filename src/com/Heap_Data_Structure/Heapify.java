package com.Heap_Data_Structure;

import java.util.ArrayList;
import java.util.Collections;

public class Heapify {
    public static void heapify (ArrayList<Integer> arr, int n, int currIndex){
        int largest = currIndex - 1;
        int left = 2*currIndex - 1;
        int right = 2*currIndex;

        if ( left < n && arr.get (largest) < arr.get (left) ){
            largest = left;
        }

        if ( right < n && arr.get (largest) < arr.get (right) ){
            largest = right;
        }

        if ( largest != currIndex - 1 ){
            Collections.swap (arr, largest, currIndex - 1);
            heapify (arr, n, largest + 1);
        }
    }

    /*
    *       20
    *   21      310
    * 2   121
    * */

    public static void buildHeap (ArrayList<Integer> arr){
        for (int i = arr.size ()/2; i > 0; i--) {
            heapify (arr, arr.size (), i);
        }
    }

    public static void heapSort (ArrayList<Integer> arr){
        buildHeap (arr);
        for (int i = arr.size () - 1; i > 0; i--) {
            Collections.swap (arr, 0, i);
            heapify (arr, i, 1);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add (20);
        list.add (21);
        list.add (310);
        list.add (5);
        list.add (121);
        list.add (1);

        heapSort (list);
        System.out.println (list);
    }
}
