package com.company;

public class Code44 {
    //        Write a Java program to find the duplicate values of an array of integer values.

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,43,1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j){
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }
}
