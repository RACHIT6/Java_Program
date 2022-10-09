package com.Tips_and_Tricks;

public class String_Concepts {
    public static void main (String[] args) {
        String s1 = "r";
        String s2 = "r";

        /*String pool works as if you initialise the string like above-mentioned then they share same reference and { == } operator check for reference */

        String s3 = new String ("r");
        String s4 = new String ("r");

        System.out.println (s1 == s2); /* true because it checks the reference in string pool, it is created in stack and shared same reference */

        System.out.println (s2 == s3); /* both are false because object are different, one is created in stack and one is created in heap */
        System.out.println (s4 == s3); /* both are false because object are different, both are created in heap */
    }
}
