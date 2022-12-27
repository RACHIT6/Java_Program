package com.PWSkills;

import java.util.Arrays;

public class Sort_array_of_0_and_1 {
    public static void sort (int [] nums){
        int j = nums.length - 1;

        for (int i = 0; i < nums.length; ) {
            if ( i >= j )
                break;

            if ( nums[i] == 1 && nums[j] == 0 ){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            else if ( nums[j] != 0 )
                j--;

            else
                i++;
        }
    }

    public static void main ( String[] args ) {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        sort (arr);
        System.out.println (Arrays.toString (arr));
    }
}
