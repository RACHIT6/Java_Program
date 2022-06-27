package com.CompetitiveProgramming;

public class Printing_table_of_given_number_using_recursion {
    public static void table(int n, int times){
        if (times <= 0){
            return;
        }

        System.out.println(n * (11 - times));
        table(n, --times);
    }

    public static void main(String[] args) {
        table(5, 10);
    }
}
