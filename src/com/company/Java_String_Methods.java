package com.company;

import java.util.Scanner;

public class Java_String_Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 2";


        System.out.println(String.format("The number is %.2f", 2.44354f));
        System.out.println(str1.contains("Exercise"));
        System.out.println(str1.endsWith("Exercise 1"));
        System.out.println("    r     ".trim());
    }
}
