package com.CompetitiveProgramming;

import java.util.Scanner;

public class Trailing_zeros_of_given_factorial_number {
    public static int Trailing_Zero(int num){
        int count = 0;
        for (int i = 5; i <= num; i *= 5) {
            count += num/i;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        System.out.println("No. of trailing zeros are "+ Trailing_Zero(val));
    }
}
