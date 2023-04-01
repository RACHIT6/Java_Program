package com.Arrays_Question;

import java.util.Arrays;

public class Median_of_two_sorted_array {
    public static int [] mergeSort (int [] nums1, int [] nums2){
        int i, j, k;
        i = j = k = 0;
        int [] arr = new int[nums1.length + nums2.length];

        while ( i < nums1.length && j < nums2.length ){
            if ( nums1[i] < nums2 [j] ){
                arr[k++] = nums1[i++];
            }

            else {
                arr[k++] = nums2[j++];
            }
        }

        while ( i != nums1.length ){
            arr[k++] = nums1[i++];
        }

        while ( j != nums2.length ){
            arr[k++] = nums2[j++];
        }

        return arr;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] res = mergeSort (nums1, nums2);
        System.out.println (Arrays.toString (res));
        if ( res.length % 2 == 0 )
            return (double) (res[ res.length / 2 - 1 ] + res[ res.length / 2 ]) /2;

        return res[ res.length/2 ];
    }

    public static void main ( String[] args ) {
        double res = findMedianSortedArrays (new int[] {1, 2}, new int[] {3, 4});
        System.out.println (res);
    }
}
