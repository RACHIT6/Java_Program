package com.Recursion;

public class Move_all_x_to_end {
    public static void moveCharacter (String s, char target){
        if ( s.length () <= 1 ){
            return;
        }

        if ( s.charAt (0) == target){
            moveCharacter (s.substring (1), target);
        } else {
            System.out.print (s.charAt (0));
            moveCharacter (s.substring (1), target);
        }
    }

    public static void main(String[] args) {
        moveCharacter ("axxxxxxdbx", 'x');
    }
}
