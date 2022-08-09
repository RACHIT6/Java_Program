package com.LeetCode;

import java.util.Arrays;

public class Remove_duplicate_from_sorted_array {
    public static int removeDuplicate (int [] arr){
//        Side case
        if (arr.length == 0 || arr.length == 1){
            return arr.length;
        }

//        Main case
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]){
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[arr.length - 1]; // we have to add last element manually.
        return j;
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 43, 32, 31, 2, 23, 3, 231, 1, 1, 1};
        Arrays.sort(arr);

        int n = removeDuplicate(arr);
        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
