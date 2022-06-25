package com.company;

import java.util.Scanner;

public class Code49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the bit you want to check: ");
        int n = sc.nextInt();
        int count = 0;

        while(n != 0){
            n = n & n - 1;
            if (n > 0) {
                count++;
            }
        }

        System.out.println(count + 1);
    }
}
