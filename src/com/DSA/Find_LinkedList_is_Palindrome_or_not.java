package com.DSA;
//    Write a program to find Linked list is palindrome or not.
public class Find_LinkedList_is_Palindrome_or_not {

//    Using String concatination
    public static Boolean isPalindrome (linkedList head){
        String test = "";

        while (head != null){
            test += String.valueOf(head.data);
            head = head.next;
        }

        int stringSize = test.length();
        for (int i = 0; i < stringSize/2; i++) {
            if (test.charAt(i) != test.charAt(stringSize - i - 1)) {
                return false;
            }
        }

        return true;
    }

//    Using rabbit and hare approach.
    public static Boolean isPalindromeModifies (linkedList head){
        linkedList FirstHalf = head;
        linkedList SecondHalfReverse = head.Mid().next.Reverse();

        while (SecondHalfReverse != null){
            if (FirstHalf.data != SecondHalfReverse.data){
                return false;
            }

            FirstHalf = FirstHalf.next;
            SecondHalfReverse = SecondHalfReverse.next;
        }

        return true;
    }

    public static void main(String[] args) {
        linkedList Head = new linkedList(1);
        linkedList n2 = new linkedList(2);
        linkedList n3 = new linkedList(56);
        linkedList n4 = new linkedList(2);
        linkedList n5 = new linkedList(1);

        Head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;


        System.out.println(Head.isPalindrome());
    }
}
