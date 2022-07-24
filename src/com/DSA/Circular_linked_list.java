package com.DSA;

class CircularLinkedList {
    int data;
    CircularLinkedList next;

    CircularLinkedList (int data){
        this.data = data;
        this.next = null;
    }

    public void Print (){
        CircularLinkedList head = this;

        do {
            System.out.print(head.data + "-->");
            head = head.next;
        } while (head != this);

        System.out.println(this.data);
    }

    public CircularLinkedList Insert (int index, int value){
        CircularLinkedList head = this;
        CircularLinkedList NewNode = new CircularLinkedList(value);
        if (index == 0){
            do {
                head = head.next;
            } while (head.next != this);

            NewNode.next = head.next;
            head.next = NewNode;

            return NewNode;
        }

        else if (index == 1){
            NewNode.next = head.next;
            head.next = NewNode;

            return this;
        }

        else{
            int i = 0;

            do {
                head = head.next;
            } while (head.next != this && i++ < index - 2);

            NewNode.next = head.next;
            head.next = NewNode;

            return this;
        }
    }

    public CircularLinkedList Delete (int index){
        if (index == 0){
            CircularLinkedList prev = this;
            CircularLinkedList head = prev.next;

            do {
                prev = prev.next;
                head = head.next;
            } while (head != this);


            prev.next = head.next;
            return prev.next;
        }

        else{
            CircularLinkedList prev = this;
            CircularLinkedList next = prev.next;
            int i = 0;
            while (next.next != this && i++ < index - 1){
                prev = prev.next;
                next = next.next;
            }

            prev.next = next.next;
            return this;
        }
    }
}

public class Circular_linked_list {
    public static void main(String[] args) {
        CircularLinkedList head = new CircularLinkedList(3);
        CircularLinkedList n2 = new CircularLinkedList(21);
        CircularLinkedList n3 = new CircularLinkedList(45);
        CircularLinkedList n4 = new CircularLinkedList(56);

//        Connections
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = head;

        head.Print();
        head = head.Delete( 79);
        head.Print();
        head = head.Delete( 79);
        head.Print();
    }
}
