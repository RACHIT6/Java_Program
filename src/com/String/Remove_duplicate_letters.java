package com.String;

import java.util.Arrays;
import java.util.Stack;

public class Remove_duplicate_letters {
    public static String removeDuplicateLetters(String s) {
        Stack<Character> st = new Stack<> ();
        int [] count = new int[26];

        for (char c : s.toCharArray ()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length ();) {
            if (!st.isEmpty () && st.peek () > s.charAt (i) ) {
                if ( count[st.peek () - 'a'] > 1) {
                    count[st.peek () - 'a']--;
                    st.pop ();
                }

                else {
                    i++;
                }
            }

            else {
                st.push (s.charAt (i));
                i++;
            }

        }

        System.out.println (Arrays.toString (count));
        String ans = "";
        for (char n :
                st) {
            ans += n;
        }

        return ans;
    }

    public static void main ( String[] args ) {
        System.out.println (removeDuplicateLetters ("cbacdcbc"));
    }
}
