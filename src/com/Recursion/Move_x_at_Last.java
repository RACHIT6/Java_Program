package com.Recursion;

public class Move_x_at_Last {
    public static String moveToLast (String s, char target){
        if ( s.length () == 0 ){
            return "";
        }

        char ch = s.charAt (0);
        String ans = moveToLast (s.substring (1), target);
        if ( ch == target ){
            return ans + ch;
        }

        return ch + ans;
    }

    public static void main(String[] args) {
        System.out.println (moveToLast ("xxabsx", 'x'));
    }
}
