package com.CompetitiveProgramming;

import java.util.ArrayList;

public class Find_two_non_repeating_no_in_array_using_XOR_element_repeat_twice_only {
    public static void main(String[] args) {
        int unique = 0;
        int [] arr = {1, 2, 2, 1, 3, 3, 4};

        for (int element: arr){
            unique ^= element;
        }

        unique  = unique & -unique;
        int first_no = 0;
        int Second_no = 0;
        for (int element: arr){
            if ((element & unique) > 0){
                first_no = first_no ^ element;
            }

            else{
                Second_no = Second_no ^ element;
            }

        }

        if (Second_no == 0){
            System.out.println("There is only one unique element, "+ first_no);
        }

        else if (unique == 0){
            System.out.println("There is no unique element");
        }

        else{
            System.out.print("First unique element is "+ first_no);
            System.out.println(" and second is "+ Second_no);
        }
    }
}
