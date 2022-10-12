package com.Stack;

import java.util.Stack;

public class Previous_Greater_element {
    public static void main (String[] args) {
        int [] arr = {4 ,10, 5, 8, 20, 15, 3, 12};

        Stack<Integer> s = new Stack<> ();

        int i = 0;
        while ( i < arr.length ){
            if ( !s.isEmpty () ){
                if ( s.peek () < arr[i] ){
                    s.pop ();
                }

                else {
                    System.out.print (s.peek () + " ");
                    s.add (arr[i]);
                    i++;
                }
            }

            else {
                System.out.print (-1 + " ");
                s.add (arr[i]);
                i++;
            }
        }
    }
}
