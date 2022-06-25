package com.CompetitiveProgramming;

import java.util.Scanner;

public class FInd_no_of_Set_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int val = sc.nextInt();
        int temp = val, count = 0;

        while(temp != 0){
            if (temp > 0)
                count++;

            temp = temp & temp - 1;
        }

        System.out.printf("No. of set bits in %d is %d", val, count);
    }
}
