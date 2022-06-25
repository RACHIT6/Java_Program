package com.CompetitiveProgramming;

import java.util.Scanner;

public class GCD_and_LCM_of_two_No {
    static int gcd(int a, int b){
        if (b == 0){
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(10, 12));
    }
}
