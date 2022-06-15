package com.company;
import java.util.Scanner;

public class Code13 {

    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of element you want in series: ");
        n = sc.nextInt();;
        System.out.println("fibonacci series is : ");
        for(i = 0; i < n; i++) {
            System.out.printf("%d ",fibonacci(i));
        }
    }

    public static int fibonacci(int n){
        if(n==0) return 0;
        else if(n==1) return 1;
        else return (fibonacci(n-1)+fibonacci(n-2));
    }

    public static int sum(int n){
        if (n <= 1){
            return n;
        }

        return n + sum(n - 1);
    }
}
