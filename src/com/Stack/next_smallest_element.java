package com.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class next_smallest_element {
    public static void main ( String[] args ) {
        int [] arr = {4 ,10, 5, 8, 20, 15, 3, 12};

        ArrayList<Integer> list = new ArrayList<> ();
        Stack<Integer> s = new Stack<> ();
        int i = arr.length - 1;
        s.push (arr[i]);
        while (i >= 0) {
            if ( !s.isEmpty () ){
                if ( arr[i] <= s.peek () ){
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
