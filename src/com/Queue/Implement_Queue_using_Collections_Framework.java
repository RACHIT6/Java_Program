package com.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Implement_Queue_using_Collections_Framework {
    public static void main ( String[] args ) {
        Queue<Integer> q = new ArrayDeque<> ();
        q.offer (23); /*push in queue*/
        q.poll (); /*pop from queue*/
        q.peek (); /*return thr first element*/
    }
}
