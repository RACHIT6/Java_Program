package com.Linked_List;
/*
    Input: head = [1,2,3,4,5], k = 2
    Output: [4,5,1,2,3]

    Input: head = [0,1,2], k = 4
    Output: [2,0,1]
*/

public class Right_rotate_LinkedList {
    public ListNode rotateRight(ListNode head, int k) {


        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode (1);
        ListNode n2 = new ListNode (2);
        ListNode n3 = new ListNode (3);
        ListNode n4 = new ListNode (4);
        ListNode n5 = new ListNode (5);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
    }
}
