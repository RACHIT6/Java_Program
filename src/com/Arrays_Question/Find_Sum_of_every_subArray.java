package com.Arrays_Question;

import java.util.ArrayList;

public class Find_Sum_of_every_subArray {
    public static void subArraySum (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                System.out.println (sum);
            }
        }
    }

    public static void main(String[] args) {
        subArraySum (new int[]{1, 2, 3});
    }
}
