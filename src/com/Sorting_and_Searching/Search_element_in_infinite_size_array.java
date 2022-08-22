package com.Sorting_and_Searching;

import java.util.Arrays;
import java.util.Objects;

/*In this we have to find the upper bound of search in sorted array*/
public class Search_element_in_infinite_size_array {
    public static boolean binarySearch (int low, int high, int target, int [] arr){
        while ( low <= high){
            int mid = (low + high)/2;
            if ( arr[mid] == target){
                return true;
            }

            if ( target > arr[mid] ){
                low = low + 1;
            }

            else {
                high = high - 1;
            }
        }

        return false;
    }

    public static void searchElement(int [] arr /*Array should be sorted*/, int target){
        int slow = 0, fast = 1;

        try {
            while (arr[fast] < target){
                slow = fast;
                fast = 2*fast;
            }

//            return binarySearch (slow, fast - 10, target, arr);
        }

        catch (Exception e){
            System.out.println (e.toString ());
            System.out.println (slow +" "+ fast);
        }
    }

    public static void main(String[] args) {
        int [] arr = {12,4,54,34,32,2,24,5,3,65};
        Arrays.sort (arr);
        System.out.println (Arrays.toString (arr));
        searchElement (arr, 65);
    }
}
