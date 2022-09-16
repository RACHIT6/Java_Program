package com.Linked_List;

public class Palindrome_LinkedList {
    public static ListNode mid (ListNode head){
        ListNode slow = head, fast = head;

        while ( fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode reverse (ListNode head){
        ListNode prevNode = null, currNode = head;

        while ( currNode != null ){
            ListNode nextNode = currNode.next;

            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        return prevNode;
    }

    public static Boolean check (ListNode head){
        ListNode headFront = head;
        ListNode revHeadRear = reverse (mid (head));

        while ( revHeadRear != null ){
            if ( revHeadRear.val != headFront.val ){
                return false;
            }

            revHeadRear = revHeadRear.next;
            headFront = headFront.next;
        }

        return true;
    }

    public static void main (String[] args) {
        ListNode head = new ListNode (3);
        ListNode n2 = new ListNode (6);
        ListNode n3 = new ListNode (0);
        ListNode n4 = new ListNode (2);
        ListNode n5 = new ListNode (3);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println (check (head));
    }
}
