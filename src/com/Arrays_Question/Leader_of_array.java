package com.Arrays_Question;

import java.util.ArrayList;
import java.util.Collections;

public class Leader_of_array {
    static ArrayList<Integer> leaders( int arr[], int n){
        ArrayList<Integer> list = new ArrayList<> ();
        int greater = arr[ arr.length - 1];
        list.add (greater);

        for (int i = arr.length - 2; i >= 0; i--) {
            if ( arr[i] > greater ) {
                greater = arr[i];
                list.add (greater);
            }
        }

        Collections.reverse (list);
        return list;
    }

    public static void main ( String[] args ) {

    }
}
