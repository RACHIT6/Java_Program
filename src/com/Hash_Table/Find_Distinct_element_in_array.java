package com.Hash_Table;

import java.util.HashSet;

public class Find_Distinct_element_in_array {
    public static int noOfDistinctElement (int [] arr){
        HashSet<Integer> set = new HashSet<> ();
        for (int j : arr){
            set.add (j);
        }

        return set.size ();
    }

    public static void main(String[] args) {
        int [] arr = {3, 3, 5, 5, 10};
        System.out.println (noOfDistinctElement (arr));
    }
}
