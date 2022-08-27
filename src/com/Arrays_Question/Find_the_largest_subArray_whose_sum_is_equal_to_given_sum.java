package com.Arrays_Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_the_largest_subArray_whose_sum_is_equal_to_given_sum {
    public static List<List<Integer>> maxSumSubArray (int [] arr, int sum){
        int start = 0, end = -1;
        int currSum = 0;
        int length = 0;
        HashMap<Integer, Integer> map = new HashMap<> ();
        List<List<Integer>> total = new ArrayList<> ();

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if ( currSum - sum == 0){
                start = 0;
                end = i;
            }

            /*If you want all sum array then remove length condition*/
            else if ( map.containsKey (currSum - sum) && (i - (map.get (currSum - sum) + 1)) > length){
                start = map.get (currSum - sum) + 1;
                end = i;
                length = end - start;
                List<Integer> list = new ArrayList<> ();
                for (int j = start; j <= end; j++) {
                    list.add(arr[j]);
                }

                total.add (list);
            }

            map.put (currSum, i);
        }

        return total;
    }

    public static void main(String[] args) {
        int [] arr = {10, 15, -5, 15, 10, 5};
        System.out.println (maxSumSubArray (arr, 10));
    }
}
