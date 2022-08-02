package com.DSA;

class linkedList{
    int data;
    linkedList next;

    public linkedList(int data){
        this.data = data;
        this.next = null;
    }

    public void Print(){
        linkedList node = this;
        while (node != null){
            System.out.print(node.data +" --> ");
            node = node.next;
        }

        System.out.println("null");
    }

    public linkedList Insert(int index, int value){
//        Condition for first index
        if (index == 0){
            linkedList NewHead = new linkedList(value);
            NewHead.next = this;
            return NewHead;
        }

        else{
            int i = 0;
            linkedList head = this;
            linkedList node = new linkedList(value);

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

    public linkedList Insert (int value){
        linkedList head = this;
        linkedList node = new linkedList(value);

        while (head.next != null){
            head = head.next;
        }

        head.next = node;
        node.next = null;

        return this;
    }

    public linkedList DeleteNode (int index){
//        for first index.
        if (index == 0){
            linkedList NewHead = this;
            return NewHead.next;
        }

//        for rest index
        else {
            int i = 0;
            linkedList prevNode = this;
            linkedList nextNode = prevNode.next;

            while (i++ < index - 1 && nextNode.next != null){
                prevNode = prevNode.next;
                nextNode = nextNode.next;
            }

            prevNode.next = nextNode.next;
            return this;
        }
    }

    public linkedList pop (){
        linkedList prevNode = this;
        linkedList nextNode = prevNode.next;

        while (nextNode.next != null){
            prevNode = prevNode.next;
            nextNode = nextNode.next;
        }

        prevNode.next = null;
        return this;
    }

    public linkedList Reverse (){
        if (this == null || this.next == null){
            return this;
        }

        linkedList prev = this;
        linkedList current = this.next;
        while (current != null){
            linkedList next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }

        this.next = null;
        return prev;
    }

    public int Size (){
        linkedList head = this;
        int count = 0;
        while (head != null){
            head = head.next;
            count++;
        }

        return count;
    }

//    Turtle Hair Approach to find Middle element of linkedList
    public linkedList Mid (){
        linkedList slowNode = this;
        linkedList fastNode = this;

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

        linkedList FirstHalfStart = this;
        linkedList SecondHalfStart = this.Mid().next.Reverse();

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
        linkedList head = new linkedList(3);
        linkedList n2 = new linkedList(21);
        linkedList n3 = new linkedList(45);
        linkedList n4 = new linkedList(56);

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
