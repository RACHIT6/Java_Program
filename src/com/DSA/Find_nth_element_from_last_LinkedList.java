package com.DSA;
    // Program to find nth term form last and delete it.
public class Find_nth_element_from_last_LinkedList {
    public static int sizelinkedList (linkedList head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }

        return count;
    }

    public static linkedList nthLast (linkedList head, int index){
        int size = sizelinkedList(head);
        linkedList prevNode = head;
        linkedList nextNode = prevNode.next;
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
        linkedList Head = new linkedList(1);
        linkedList n2 = new linkedList(2);
        linkedList n3 = new linkedList(3);
        linkedList n4 = new linkedList(4);
        linkedList n5 = new linkedList(5);

        Head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        Head.Print();
        Head = nthLast(Head, 2);
//        Head = nthLast(Head, 2);
//        Head = nthLast(Head, 2);
        Head.Print();
    }
}
