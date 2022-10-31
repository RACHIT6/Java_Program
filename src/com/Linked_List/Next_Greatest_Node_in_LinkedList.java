package com.Linked_List;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greatest_Node_in_LinkedList {
    public static ListNode reverse (ListNode head) {
        ListNode prevNode = head;
        ListNode currNode = head.next;

        while (currNode != null){
            ListNode nextNode = currNode.next;

            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        return prevNode;
    }

    public static int size (ListNode head) {
        int count = 0;
        while (head != null){
            head = head.next;
            count++;
        }

        return count;
    }

    public static int[] nextLargerNodes(ListNode head) {
        Stack<Integer> s = new Stack<> ();
        head = reverse (head);
        int n = size (head);
        int [] arr = new int[n];

        int i = 0;
        while ( head != null ){
            if ( !s.isEmpty () ){
                if ( s.peek () <= head.val ){
                    s.pop ();
                }

                else {
                    arr[n - i - 1] = s.peek ();
                    s.push (head.val);
                    head = head.next;
                    i++;
                }
            }

            else {
                s.push (head.val);
                arr[n - i - 1] = 0;
                head = head.next;
                i++;
            }
        }

        return arr;
    }

    public static void main ( String[] args ) {
        ListNode head = new ListNode (2);
        ListNode n2 = new ListNode (1);
        ListNode n3 = new ListNode (5);

        head.next = n2;
        n2.next = n3;
        ListNode.print (head);

//        System.out.println (Arrays.toString (nextLargerNodes (head)));
    }
}
