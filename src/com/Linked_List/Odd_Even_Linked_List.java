package com.Linked_List;

import java.util.HashMap;

public class Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();

        ListNode temp = head;
        int i = 1;
        while (temp != null) {
            map.put(i, temp.val);
            temp = temp.next;
        }

        ListNode newHead = null;
        ListNode temp1 = null;
        ListNode temp2 = null;

        for (Integer n : map.keySet ()) {
            if ( newHead == null && n % 2 != 0 ) {
                newHead = new ListNode (map.get (n));
            }

            else {
                temp1 = newHead;
                temp1.next = new ListNode (n);
                temp1 = temp1.next;
            }
        }

        for (Integer n : map.keySet ()) {
            if ( newHead == null && n % 2 != 0 ) {
                newHead = new ListNode (map.get (n));
            }

            else {
                temp1 = newHead;
                temp1.next = new ListNode (n);
                temp1 = temp1.next;
            }
        }

        return newHead;
    }
}
