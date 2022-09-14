package com.company;

import java.util.Arrays;

public class Code54 {
    public static void main (String[] args) {
        String str = "I am good";
        String temp = "";

        for (int i = 0; i < str.length (); i++) {
            if ( str.charAt (i) == ' '){
                System.out.println (temp);
                temp = "";
                i++;
            }

            temp += str.charAt (i);
        }

        System.out.println (temp);
    }
}
