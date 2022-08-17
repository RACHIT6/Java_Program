package com.LeetCode;

public class Single_Number {
    public static int UniqueNumber (int [] arr /*Given array contains only one unique elements other appear twice*/ ){
        int unique = 0;
        for (int j: arr){
            unique ^= j;
        }

        return unique;
    }

    public static void main(String[] args) {
        System.out.println (UniqueNumber (new int[]{2, 1, 2}));
    }
}
