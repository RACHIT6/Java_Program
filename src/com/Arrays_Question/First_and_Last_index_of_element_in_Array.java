package com.Arrays_Question;

public class First_and_Last_index_of_element_in_Array {
    public int Search (int [] nums, int target, int low, int high) {
        while ( low <= high ) {
            int mid = (low + high)/2;
            if ( nums[mid] == target )
                return mid;

            if ( nums[mid] > target )
                high = mid - 1;

            else
                low = mid + 1;
        }

        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int [] res = new int[2];
        res[0] = Search (nums, target, 0, nums.length);
        res[1] = Search (nums, target, res[0] + 1, nums.length);

        return res;
    }

    public static void main ( String[] args ) {

    }
}
