package com.Queue;

public class MListNode {
    int val;
    MListNode next;
    MListNode down;
    MListNode () {}
    MListNode ( int val) {
        this.val = val;
    }

    MListNode ( int val, MListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void print ( MListNode head){
        while ( head != null ){
            System.out.print (head.val+ " ");
            head = head.next;
        }

        System.out.println ();
    }
}
