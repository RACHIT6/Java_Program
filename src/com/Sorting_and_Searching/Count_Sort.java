package com.Sorting_and_Searching;
import java.util.Arrays;

/*Count sort can only sort non-negative element*/
public class Count_Sort {
    public static int maxElement (int [] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr){
            max = Math.max (j, max);
        }

        return max;
    }

    public static void countSort (int [] arr){
        int max = maxElement (arr);
        int [] entry = new int[max + 1];

        for (int j : arr){
            entry[j]++;
        }

        int i = 0, j = 0;
        while ( i <= max ){
            if ( entry[i] > 0){
                arr[j] = i;
                entry[i]--;
                j++;
            }

            else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {32,43,4,32,23,12,2};
        countSort (arr);
        System.out.println (Arrays.toString (arr));
    }
}
