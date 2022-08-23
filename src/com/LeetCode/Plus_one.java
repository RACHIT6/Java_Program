package com.LeetCode;

import java.util.Arrays;

public class Plus_one {
    public static int[] plusOne (int [] arr){
        for (int i = arr.length - 1; i >= 0; i--) {
            if ( arr[i] != 9 ){
                arr[i]++;
                break;
            }
            else
                arr[i] = 0;
        }

        if ( arr[0] == 0){
            int [] spare = new int[arr.length + 1];
            spare[0] = 1;
            return spare;
        }

        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {9, 9, 9};
        System.out.println (Arrays.toString (plusOne (arr)));
    }
}
