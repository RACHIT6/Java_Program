package com.Arrays_Question;

import java.util.Arrays;
import java.util.HashMap;

public class Find_the_subArray_whose_sum_is_equal_to_given_sum {
    public static int [] sumSubArray (int [] arr, int sum){
        int start = 0, end = -1;
        int currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<> ();

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if ( currSum - sum == 0 ){
                start = 0;
                end = i;
                break;
            }

            else if ( map.containsKey (currSum - sum) ){
                start = map.get (currSum - sum) + 1;
                end = i;
                break;
            }

            map.put (currSum, i);
        }

        if ( end == -1 ){
            return new int[]{-1};
        }

        int j = 0;
        int [] res = new int[(end - start + 1)];
        for (int i = start; i <= end; i++) {
            res[j++] = arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int [] arr = {10, 15, -5, 15, -10, 5};
        System.out.println (Arrays.toString (sumSubArray (arr, -37)));
    }
}
