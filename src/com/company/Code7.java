package com.company;

import java.util.Scanner;

public class Code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter %d element: ", i);
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n/2; i++) {
            int temp = arr[n - i - 1];
            arr[n -i - 1] = arr[i];
            arr[i] = temp;
        }

        for(int element: arr){
            System.out.print(element+ " ");
        }
    }
}
