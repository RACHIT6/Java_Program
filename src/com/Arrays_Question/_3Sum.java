package com.Arrays_Question;

import java.util.ArrayList;
import java.util.List;


public class _3Sum {
    public List<List<Integer>> threeSum( int[] nums) {
        List<List<Integer>> mlist = new ArrayList<> ();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < j; k++) {
                    if ( nums[i] + nums[j] + nums[k] == 0 ){
                        List<Integer> list = new ArrayList<> ();
                        list.add (nums[i]);
                        list.add (nums[j]);
                        list.add (nums[k]);
                        mlist.add (list);
                    }
                }
            }
        }

        return mlist;
    }

    public static void main ( String[] args ) {

    }
}
