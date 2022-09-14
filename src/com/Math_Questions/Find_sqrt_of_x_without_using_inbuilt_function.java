package com.Math_Questions;

public class Find_sqrt_of_x_without_using_inbuilt_function {
    public static int search (int x){
        int low = 1, high = x/2, ans = 0, mid = 0;
        long temp;

        while ( low <= high ){
            mid = (low + high)/2;
            temp = (long) mid * (long) mid;

            if ( temp == x ){
                return mid;
            }

            else if ( temp < x ){
                ans = mid;
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return mid;
    }

    public static int sqrt (int x){
        if ( x < 2 ){
            return x;
        }

        return search (x);
    }

    public static void main (String[] args) {
        int n = 64;
        System.out.println (sqrt(n));
    }
}
