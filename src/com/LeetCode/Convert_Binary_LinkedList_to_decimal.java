package com.LeetCode;

public class Convert_Binary_LinkedList_to_decimal {
    public static int getDecimalValue(ListNode head) {
        String out = "";
        while (head != null){
            out += head.val;
            head = head.next;
        }

        return Integer.parseInt(out, 2);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode (1);
        ListNode n2 = new ListNode (0);
        ListNode n3 = new ListNode (1);

        head.next = n2;
        n2.next = n3;
        n3.next = null;

        System.out.println (getDecimalValue (head));
    }
}
