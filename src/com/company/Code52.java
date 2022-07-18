package com.company;

class LinkedList{
    int data;
    LinkedList next;

    LinkedList(int data){
        this.data = data;
        this.next = null;
    }

    public void Transversal(){
        if (this == null){
            System.out.println("List is Empty");
            return;
        }

        LinkedList node = this;
        while (node != null){
            System.out.print(node.data+ " ");
            node = node.next;
        }

        System.out.println();
    }

//    INSERTIONS IN LINKED LIST
    public LinkedList InsertAtFirst(int value){
        LinkedList node = this;
        LinkedList NewHead = new LinkedList(value);
        NewHead.next = node;

        return NewHead;
    }

    public LinkedList InsertAtLast(int value){
        LinkedList node = this;
        LinkedList NewTail = new LinkedList(value);
        NewTail.next = null;

        while(node.next != null){
            node = node.next;
        }

        node.next = NewTail;

        return this;
    }

    public LinkedList InsertAtIndex(int value, int index){
        LinkedList node = this;
        LinkedList NewNode = new LinkedList(value);
        int i = 0;

        while (i++ != index - 1){
            node = node.next;
        }

        NewNode.next = node.next;
        node.next = NewNode;

        return this;
    }

//    DELETION IN LINKED LIST
    public LinkedList DeleteAtFirst () {
        LinkedList node = this;
        return node.next;
    }

    public LinkedList DeleteAtIndex (int index) {
        LinkedList prev = this;
        LinkedList next = prev.next;
        int i = 0;

        while (i++ != index - 1){
            prev = prev.next;
            next = next.next;
        }

        prev.next = next.next;
        return this;
    }

    public LinkedList DeleteAtLast () {
        LinkedList prev = this;
        LinkedList next = prev.next;

        while (next.next != null){
            prev = prev.next;
            next = next.next;
        }

        prev.next = null;
        return this;
    }

    public LinkedList MasterDelete (int index) {
        if (index == 0){
            LinkedList node = this;
            return node.next;
        }

        else {
            LinkedList prev = this;
            LinkedList next = prev.next;
            int i = 0;

            while (i++ != index - 1){
                prev = prev.next;
                next = next.next;
            }

            prev.next = next.next;
            return this;
        }
    }
}

public class Code52 {
    public static void main(String[] args) {
        LinkedList head = new LinkedList(3);
        LinkedList node1 = new LinkedList(2);
        LinkedList node2 = new LinkedList(6);
        LinkedList node3 = new LinkedList(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        head.Transversal();
        head = head.MasterDelete(0);
        head.Transversal();
    }

}
