package com.DSA;
    // Program to find nth term form last and delete it.
public class Find_nth_element_from_last_LinkedList {
    public static int sizeLinkedList (LinkedList head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }

        return count;
    }

    public static LinkedList nthLast (LinkedList head, int index){
        int size = sizeLinkedList(head);
        LinkedList prevNode = head;
        LinkedList nextNode = prevNode.next;
        int count = 0;

        if (index >= size - 1){
            System.out.println(head.data);
            head = head.next;
            return head;
        }

        while (nextNode != null && (size - index - 2) > count++){
            prevNode = prevNode.next;
            nextNode = nextNode.next;
        }

        prevNode.next = nextNode.next;
        System.out.println(nextNode.data);
        return head;
    }

    public static void main(String[] args) {
        LinkedList Head = new LinkedList(1);
        LinkedList n2 = new LinkedList(2);
        LinkedList n3 = new LinkedList(3);
        LinkedList n4 = new LinkedList(4);
        LinkedList n5 = new LinkedList(5);

        Head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

//        Head.Print();
//        Head = nthLast(Head, 2);
//        Head = nthLast(Head, 2);
//        Head = nthLast(Head, 2);
//        Head.Print();
    }
}
