package com.company;

abstract class Shape{
    abstract double GetArea();
    abstract int GetVolume();
}

class Circle2 extends Shape{
    private int radius;

    public Circle2(){};

    public Circle2(int r){
        radius = r;
    }

    public double GetArea(){
        return Math.PI*radius*radius;
    }

    public int GetVolume(){
        return 0;
    }
}

public class Code27 {
    public static void main(String[] args) {
        Circle2 obj = new Circle2(5);
        System.out.println(obj.GetArea());
        System.out.println(obj.GetVolume());
    }
}
