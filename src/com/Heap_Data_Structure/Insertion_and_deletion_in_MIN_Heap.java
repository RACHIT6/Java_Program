package com.Heap_Data_Structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Insertion_and_deletion_in_MIN_Heap {
    public static void insert (ArrayList<Integer> arr, int val){
        arr.add (val);

        int i = arr.size ();
        while ( i > 1 ){
            if ( arr.get (i/2 - 1) > arr.get (i - 1)){
                Collections.swap (arr, i/2 - 1, i - 1);
                i /= 2;
            }

            else
                return;
        }
    }

    public static void delete (ArrayList<Integer> arr){
        Collections.swap (arr, 0, arr.size () - 1);
        arr.remove (arr.size () - 1);
        int i = 1;
        while (i < arr.size ()){
            int left = 2*i - 1;
            int right = 2*i;

            if ( left < arr.size () && right < arr.size () ){
                int index = arr.get (left) < arr.get (right) ? left : right;
                if ( arr.get (index) < arr.get (i - 1)){
                    Collections.swap (arr, index, i - 1);
                }
                i = index;
            }

            else
                break;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<> ();
        list.add (5);
        list.add (20);
        list.add (30);
        list.add (35);
        list.add (50);
        insert (list, 1);
        delete (list);
        delete (list);
        delete (list);
        System.out.println (list);
    }
}
