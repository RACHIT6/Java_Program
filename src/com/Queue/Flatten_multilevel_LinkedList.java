package com.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Flatten_multilevel_LinkedList {
    public static void flatten (MListNode node){
        Queue<MListNode> q = new ArrayDeque<> ();
        q.offer (node);
        while ( !q.isEmpty () ){
            MListNode temp = q.poll ();
            while ( temp != null ){
                if ( temp.down != null )
                    q.offer (temp.down);

                System.out.print (temp.val+ " ");
                temp = temp.next;
            }
        }
    }

    public static void main ( String[] args ) {
        MListNode n1 = new MListNode (1);
        MListNode n2 = new MListNode (2);
        MListNode n3 = new MListNode (3);
        MListNode n4 = new MListNode (4);
        MListNode n5 = new MListNode (5);
        MListNode n6 = new MListNode (6);
        MListNode n7 = new MListNode (7);
        MListNode n8 = new MListNode (8);
        MListNode n9 = new MListNode (9);
        MListNode n10 = new MListNode (10);
        MListNode n11 = new MListNode (11);
        MListNode n12 = new MListNode (12);
        MListNode n13 = new MListNode (13);
        MListNode n14 = new MListNode (14);
        MListNode n15 = new MListNode (15);
        MListNode n16 = new MListNode (16);
        MListNode n17 = new MListNode (17);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n1.down = n6;
        n6.next = n7;
        n7.next = n8;
        n7.down = n11;
        n8.down = n12;
        n12.down = n15;
        n9.down = n13;
        n13.down = n16;
        n16.next = n17;
        n13.next = n14;
        n9.next = n10;
        n4.down = n9;

        flatten (n1);
    }
}
