package com.LeetCode;

/*In this Question we have to merge two sorted array nums1[] and nums2[].
* 1. nums1[] length is m + n and nums2 length is n.
* 2. we have to merge these array in nums1[] itself and return nums1 as sorted array.
* */

public class Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0){
            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];

            else
                nums1[k--] = nums2[j--];
        }

        while (i >= 0){
            nums1[k--] = nums1[i--];
        }
        while (j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
