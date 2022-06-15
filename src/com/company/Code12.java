package com.company;

import java.util.Scanner;

public class Code12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int n = sc.nextInt();
        Pattern(n);
    }
    
    public static void Pattern(int row){
        for (int i = 0; i < row + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
