package com.Recursion;

public class X_to_the_power_N {
    public static int power (int x, int n){
        if ( n == 0 ){
            return 1;
        }

        if ( x == 0 ){
            return 0;
        }
        int power = power (x, n - 1);
        return x * power;
    }

    public static void main(String[] args) {
        System.out.println (power (3, 3));
    }
}
