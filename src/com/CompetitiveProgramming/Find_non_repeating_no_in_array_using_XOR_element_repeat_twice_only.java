package com.CompetitiveProgramming;

import java.util.Scanner;

public class Find_non_repeating_no_in_array_using_XOR_element_repeat_twice_only {
    public static void main(String[] args) {
        int unique = 0;
        int [] arr = {1, 2, 5, 3, 2, 1, 3};

        for (int element: arr){
            unique ^= element;
        }

        if (unique == 0){
            System.out.println("No unique element in array");
        }

        else{
            System.out.println("The unique element in array is "+ unique);
        }
    }
}
