package com.Linked_List;

public class Reverse_LinkedList {
    public static ListNode reverseIter (ListNode head){
        if ( head == null || head.next == null )
            return head;

        ListNode prevNode = head;
        ListNode currNode = head.next;

        while ( currNode != null ){
            ListNode nextNode = currNode.next;

            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        return prevNode;
    }

    public static ListNode reverseRec (ListNode head){
        if ( head == null || head.next == null ){
            return head;
        }

        ListNode newHead = reverseRec (head.next);
        ListNode nextNode = head.next;
        nextNode.next = head;
        head.next = null;

        return newHead;
    }

    public static void main (String[] args) {
        ListNode head = new ListNode (3);
        ListNode n2 = new ListNode (2);
        ListNode n3 = new ListNode (0);
        ListNode n4 = new ListNode (-4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode.print (head);
        head = reverseRec (head);
        ListNode.print (head);
    }
}
