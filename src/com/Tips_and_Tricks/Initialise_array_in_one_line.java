package com.Tips_and_Tricks;

import java.util.Arrays;

public class Initialise_array_in_one_line {
    public static void main (String[] args) {
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; arr[i++] = 2);
        System.out.println (Arrays.toString (arr));
    }
}
