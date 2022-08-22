package com.Sorting_and_Searching;

import java.util.Arrays;

public class Binary_Search {
    public static int search (int [] arr, int target){
        int low = 0, high = arr.length - 1;
        while ( low < high ){
            int mid = (low + high)/2;
            if ( arr[mid] == target )
                return mid;

            if ( arr[mid] > target )
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {32,43,4,32,23,12,2};
        Arrays.sort (arr);
        System.out.println (Arrays.toString (arr));
        System.out.println (search (arr, 23));
    }
}
