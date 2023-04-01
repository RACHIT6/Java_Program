package com.DSA;

class queue{
    int size;
    int r;
    int f;
    int [] arr;

    queue (int size){
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

    public void enqueue (int val){
        if (isFull()){
            System.out.println("queue Overflow");
        }

        else {
            this.f++;
            this.arr[this.f] = val;
        }
    }

    public int dequeue (){
        int item = -1;
        if (isEmpty()){
            System.out.println("queue Underflow");
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
        queue obj = new queue(3);
        obj.enqueue (3);
    }
}
