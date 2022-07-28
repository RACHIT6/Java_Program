package com.DSA;

class DoubleLinkedList{
    int data;
    DoubleLinkedList next;
    DoubleLinkedList prev;

    DoubleLinkedList (int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public void Print (){
        DoubleLinkedList head = this;
        System.out.print(head.prev);
        while (head != null) {
            if (head.prev == null){
                System.out.print(" <-- "+ head.data +" <--> ");
            }

            else if (head.next == null){{
                System.out.print(head.data+ " --> ");
            }

            }
            else {
                System.out.print(head.data+ " <--> ");
            }
            head = head.next;
        }

        System.out.println("null");
    }

//    Else Function are same as Single LinkedList.
}

public class Doublee_Linked_List {
    public static void main(String[] args) {
        DoubleLinkedList Head = new DoubleLinkedList(1);
        DoubleLinkedList n2 = new DoubleLinkedList(2);
        DoubleLinkedList n3 = new DoubleLinkedList(3);
        DoubleLinkedList n4 = new DoubleLinkedList(4);
        DoubleLinkedList n5 = new DoubleLinkedList(5);

        Head.prev = null;
        Head.next = n2;

        n2.prev = Head;
        n2.next = n3;

        n3.prev = n2;
        n3.next = n4;

        n4.prev = n3;
        n4.next = n5;

        n5.prev = n4;
        n5.next = null;

        Head.Print();
    }
}
