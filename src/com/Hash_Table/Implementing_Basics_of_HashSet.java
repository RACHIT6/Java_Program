package com.Hash_Table;

import java.util.HashSet;
import java.util.Iterator;

public class Implementing_Basics_of_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<> ();

        set.add (1);
        set.add (2);
        set.add (3);

        set.remove (3);
        System.out.println (set);
        Iterator<Integer> it = set.iterator ();
        while ( it.hasNext () ){
            System.out.println (it.next ());
        }
    }
}
