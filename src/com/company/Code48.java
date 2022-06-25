package com.company;

import java.util.Scanner;

public class Code48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the bit you want to check: ");
        int n = sc.nextInt();

        int mask = 1 << n;

        if ((num & mask) > 0){
            System.out.println("Set");
        }

        else{
            System.out.println("Not Set");
        }
    }
}
