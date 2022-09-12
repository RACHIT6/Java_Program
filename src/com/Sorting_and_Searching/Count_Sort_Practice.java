package com.Sorting_and_Searching;

import java.util.Arrays;

public class Count_Sort_Practice {
    public static int maxNum (int [] arr){
        int max = Integer.MIN_VALUE;
        for (int n : arr)
            max = Math.max (max, n);

        return max;
    }

    public static void countSort (int [] arr){
        int max = maxNum (arr);
        int [] entry = new int[max + 1];
        for (int n : arr)
            entry[n]++;

        int i = 0, j = 0;
        while ( i <= max ){
            if ( entry[i] > 0 ){
                arr[j++] = i;
                entry[i]--;
            }

            else {
                i++;
            }
        }
    }

    public static void main (String[] args) {
        int [] arr = {2, 3, 54, 43, 1, 21};
        countSort (arr);
        System.out.println (Arrays.toString (arr));
    }
}
