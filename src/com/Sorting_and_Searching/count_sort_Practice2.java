package com.Sorting_and_Searching;

import java.util.Arrays;

public class count_sort_Practice2 {
    public static void main ( String[] args ) {
        int [] arr = {5, 3, 2, 6, 4, 1, 3, 7};
        int size = Integer.MIN_VALUE;

        for (int n : arr)
            size = Math.max (size, n);

        int [] count = new int[size + 1];

        for (int n : arr)
            count[n]++;

        int j = 0, i = 0;
        while (i < size) {
            if ( count[i]  > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }

            else {
                i++;
            }
        }

        System.out.println (Arrays.toString (arr));
    }
}
