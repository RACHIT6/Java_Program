package com.Tips_and_Tricks;

public class Program_to_find_typeof_variable {
    public static void main(String[] args) {
        int x = 0;
        String s = "101";
        int [] arr = new int[0];
        int y = s.charAt (0) + 3; // add or subtract ascii value of character.

        System.out.println (y);
//        Have to initialise to check the type.
        System.out.println (((Object) x).getClass ().getSimpleName ());
        System.out.println (((Object) s).getClass ().getSimpleName ());
        System.out.println (arr.getClass ().getSimpleName ()); // No need of (Object) abbreviation in array
    }
}
