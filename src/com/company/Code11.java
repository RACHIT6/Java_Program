package com.company;
import java.util.Scanner;

public class Code11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        table(n);
    }

    public static void table(int n){
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x "+ i+ " = "+ n*i);
        }
    }
}
