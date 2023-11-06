package com.Dynamic_Programming;

public class Climbing_Stairs {
    public static int climbingUp (int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        int rec1 = climbingUp (n - 1);
        int rec2 = climbingUp (n - 2);
        int rec3 = climbingUp (n - 3);

        return rec1 + rec2 ;
    }

    public static void main ( String[] args ) {
        int n = climbingUp (6);
        System.out.println (n);
    }
}
