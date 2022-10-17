package com.Queue;

import java.util.Stack;

class CQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    int capacity = 13;

    public CQueue () {
        s1 = new Stack<> ();
        s2 = new Stack<> ();
    }

    public CQueue (int capacity){
        s1 = new Stack<> ();
        s2 = new Stack<> ();
        this.capacity = capacity;
    }

    public void push (int n){
        if ( s2.size () >= this.capacity){
            System.out.println ("Stack is Full");
        }

        else {
            if ( !s2.isEmpty () ){
                while ( !s2.isEmpty () ){
                    s1.push (s2.pop ());
                }

                s1.push (n);

                while ( !s1.isEmpty () ){
                    s2.push (s1.pop ());
                }
            }

            else {
                s2.push (n);
            }
        }
    }

    public int pop (){
        if ( s2.isEmpty () ){
            return -1;
        }
        return s2.pop ();
    }

    public int size (){
        return s2.size ();
    }
}

public class Implement_Queue_using_Two_Stack {
    public static void main ( String[] args ) {
        CQueue q = new CQueue ();
        q.push (1);
        q.push (2);
        q.push (3);
        q.push (3);
        q.push (3);
        q.push (3);
        q.push (3);
        q.push (3);
        q.push (3);
        q.push (3);
        System.out.println (q.size ());
    }
}
