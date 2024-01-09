package com.String;

import java.util.Stack;

public class reverse_substring_between_each_pair_of_parenthesis {
    public String reverseParentheses(String s) {
        Stack<Character> st =  new Stack<> ();

        for (char n : s.toCharArray ()) {
            if ( n != ')' ) {
                st.push (n);
            }

            String popped = "";
            if ( n == ')' ) {
                while ( !st.isEmpty () && n != '(' )
                    popped += st.pop ();
            }

            st.pop ();

            
        }

        return "";
    }

    public static void main ( String[] args ) {

    }
}
