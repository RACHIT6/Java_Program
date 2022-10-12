package com.Stack;

import java.util.Stack;

public class Previous_smallest_element {
    public static void main (String[] args) {
        int [] arr = {4 ,10, 5, 8, 20, 15, 3, 12};

        Stack<Integer> s = new Stack<> ();
        s.push (arr[0]);
        int i = 0;
        while ( i < arr.length ){
            if ( !s.isEmpty () ) {
                if ( s.peek () >= arr[i] ){
                    s.pop ();
                }

                else {
                    System.out.print (s.peek () + " ");
                    s.push (arr[i]);
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
