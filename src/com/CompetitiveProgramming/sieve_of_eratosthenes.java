package com.CompetitiveProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sieve_of_eratosthenes {
    public static boolean[] SOF(int lower, int upper){
        boolean [] check = new boolean[upper + 1];
        Arrays.fill(check, true);

        check[0] = false;
        check[1] = false;

        for (int i = 2; i*i <= upper; i++) {
            for (int j = 2*i; j <= upper; j += i) {
                check[j] =  false;
            }
        }

        return check;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int low_bound = sc.nextInt();

        System.out.print("Enter the upper bound: ");
        int upper_bound = sc.nextInt();

        System.out.println("Prime no in given range are: ");
        for (int i = low_bound; i < upper_bound; i++) {
            if (SOF(low_bound, upper_bound)[i]){
                System.out.print(i+ " ");
            }
        }
    }
}
