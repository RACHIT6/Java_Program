package com.Recursion;

public class Print_the_sub_sequence_of_string {
    static void Sub_Seq(String s, int i, String current){
        if (i == s.length()){
            System.out.println(current);
            return;
        }

        Sub_Seq(s, i + 1, current + s.charAt(i));
        Sub_Seq(s, i + 1, current);
    }

    public static void main(String[] args) {
//        Sub_Seq("abc", 0, "");
        Sub_Seq("abc", 0, "");
    }
}
