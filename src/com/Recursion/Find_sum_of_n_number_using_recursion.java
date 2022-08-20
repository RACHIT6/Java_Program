package com.Recursion;

public class Find_sum_of_n_number_using_recursion {
    static int sum(int n){
        if (n == 1){
            return 1;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(2));
    }
}
