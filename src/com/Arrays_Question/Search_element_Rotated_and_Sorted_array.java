package com.Arrays_Question;

public class Search_element_Rotated_and_Sorted_array {
    public static boolean advanceBinarySearch (int [] arr, int key){
        int low = 0, high = arr.length - 1;
        while ( low <= high){
            int mid = (low + high)/2;
            if ( arr[mid] == key)
                return true;

            else if (arr[low] < arr[mid]){
                if ( key >= arr[low] && key < arr[mid]){
                    high = mid - 1;
                }

                else {
                    low = mid + 1;
                }
            }

            else {
                if ( key >= arr[mid] && key < arr[high]){
                    low = mid + 1;
                }

                else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }

    public static boolean advanceBinarySearchRecursive (int [] arr, int low, int high, int key){
        int mid = (low + high)/2;

        if ( arr[mid] == key){
            return true;
        }

        else if ( arr[low] < arr[mid] ){
            if ( key >= arr[low] && key < arr[mid] ){
                return advanceBinarySearchRecursive (arr, low, mid - 1, key);
            }

            else {
                return advanceBinarySearchRecursive (arr, mid + 1, high, key);
            }
        }

        else {
            if ( key >= arr[mid] && key < arr[high] ){
                return advanceBinarySearchRecursive (arr, mid + 1, high, key);
            }

            else {
                return advanceBinarySearchRecursive (arr, low, high - 1, key);
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {4, 5, 6, 1, 2, 3};
        System.out.println (advanceBinarySearchRecursive (arr, 0, arr.length - 1, 4));
    }
}
