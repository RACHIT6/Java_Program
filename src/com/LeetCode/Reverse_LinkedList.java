package com.LeetCode;

public class Reverse_LinkedList {
    public static ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }

        if (head.next == null){
            return head;
        }

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
}
