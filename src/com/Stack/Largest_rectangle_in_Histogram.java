package com.Stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Largest_rectangle_in_Histogram {
    public static List<Integer> previousSmaller (int [] arr){
        List<Integer> list = new ArrayList<> (arr.length);
        Stack<Integer> s = new Stack<> ();

        int i = 0;
        while (i < arr.length) {
            if ( !s.isEmpty () ){
                if ( arr[s.peek ()] >= arr[i] ){
                    s.pop ();
                }

                else {
                    list.add (s.peek ());
                    s.push (i);
                    i++;
                }
            }

            else {
                list.add (-1);
                s.push (i);
                i++;
            }
        }

        return list;
    }

    public static List<Integer> nextSmaller (int [] arr){
        List<Integer> list = new ArrayList<> (arr.length);
        Stack<Integer> s = new Stack<> ();

        int i = arr.length - 1;
        while (i >= 0) {
            if ( !s.isEmpty () ){
                if ( arr[s.peek ()] >= arr[i] ){
                    s.pop ();
                }

                else {
                    list.add (s.peek ());
                    s.push (i);
                    i--;
                }
            }

            else {
                list.add (arr.length);
                s.push (i);
                i--;
            }
        }

        Collections.reverse (list);
        return list;
    }

    public static void main ( String[] args ) {
        int [] arr = {4, 2, 1, 5, 6, 3, 2, 4, 2};
        System.out.println (previousSmaller (arr));
        System.out.println (nextSmaller (arr));

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max (max, ((nextSmaller (arr).get (i) - previousSmaller (arr).get (i) - 1) * arr[i]));
        }

        System.out.println (max);
    }
}
