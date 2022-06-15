package com.company;

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        length = 4;
        breadth = 5;
    }

    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    public void GetData(){
        System.out.printf("The length and breadth of rectangle is %d and %d", length, breadth);
    }
}

public class Code23 {
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(2,4);
        obj.GetData();
    }
}
