package com.Hash_Table;

import java.util.Arrays;
import java.util.HashSet;

public class Find_union_of_Two_Array {
    public static int [] union (int [] arr1, int [] arr2){
        HashSet<Integer> set = new HashSet<> ();
        for (int j : arr1)
            set.add (j);

        for (int j : arr2)
            set.add (j);

        int i = 0;
        int [] res = new int[set.size ()];
        for (int j : set){
            res[i++] = j;
        }

        return res;
    }

    public static void main(String[] args) {
        int [] arr1 = {3, 4, 6, 7};
        int [] arr2 = {4, 6, 8, 7};

        System.out.println (Arrays.toString (union (arr1, arr2)));
    }
}
