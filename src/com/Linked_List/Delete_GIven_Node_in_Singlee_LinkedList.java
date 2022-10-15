package com.Linked_List;

public class Delete_GIven_Node_in_Singlee_LinkedList {
    public static void deleteNode (ListNode node){
        if ( node == null || node.next == null)
            return;

        node.val = node.next.val;
        node.next = node.next.next;
    }


    public static void main ( String[] args ) {
        ListNode head = new ListNode (1);
        ListNode n2 = new ListNode (2);
        ListNode n3 = new ListNode (3);
        ListNode n4 = new ListNode (4);

        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        deleteNode (n4);
        ListNode.print (head);
    }
}
