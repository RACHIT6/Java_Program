package com.Linked_List;

public class Remove_nth_from_end {
    public static int size (ListNode node){
        int count = 0;
        while (node != null){
            node = node.next;
            count++;
        }

        return count;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (size (head) == n)
            return head.next;
        int i = 0;
        ListNode temp = head;
        ListNode nextNode = temp.next;
        while ( i < size (head) - n - 1 ){
            temp = temp.next;
            nextNode = nextNode.next;
            i++;
        }

        temp.next = nextNode.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode (2);
        ListNode n2 = new ListNode (1);
        ListNode n3 = new ListNode (5);
        ListNode n4 = new ListNode (4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        ListNode.print (head);
        System.out.println ();
        head = removeNthFromEnd (head, 3);
        ListNode.print (head);
    }
}
