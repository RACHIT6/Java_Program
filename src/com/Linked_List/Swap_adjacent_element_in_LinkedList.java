package com.Linked_List;

public class Swap_adjacent_element_in_LinkedList {
    public static ListNode swapPairs(ListNode head) {
        if ( head.next == null ){
            return head;
        }

        ListNode node = head;
        ListNode tempNode = null;
        int i = 1;
        int temp = 0;

        while ( node != null ){
            if ( i % 2 == 0 ){
                tempNode.val = node.val;
                node.val = temp;
            }

            else {
                tempNode = node;
                temp = node.val;
            }
            node = node.next;
            i++;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode (1);
        ListNode n2 = new ListNode (2);
        ListNode n3 = new ListNode (3);
        ListNode n4 = new ListNode (4);
        ListNode n5 = new ListNode (5);
        ListNode n6 = new ListNode (6);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        swapPairs (head);
        ListNode.print (head);
    }
}
