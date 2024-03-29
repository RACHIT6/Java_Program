package com.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Find_intersection_of_two_array {
    public static ArrayList<Integer> intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        ArrayList<Integer> list = new ArrayList<> ();

        for (int n : nums1){
            if ( map.get (n) == null ){
                map.put (n, 1);
            }

            else {
                map.put (n, map.get(n) + 1);
            }
        }

        for (int n : nums2){
            Integer count = map.get(n);
            if ( map.containsKey (n) && count >= 1 ){
                list.add (n);
                map.put (n, count - 1);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println (intersect (new int[] {1, 1,  2}, new int[] {1, 1}));
    }
}
