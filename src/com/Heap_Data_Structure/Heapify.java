package com.Heap_Data_Structure;

import java.util.ArrayList;
import java.util.Collections;

public class Heapify {
    public static void insert (ArrayList<Integer> arr, int val){
        arr.add (val);

        int i = arr.size ();
        while ( i > 1 ){
            if ( arr.get (i/2 - 1) < arr.get (i - 1)){
                Collections.swap (arr, i/2 - 1, i - 1);
                i /= 2;
            }

            else
                return;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add (50);
        list.add (20);
        list.add (30);
        list.add (5);
        list.add (10);
        insert (list, 100);
        System.out.println (list);
    }
}
