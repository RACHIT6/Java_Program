package com.LeetCode;

public class Check_LinkedList_is_Palindrome_or_not {
    public static ListNode Mid (ListNode node){
        ListNode slow = node;
        ListNode fast = node.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.next;
    }

    public static ListNode reverse (ListNode node){
        if (node == null){
            return null;
        }

        ListNode prev = node;
        ListNode curr = node.next;

        while (curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nextNode;
        }

        node.next = null;
        return prev;
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode FirstHalf = head;
        ListNode SecondHalf = Mid(head);
        SecondHalf = reverse(SecondHalf);

        while (SecondHalf != null){
            if (FirstHalf.val != SecondHalf.val){
                return false;
            }

            FirstHalf = FirstHalf.next;
            SecondHalf = SecondHalf.next;
        }

        return true;
    }
}
