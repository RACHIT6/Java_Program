package com.DSA;

class Queue{
    int size;
    int r;
    int f;
    int [] arr;

    Queue (int size){
        this.size = size;
        this.r = this.f = -1;
        this.arr = new int[this.size];
    }

    public Boolean isEmpty (){
        return this.r == this.f;
    }

    public Boolean isFull (){
        return this.f >= this.size - 1;
    }

    public void enQueue (int val){
        if (isFull()){
            System.out.println("Queue Overflow");
        }

        else {
            this.f++;
            this.arr[this.f] = val;
        }
    }

    public int deQueue (){
        int item = -1;
        if (isEmpty()){
            System.out.println("Queue Underflow");
        }

        else {
            this.r++;
            item = this.arr[this.r];
        }
        return item;
    }
}

public class Single_Ended_Queue {
    public static void main(String[] args) {
        Queue obj = new Queue(3);

    }
}
