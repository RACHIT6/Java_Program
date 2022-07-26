package com.DSA;

class LinkedList{
    int data;
    LinkedList next;

    public LinkedList(int data){
        this.data = data;
        this.next = null;
    }

    public void Print(){
        LinkedList node = this;
        while (node != null){
            System.out.print(node.data +" --> ");
            node = node.next;
        }

        System.out.println("null");
    }

    public LinkedList Insert(int index, int value){
//        Condition for first index
        if (index == 0){
            LinkedList NewHead = new LinkedList(value);
            NewHead.next = this;
            return NewHead;
        }

        else{
            int i = 0;
            LinkedList head = this;
            LinkedList node = new LinkedList(value);

            while (i++ < index - 1 && head.next != null){
                head = head.next;
            }

//            Condition if index not found and head.next reach up to last node.
            if (head.next == null){
                head.next = node;
                node.next = null;
            }

//            Condition if index found and head.next is some value.
            else {
                node.next = head.next;
                head.next = node;
            }
        }

        return this;
    }

    public LinkedList Insert (int value){
        LinkedList head = this;
        LinkedList node = new LinkedList(value);

        while (head.next != null){
            head = head.next;
        }

        head.next = node;
        node.next = null;

        return this;
    }

    public LinkedList DeleteNode (int index){
//        for first index.
        if (index == 0){
            LinkedList NewHead = this;
            return NewHead.next;
        }

//        for rest index
        else {
            int i = 0;
            LinkedList prevNode = this;
            LinkedList nextNode = prevNode.next;

            while (i++ < index - 1 && nextNode.next != null){
                prevNode = prevNode.next;
                nextNode = nextNode.next;
            }

            prevNode.next = nextNode.next;
            return this;
        }
    }

    public LinkedList pop (){
        LinkedList prevNode = this;
        LinkedList nextNode = prevNode.next;

        while (nextNode.next != null){
            prevNode = prevNode.next;
            nextNode = nextNode.next;
        }

        prevNode.next = null;
        return this;
    }

    public LinkedList Reverse (){
        if (this == null || this.next == null){
            return this;
        }

        LinkedList prev = this;
        LinkedList current = this.next;
        while (current != null){
            LinkedList next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }

        this.next = null;
        return prev;
    }

    public int Size (){
        LinkedList head = this;
        int count = 0;
        while (head != null){
            head = head.next;
            count++;
        }

        return count;
    }

//    Turtle Hair Approach to find Middle element of LinkedList
    public LinkedList Mid (){
        LinkedList slowNode = this;
        LinkedList fastNode = this;

        while (fastNode.next != null && fastNode.next.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        return slowNode;
    }

    public Boolean isPalindrome (){
        if (this.next == null || this == null){
            return true;
        }

        LinkedList FirstHalfStart = this;
        LinkedList SecondHalfStart = this.Mid().next.Reverse();

        while (SecondHalfStart != null){
            if (FirstHalfStart.data != SecondHalfStart.data){
                return false;
            }

            FirstHalfStart = FirstHalfStart.next;
            SecondHalfStart = SecondHalfStart.next;
        }

        return true;
    }
}

public class Singlee_Linked_List {
    public static void main(String[] args) {
        LinkedList head = new LinkedList(3);
        LinkedList n2 = new LinkedList(21);
        LinkedList n3 = new LinkedList(45);
        LinkedList n4 = new LinkedList(56);

//        Connections
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

//        head = head.Insert(90);
//        head = head.Insert(67);
//        head.print();
//        head = head.DeleteNode(4);
//        head.print();


        head.Print();
        System.out.println(head.Size());
//        head = head.pop();
//        head.Print();
    }
}
