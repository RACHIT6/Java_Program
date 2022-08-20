package com.Recursion;

import java.util.Scanner;

public class Print_Reverse_String_using_recursion {
    static String Reverse(String s, int i, String current){
        if (current.length() == s.length() || s.length() == 0){
            return current;
        }

        return Reverse(s, i + 1, current + s.charAt(s.length() - i - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Reverse(s, 0, ""));
    }
}
