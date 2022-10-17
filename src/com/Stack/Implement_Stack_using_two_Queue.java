package com.Stack;

import java.util.ArrayDeque;
import java.util.Queue;

class CStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int capacity = 13;

    public CStack (){
        q1 = new ArrayDeque<> ();
        q2 = new ArrayDeque<> ();

        if ( q2.size () > 10 ){
            this.capacity += 13/2;
        }
    }

    public CStack (int capacity){
        q1 = new ArrayDeque<> ();
        q2 = new ArrayDeque<> ();
        this.capacity = capacity;
    }

    public void push (int n){
        if ( q2.size () >= this.capacity ){
            System.out.println ("Stack is Full");
        }

        else {
            if ( !q2.isEmpty () ){
                q1.offer (n);

                while ( !q2.isEmpty () ){
                    q1.offer (q2.poll ());
                }

                while ( !q1.isEmpty () ){
                    q2.offer (q1.poll ());
                }
            }

            else {
                q2.offer (n);
            }
        }
    }

    public int pop (){
        if ( q2.isEmpty () )
            return -1;

        return q2.poll ();
    }

    public int size (){
        return q2.size ();
    }
}

public class Implement_Stack_using_two_Queue {
    public static void main ( String[] args ) {
        CStack s = new CStack ();

        s.push (1);
        s.push (2);
        s.push (3);

        System.out.println (s.pop ());
        System.out.println (s.pop ());
        System.out.println (s.pop ());
    }
}
