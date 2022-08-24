package com.LeetCode;

import java.util.Arrays;

public class Move_Zeroes {
    public static void moveZero (int [] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            if ( nums[i] == 0 ){
                int j  = i + 1;
                int index = nums.length - 1;
                while (j < nums.length){
                    if ( nums[j] != 0){
                        index = j;
                        break;
                    }
                    j++;
                }

                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {0, 0, 2};
        moveZero (arr);
        System.out.println (Arrays.toString (arr));
    }
}
