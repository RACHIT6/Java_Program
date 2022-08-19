package com.Recursion;

public class Reverse_String_using_recursion {
    public static String reverse (String s, String ans){
       if ( s.length () == 0 )
           return ans;

       ans += s.charAt (s.length () - 1);
       return reverse (s.substring (0, s.length () - 1), ans);
    }

    public static void main(String[] args) {
        System.out.println (reverse ("Rachit", ""));
    }
}
