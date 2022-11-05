package com.Arrays_Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Sliding_Window_Maximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int [] res = new int[nums.length - k + 1];
        PriorityQueue<Integer> heap = new PriorityQueue<Integer> (Collections.reverseOrder());
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            heap.add (nums[i]);
            if ( heap.size () == k ){
                res[j] = heap.peek ();
                heap.remove (nums[j]);
                j++;
            }

        }

        return res;
    }

    public static void main ( String[] args ) {
        int [] arr = {9, 11};
        System.out.println (Arrays.toString (maxSlidingWindow (arr, 2)));
    }
}
