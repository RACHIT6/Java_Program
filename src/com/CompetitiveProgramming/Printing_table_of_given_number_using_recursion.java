package com.CompetitiveProgramming;

public class Printing_table_of_given_number_using_recursion {
    public static void table(int n, int times){
        int j = 1;
        if (j == 11){
            return;
        }

        System.out.println(n * j);
        table(n, ++j);
    }

    public static void main(String[] args) {
        table(5, 10);
    }
}
