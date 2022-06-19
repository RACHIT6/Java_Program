// Write a Java program to find the maximum and minimum value of an array.

package com.company;
import java.util.Scanner;

public class Code42 {
    public static int[] LAndM(int [] arr){
        int smallest = arr[0];
        int largest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest){
                largest = arr[i];
            }

            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        int[] arr = {10,43,65,5,43};

        int[] res = LAndM(arr);

        System.out.println("Smallest: "+ res[0]);
        System.out.println("Largest: "+ res[1]);
    }
}
