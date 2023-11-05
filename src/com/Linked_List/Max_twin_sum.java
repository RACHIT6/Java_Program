package com.Linked_List;

import java.util.HashMap;

public class Max_twin_sum {
    public int size (ListNode head) {
        int size = 0;

        while (head != null) {
            head = head.next;
            size++;
        }

        return size;
    }

    public int pairSum(ListNode head) {
        if (head == null) {
            return 0;
        }

        HashMap <Integer, Integer> map = new HashMap<> ();
        int n = size (head);
        int count = 0;

        while (head != null) {
            map.put (count++, head.val);
            head = head.next;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n/2; i++) {
            max = (int)Math.max (max, (map.get(i) + map.get (n - i - 1)));
            System.out.println (max);
        }

        return max;
    }

    public static void main ( String[] args ) {

    }
}
