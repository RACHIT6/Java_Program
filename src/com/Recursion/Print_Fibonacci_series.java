package com.Recursion;

public class Print_Fibonacci_series {
    public static int printFib (int n){
        if ( n <= 1 )
            return n;

        return printFib (n - 1) + printFib (n - 2);
    }

    public static void main(String[] args) {
        System.out.println (printFib ( 6));
    }
}
