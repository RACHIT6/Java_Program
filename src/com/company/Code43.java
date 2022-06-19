package com.company;

public class Code43 {
//    Write a Java program to reverse an array of integer values.
    public static void reverse(int[] arr){
        int n = arr.length;
        for (int i = 0; i <= n/2; i++) {
            int temp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,43,65,5,43};
        System.out.print("Original Array: ");
        for (int element : arr) {
            System.out.print(element+ " ");
        }

        System.out.println();
        reverse(arr);
        System.out.print("Reversed Array: ");
        for (int element : arr) {
            System.out.print(element+ " ");
        }
    }
}
