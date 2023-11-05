package com.Dynamic_Programming;

public class factorial {

    /*With Recursion*/
    public static int fibonacciRec (int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacciRec (n - 1) + fibonacciRec (n - 2);
    }

    /*With Dp Using extra space to store result*/
    public static int fibonacciRec (int n, int [] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        return fibonacciRec (n - 1) + fibonacciRec (n - 2);
    }

    public static void main ( String[] args ) {
        int n = 10;
        int [] dp = new int[n + 1];
        System.out.println (fibonacciRec (n, dp));
    }
}
