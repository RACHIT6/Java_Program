package com.Recursion;

public class Print_all_SubString {
    public static void subString (String s, String ans){
        if ( s.length () == 0 ){
            System.out.println (ans);
        }

        char ch = s.charAt (0);
        String res = s.substring (1);
        subString (res, ans);
        subString (res, ans + ch);
    }

    public static void main(String[] args) {
        subString ("ABC", "");
    }
}
