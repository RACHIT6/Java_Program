package com.Tips_and_Tricks;

public class Var_Keyword {
    public static void main(String[] args) {
        var i = 2; // Define data type in runtime.
        var str = "Rachit";
        /*NOTE :- Can only be used in defining variable not arrays or others*/
        System.out.println (((Object) i).getClass ().getSimpleName ());
        System.out.println (((Object) str).getClass ().getSimpleName ());
    }
}
