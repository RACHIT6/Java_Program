package com.Arrays_Question;

public class Find_length_of_longest_Arithmetic_subArray {

    /* An array is called an arithmetic array if consecutive diff of elements is equal upto to n */
    public static int longestArithmeticSubArray (int [] arr){
        if ( arr.length < 2 ){
            return -1;
        }

        if ( arr.length == 2 ){
            return 2;
        }

        int ad /*Alternate difference*/ = arr[1] - arr[0];
        int curr = 2;
        int max = 2;
        int j = 3;
        while ( j < arr.length){
            if ( ad == arr[j] - arr[j - 1]){
                curr++;
            }

            else {
                ad = arr[j] - arr[j - 1];
                curr = 2;
            }
            max = Math.max (max, curr);
            j++;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println (longestArithmeticSubArray (new int[] {10, 7, 4, 6, 8, 10, 11}));
    }
}
