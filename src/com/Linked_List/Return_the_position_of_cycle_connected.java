package com.Linked_List;
/*
    Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

    Input: head = [3,2,0,-4], pos = 1
    Output: tail connects to node index 1
*/

import java.util.HashSet;

public class Return_the_position_of_cycle_connected {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode slow2 = head;
                while (slow2 != slow) {
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode (3);
        ListNode n2 = new ListNode (2);
        ListNode n3 = new ListNode (0);
        ListNode n4 = new ListNode (-4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        System.out.println (detectCycle (head).val);
    }
}
