package com.company;

import java.util.Scanner;

public class Code6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int sum = 0;
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter %d element: ", i);
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        float avg = (float)sum/n;
        System.out.println("The average of marks is "+ avg);
    }
}
