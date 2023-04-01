package com.LeetCode;

import java.util.HashMap;

public class Two_sum_2 {
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap <> ();
        for (int i = 0; i < numbers.length; i++){
            map.put (i, numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if ( map.containsKey (target - numbers[i]) ){
                return new int[] {i, map.get (target - numbers[i])};
            }
        }

        return new int[] {-1, -1};
    }

    public static void main ( String[] args ) {

    }
}
