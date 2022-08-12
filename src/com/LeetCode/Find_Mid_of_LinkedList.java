package com.LeetCode;

public class Find_Mid_of_LinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode (1);
        ListNode n2 = new ListNode (0);
        ListNode n3 = new ListNode (1);

        head.next = n2;
        n2.next = n3;
        n3.next = null;

        System.out.println (middleNode (head).val);
    }
}
