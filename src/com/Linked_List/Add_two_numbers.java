package com.Linked_List;

public class Add_two_numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return l1;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode (9);
        ListNode n2 = new ListNode (9);
        ListNode n3 = new ListNode (9);

        ListNode head2 = new ListNode (9);
        head1.next = n2;
        n2.next = n3;

        ListNode.print (addTwoNumbers (head1, head2));
    }
}
