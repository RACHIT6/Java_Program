package com.LeetCode;

import java.util.Arrays;

public class remove_all_occurrence_of_given_number {
    public static int removeOccurrence (int [] arr, int target){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target)
                arr[j++] = arr[i];
        }

        return j;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 43, 32, 31, 2, 23, 3, 231, 1, 1, 1};

        int n = removeOccurrence(arr, 2);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
