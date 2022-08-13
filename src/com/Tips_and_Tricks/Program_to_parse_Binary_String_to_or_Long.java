package com.Tips_and_Tricks;

public class Program_to_parse_Binary_String_to_or_Long {
    public static int parseInt (String in){
        return Integer.parseInt (in, 2);
    }

    public static Long parseLong (String in){
        return Long.parseLong (in, 2);
    }

    public static void main(String[] args) {
        System.out.println (parseInt ("101"));
        System.out.println (parseLong ("101"));
    }
}
