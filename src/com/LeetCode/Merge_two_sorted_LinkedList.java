package com.LeetCode;

import java.util.LinkedList;

public class Merge_two_sorted_LinkedList {
    public static ListNode reverseList(ListNode head)
    {
        if (head.next == null)
            return head;

        ListNode rest = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return rest;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null){
            return null;
        }
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }

        list1 = reverseList(list1);
        list2 = reverseList(list2);
        ListNode head = null;
        ListNode temp;

        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                temp = list1.next;
                list1.next = head;
                head = list1;
                list1 = temp;
            }
            else {
                temp = list2.next;
                list2.next = head;
                head = list2;
                list2 = temp;
            }
        }

        while (list1 != null) {
            temp = list1.next;
            list1.next = head;
            head = list1;
            list1 = temp;
        }

        while (list2 != null) {
            temp = list2.next;
            list2.next = head;
            head = list2;
            list2 = temp;
        }

        ListNode h = head;
        while (h != null){
            System.out.println (h.val);
            h = h.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode (4);
        ListNode n2 = new ListNode (5);
        ListNode n3 = new ListNode (6);

        head1.next = n2;
        n2.next = n3;
        n3.next = null;

        ListNode head2 = new ListNode (1);
        ListNode n4 = new ListNode (2);
        ListNode n5 = new ListNode (3);

        head2.next = n4;
        n4.next = n5;
        n5.next = null;

        ListNode res = mergeTwoLists (head1, head2);
        while ( res != null ){
            System.out.print (res.val +" ");
            res = res.next;
        }
    }
}
