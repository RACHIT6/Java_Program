package com.Hash_Table;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Find_Intersection_of_two_array {
    public static int [] intersection (int [] arr1, int [] arr2){
        HashSet<Integer> set = new HashSet<> ();
        ArrayList<Integer> list = new ArrayList<> ();

        for (int j : arr1)
            set.add (j);

        for (int j : arr2){
            if ( set.remove (j) ){
                list.add (j);
            }
        }

        int [] res = new int[list.size ()];
        for (int i = 0; i < list.size (); i++){
            res[i] = list.get (i);
        }

        return res;
    }

    public static void main(String[] args) {
        int [] arr1 = {1, 2, 2, 1};
        int [] arr2 = {2, 2};


        System.out.println (Arrays.toString (intersection (arr1, arr2)));
    }
}
