package com.LeetCode;

import java.util.Arrays;

public class Find_the_insertion_index {
    public static int insertIndex (int [] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }

            else if (arr[i] > target){
                return i;
            }
        }

        return arr.length - 1;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 43, 32, 31, 2, 23, 3, 231, 1, 1, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = insertIndex(arr, 4); // this function will return the actual or expected index for given element
        System.out.println(n);
    }
}
