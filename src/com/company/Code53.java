package com.company;

public class Code53 {
//    ITERATIVE APPROACH
    public static LinkedList RevIterativeSingle_LinkedList(LinkedList Head){
        if (Head == null || Head.next == null){
            return Head;
        }

        LinkedList prev = Head;
        LinkedList current = Head.next;

        while (current != null){
            LinkedList next = current.next; // Everytime current node.next will be next node
            current.next = prev; // Linking current node to previous node(broke the connection of current and next node)

//            UPDATES
            prev = current;
            current = next;
        }

        Head.next = null;
        return prev;
    }
    public static void main(String[] args) {
        LinkedList head = new LinkedList(3);
        LinkedList node1 = new LinkedList(2);
        LinkedList node2 = new LinkedList(6);
        LinkedList node3 = new LinkedList(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        System.out.print("Original Linked list: ");
        head.Transversal();

        System.out.print("Reversed Linked list: ");
        head = RevIterativeSingle_LinkedList(head);
        head.Transversal();
    }
}
