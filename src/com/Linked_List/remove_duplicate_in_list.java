package com.Linked_List;

import java.util.HashSet;
import java.util.List;

public class remove_duplicate_in_list {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> set = new HashSet<> ();
        ListNode currNode = new ListNode (head.val);
        ListNode nextNode = head;

        while ( nextNode != null ) {
            if ( !set.contains (nextNode.val) ){
                currNode.next = new ListNode (nextNode.val);
            }

            set.add (nextNode.val);
            System.out.println (set);
            nextNode = nextNode.next;
        }

        return currNode;
    }

    public static void main ( String[] args ) {

    }
}
