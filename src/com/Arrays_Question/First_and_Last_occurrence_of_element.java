package com.Arrays_Question;

import java.util.ArrayList;

public class First_and_Last_occurrence_of_element {
    ArrayList<Long> find( long arr[], int n, int x)
    {
        ArrayList <Long> list = new ArrayList <> ();

        for (long i = 0; i < n; i++) {
            if (arr[(int)i] == x) {
                list.add (i);
                break;
            }
        }

        if (list.isEmpty ()) {
            return new ArrayList<> () {{
                add ((long) -1);
                add ((long) -1);
            }} ;
        }

        return list;
    }

    public static void main ( String[] args ) {

    }
}
