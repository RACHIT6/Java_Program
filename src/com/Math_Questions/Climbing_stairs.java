package com.Math_Questions;

public class Climbing_stairs {
    public static int fib (int n, int [] arr){
        if ( n <= 1 ){
            return arr[n] = 1;
        }

        if ( arr[n] != -1){
            return arr[n];
        }

        arr[n] = fib (n - 1, arr) + fib (n - 2, arr);
        return arr[n];
    }

    public static int possibility (int n){
        int [] arr = new int[n + 1];
        for (int i = 0; i < arr.length; arr[i++] = -1);

        fib (n, arr);
        return arr[n];
    }

    public static void main (String[] args) {
        int n = 4;
        System.out.println (possibility (n));
    }
}
