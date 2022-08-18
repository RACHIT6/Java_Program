package com.Arrays_Question;

public class Max_element_in_array {
    public static int maximum (int [] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr){
            max = Math.max (max, j);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println (maximum (new int[]{2,3,32,3,23}));
    }
}
