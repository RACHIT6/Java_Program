package com.DSA;

//    Program to check a loop in linkedList
public class Check_loop_in_LinkedList {
    public static Boolean CheckLoop (linkedList head){
        linkedList slow = head;
        linkedList fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        linkedList Head = new linkedList(1);
        linkedList n2 = new linkedList(2);
        linkedList n3 = new linkedList(56);
        linkedList n4 = new linkedList(2);
        linkedList n5 = new linkedList(1);

        Head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println(CheckLoop(Head));
    }
}
