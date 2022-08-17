package com.LeetCode;

public class Majority_Element {
    public static int majElement (int [] arr){
        int majIndex = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if ( arr[majIndex] == arr[i]){
                count++;
            }

            else {
                count--;
            }

            if ( count == 0 ){
                majIndex = i;
                count = 1;
            }
        }

        return arr[majIndex];
    }

    public static void main(String[] args) {
        System.out.println (majElement (new int[]{2,2,1,1,1,2,2}));
    }
}
