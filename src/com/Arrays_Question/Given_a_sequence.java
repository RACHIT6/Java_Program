package com.Arrays_Question;

public class Given_a_sequence {
    public static Boolean hasSequence (int [] arr){
        int i = 0;
        if ( arr[1] > arr[0] ){
            for (i = 0; i < arr.length - 1; i++) {
                if ( arr[i] >= arr[i + 1]){
                    break;
                }
            }

            for (int j = i; j < arr.length - 1; j++) {
                if ( arr[i] <= arr[j + 1]){
                    return false;
                }
            }

        }

        else {
            for (i = 0; i < arr.length - 1; i++) {
                if ( arr[i] <= arr[i + 1]){
                    break;
                }
            }

            for (int j = i; j < arr.length - 1; j++) {
                if ( arr[i] >= arr[j + 1]){
                    return false;
                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {3, 7, 7};
        System.out.println (hasSequence (arr));
    }
}
