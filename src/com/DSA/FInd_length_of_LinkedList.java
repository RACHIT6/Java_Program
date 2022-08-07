package com.DSA;

public class FInd_length_of_LinkedList {
    public static int length (linkedList node){
        if (node == null){
            return 0;
        }

        return length(node.next) + 1;
    }

    public static void main(String[] args) {
        linkedList head = new linkedList(3);
        linkedList n2 = new linkedList(21);
        linkedList n3 = new linkedList(45);
        linkedList n4 = new linkedList(56);

//        Connections
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        System.out.println(length(head));
    }
}
