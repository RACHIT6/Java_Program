package com.Stack;

import java.util.Stack;

public class Infix_To_Postfix {
    /*Function to specify operator*/
    public static boolean isOperator (char c){
        return c == '+' || c == '-' || c == '/' || c == '*' || c == '\\';
    }

    /*Function to specify operator precedence*/
    public static boolean compare (char a  /*str.chatAt (i) value*/, char b  /*s.peek() value*/) {
        if ( a == '*' && b == '+' )
            return true;
        if ( a == '/' && b == '+' )
            return true;
        if ( isOperator (a) && b == '('){
            return true;
        }
        if ( a == '*' && b == '-' ) {
            return true;
        }

        return a == '/' && b == '-';
    }

    public static String conversion (String str){
        Stack<Character> s = new Stack<> ();
        StringBuilder res = new StringBuilder ();

        int i = 0;
        while ( i < str.length () ) {
            if ( isOperator (str.charAt (i)) ){
                if ( s.isEmpty () ){
                    s.push (str.charAt (i));
                }

                else {
                    if ( compare (str.charAt (i), s.peek ()) ){
                        s.push (str.charAt (i));
                    }

                    else {
                        while ( !s.isEmpty () && !compare (str.charAt (i), s.peek () )){
//                            System.out.print (s.pop ());
                            res.append (s.pop ());
                        }
                        s.push (str.charAt (i));
                    }
                }
            }

            else if (str.charAt (i) == '('){
                s.push (str.charAt (i));
            }

            else if ( str.charAt (i) == ')' ) {
                while ( s.peek () != '(' ){
                    char temp = s.pop ();
                    if ( isOperator (temp) ){
                        res.append (temp);
//                        System.out.print (temp);
                    }
                }
                s.pop ();
            }

            else {
                res.append (str.charAt (i));
//                System.out.print (str.charAt (i));
            }
            i++;
        }

        while (!s.isEmpty ()){
            res.append (s.pop ());
//            System.out.print (s.pop ());
        }

        return res.toString ();
    }

    public static void main ( String[] args ) {
        String s = "a+b*c-d";
        System.out.println (conversion (s));
    }
}
