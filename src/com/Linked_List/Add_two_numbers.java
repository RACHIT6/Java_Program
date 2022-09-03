package com.Linked_List;

public class Add_two_numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode head = null, nextNode = null;

        while (l1 != null || l2 != null){
            if ( l1 != null ){
                sum += l1.val;
                l1 = l1.next;
            }

            if ( l2 != null ){
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode temp = new ListNode (sum % 10);
            sum = sum / 10;
            if ( head == null){
                nextNode = head = temp;
            }

            else {
                nextNode.next = temp;
                nextNode = nextNode.next;
            }

        }

        if ( sum > 0 ){
            nextNode.next = new ListNode (sum);
        }

        return head;
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
