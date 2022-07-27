package com.DSA;

//    Program to check a loop in LinkedList
public class Check_loop_in_LinkedList {
    public static Boolean CheckLoop (LinkedList head){
        LinkedList slow = head;
        LinkedList fast = head;

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
        LinkedList Head = new LinkedList(1);
        LinkedList n2 = new LinkedList(2);
        LinkedList n3 = new LinkedList(56);
        LinkedList n4 = new LinkedList(2);
        LinkedList n5 = new LinkedList(1);

        Head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        System.out.println(CheckLoop(Head));
    }
}
