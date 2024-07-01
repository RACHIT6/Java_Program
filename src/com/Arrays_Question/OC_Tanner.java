package com.Arrays_Question;

import java.util.*;

public class OC_Tanner {

    public static void main ( String[] args ) {
        int [] arr = {13, 12, 11, 13, 14, 13, 7, 7, 13, 14, 12};
        HashMap<Integer, Integer> map = new HashMap<> ();

        for (int n : arr) {
            map.put (n, map.getOrDefault (n, 0 ) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        list.forEach((fruit)->System.out.print("(" + fruit.getKey() + ", " + fruit.getValue() + ")"));

    }
}
