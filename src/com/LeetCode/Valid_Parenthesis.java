package com.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class Valid_Parenthesis {
    public static Boolean match(char a, char b){
        if ( a == ']' && b == '['){
            return true;
        }
        else if ( a == ')' && b == '('){
            return true;
        }
        else if ( a == '}' && b == '{'){
            return true;
        }

        return false;
    }

    public static boolean isValid(String s) {
        Stack<Character> list = new Stack<> ();

        for ( int i  = 0; i < s.length (); i++ ){
            if ( s.charAt (i) == '[' ||  s.charAt (i) == '(' ||  s.charAt (i) == '{')
                list.push (s.charAt (i));

            else if (s.charAt (i) == ']' ||  s.charAt (i) == ')' ||  s.charAt (i) == '}'){
                if ( list.isEmpty () ){
                    return false;
                }

                char popped_char = list.pop ();
                if ( !match(s.charAt (i), popped_char) ){
                    return false;
                }
            }

        }

        if ( !list.isEmpty () ){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int [] arr = {32,453,34};
        System.out.println ();
        System.out.println (isValid (""));
    }
}
