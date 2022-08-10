package com.DSA;

class stack{
    int size;
    int top = -1;
    int [] arr;

    stack (int size){
        this.size = size;
        this.arr = new int[this.size];
    }
    public Boolean isEmpty (){
        return this.top == -1;
    }

    public Boolean isFull (){
        return this.size - 1 == this.top;
    }

    public void push (int val){
        if (this.isFull()){
            System.out.println("stack is Full");
            return;
        }

        this.top++;
        this.arr[this.top] = val;
    }

    public int pop (){
        if (this.isEmpty()){
            System.out.println("stack is Empty");
            return -1;
        }

        int PopValue = this.arr[this.top];
        this.top--;
        return PopValue;
    }

    public int peek (){
        return this.arr[this.top];
    }

    public void Print (){
        for (int i = 0; i <= this.top; i++) {
            System.out.print(this.arr[i] +" ");
        }
    }
}

public class Stack_Array {
    public static void main(String[] args) {
        stack obj = new stack(5);
        obj.push(12);
        obj.push(12);
        obj.push(12);
        obj.push(12);
        obj.push(12);
        obj.pop();
        obj.Print();
    }
}
