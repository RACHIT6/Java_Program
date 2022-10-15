package com.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Next_Greater_element {
    public static void main ( String[] args ) {
        int [] arr = {4 ,10, 5, 8, 20, 15, 3, 12};
        Stack<Integer> s = new Stack<> ();
        ArrayList<Integer> list = new ArrayList<> ();

        int i = arr.length - 1;
        while ( i >= 0 ){
            if ( !s.isEmpty () ){
                if ( s.peek () <= arr[i] ){
                    s.pop ();
                }

                else {
                    list.add (s.peek ());
                    s.push (arr[i]);
                    i--;
                }
            }

            else {
                list.add (-1);
                s.push (arr[i]);
                i--;
            }
        }

        Collections.reverse (list);
        System.out.println (list);
    }
}
