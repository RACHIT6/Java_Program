package com.CompetitiveProgramming;

public class Checking_String_is_Palindrome_or_not {
//    Iterative approach
    static boolean Palindrome_iter(String s){
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }

        return true;
    }

//    Recursive approach
    static boolean Palindrome_rec(String s, int start, int end){
        if (start >= end){
            return true;
        }

        else if (s.charAt(start) != s.charAt(end)){
            return false;
        }

        return Palindrome_rec(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        System.out.println(Palindrome_iter("aaba"));
        System.out.println(Palindrome_rec("aaba", 0, "aaba".length() - 1));
    }
}
