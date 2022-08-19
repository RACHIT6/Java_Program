package com.Recursion;

public class Remove_duplicate {
    public static boolean[] map = new boolean[26]; /*keep the record of character occurred or now*/
    public static String removeDuplicate (String s, int ind, String newString){
        if ( ind == s.length () ){
            return newString;
        }

        char currChar = s.charAt (ind);
        if ( !map[currChar - 'a'] ) {
            newString += currChar;
            map[currChar - 'a'] = true;
        }
        return removeDuplicate (s, ind + 1, newString);
    }

    public static void main(String[] args) {
        System.out.println (removeDuplicate ("aaaaabbabsgssss", 1, ""));
    }
}
