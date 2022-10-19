package com.Arrays_Question;

public class Sliding_Window_Algorithm {
    public static void main ( String[] args ) {
        int [] arr = {2,1,43,54,34,22,4,5};
        int k = 3;
        int max = 0;

        for (int i = 0; i <= arr.length - k; i++) {
            max = arr[i];

            for (int j = i; j < k + i; j++) {
                max = Math.max (arr[j], max);
            }
            System.out.print (max+ " ");
        }
    }
}
