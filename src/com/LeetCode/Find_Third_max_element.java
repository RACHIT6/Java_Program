package com.LeetCode;

import java.util.*;

public class Find_Third_max_element {
    public int thirdMax(int[] nums) {
        List<Integer> list = new ArrayList<> ();
        HashSet<Integer> set = new HashSet<> ();

        for (int n : nums)
            set.add (n);

        int j = 0;
        Integer [] res = new Integer[set.size ()];
        for (Integer integer : set) {
            res[j++] = integer;
        }

        Arrays.sort (res, Collections.reverseOrder ());

        if ( res.length < 3){
            return res[res.length - 1];
        }

        return res[2];
    }

    public static void main(String[] args) {
        int [] nums = {12, 3, 12};
        HashSet<Integer> set = new HashSet<> ();
    }
}
