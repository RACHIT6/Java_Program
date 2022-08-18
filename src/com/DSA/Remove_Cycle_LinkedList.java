package com.DSA;

public class Remove_Cycle_LinkedList {
    public static void removeCycle (linkedList node){
        linkedList slow = node;
        linkedList fast = node;

        while ( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if ( slow == fast ){
                System.out.println ("Cycle Removed");
                fast.next = null;
                return;
            }
        }

        System.out.println ("Cycle not found");
    }

    public static void main(String[] args) {
        linkedList head = new linkedList(3);
        linkedList n2 = new linkedList(21);
        linkedList n3 = new linkedList(45);
        linkedList n4 = new linkedList(56);

//        Connections
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n4;

        removeCycle (head);
        head.Print ();
    }
}
