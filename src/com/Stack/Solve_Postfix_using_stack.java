package com.Stack;
import com.Stack.Infix_To_Postfix.*;
import java.util.Stack;

public class Solve_Postfix_using_stack {
    public static int evaluate (int a, int b, char c){
        if ( c == '+')
            return a + b;
        if ( c == '*' )
            return a * b;
        if ( c == '/' || c == '\\')
            return a/b;

        return a - b;
    }

    public static int Solve (String str) {
        Stack<Integer> s = new Stack<> ();

        int i = 0;
        while ( i < str.length () ){
            if ( Infix_To_Postfix.isOperator (str.charAt (i)) ){
                int b = s.pop ();
                int a = s.pop ();

                s.push (evaluate (a, b, str.charAt (i)));
            }

            else {
                s.push (Integer.valueOf (String.valueOf (str.charAt (i))));
            }

            i++;
        }

        return s.peek ();
    }

    public static void main ( String[] args ) {
        int res = Solve (Infix_To_Postfix.conversion ("((2+7)*3-2)/5"));
        System.out.println (res);
    }
}
