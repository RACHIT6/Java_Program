package com.Stack;

import java.util.Stack;

public class Parenthesis_Checker {
    public static boolean match (char a, char b){
        if (a == '{' && b == '}')
            return true;
        if (a == '[' && b == ']')
            return true;

        return a == '(' && b == ')';
    }

    public static Boolean checker (String str) {
        Stack<Character> s = new Stack<> ();
        int i = 0;
        while ( i < str.length () ) {
            if ( str.charAt (i) == '{' || str.charAt (i) == '(' || str.charAt (i) == '[' ){
                s.push (str.charAt (i));
            }

            else if ( str.charAt (i) == '}' || str.charAt (i) == ')' || str.charAt (i) == ']' ){
                if ( s.isEmpty () ){
                    return false;
                }

                else if ( !match (s.peek (), str.charAt (i)) ){
                    return false;
                }

                else {
                    s.pop ();
                }
            }

            i++;
        }

        if ( !s.isEmpty () ) {
            return false;
        }

        return true;
    }

    public static void main ( String[] args ) {
        String str = "(({}))";
        System.out.println (checker (str));
    }
}
