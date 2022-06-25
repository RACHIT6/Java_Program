package com.CompetitiveProgramming;

import java.util.Scanner;

public class Clear_nth_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int val = sc.nextInt();

        System.out.print("Enter the index of bit to be clear: ");
        int index = sc.nextInt();

        int mask = (1<<index);
        mask = ~(mask);
        int result = mask & val;

//        checking if given bit is already set
        if (result == val){
            System.out.println("Already clear, number is "+ result);
        }

        else{
            System.out.printf("The value of %d is changed to %d after clearing the given bit", val, result);
        }

    }
}
