package com.DSA;

class circularQueue{
    int size;
    int r;
    int f;
    int [] arr;

    circularQueue (int size){
        this.r = this.f = 0;
        this.size = size + 1;
        this.arr = new int[this.size];
    }

    public Boolean isEmpty (){
        return this.f == this.r;
    }

    public Boolean isFull (){
        return (this.f + 1)%(this.size) == this.r;
    }

    public void enQueue (int val){
        if (this.isFull()){
            System.out.println("Queue Overflow");
        }

        else {
            this.arr[this.f] = val;
            this.f = (this.f + 1)%this.size;
        }
    }

    public int deQueue (){
        int item = -1;
        if (isEmpty()){
            System.out.println("Queue Underflow");
        }

        else {
            this.r = (this.r + 1) % this.size;
            item = this.arr[this.r];
        }
        return item;
    }
}

public class Circular_Queue {
    public static void main(String[] args) {
        circularQueue obj = new circularQueue(4);

        obj.enQueue(1);
        obj.enQueue(1);
        obj.enQueue(1);
        obj.enQueue(1);

        obj.deQueue ();
        obj.deQueue ();
        obj.deQueue ();
        obj.deQueue ();
    }
}
