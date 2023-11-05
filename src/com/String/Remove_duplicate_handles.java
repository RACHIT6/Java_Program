package com.String;

import java.util.HashMap;

public class Remove_duplicate_handles {
    public static String removeDuplicateLetters(String s) {
//        String ans = "";
        HashMap<Character, Integer> map = new HashMap<> ();


        for (char c : s.toCharArray ()) {
            map.put (c, map.getOrDefault (c, 0) + 1);
        }

        String ans = "";
        for (char c : s.toCharArray ()) {
            map.put (c, map.getOrDefault (c, 0) - 1);
            if ( map.get (c) != 0 ) continue;
        }

        System.out.println (map);
        return "";
    }

    public static void main ( String[] args ) {
        removeDuplicateLetters ("ababc");
    }
}
