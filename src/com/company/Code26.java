package com.company;
import java.util.Scanner;

class Rectangle1{
    private int l;
    private int b;

    public Rectangle1(){};

    public Rectangle1(int length, int breadth){
        l = length;
        b = breadth;
    }

    public int GetArea(){
        return l*b;
    }
}

class Cuboid extends Rectangle1{
    private int l;
    private int b;
    private int h;
    public final Scanner sc = new Scanner(System.in);

    public Cuboid(){};

    public Cuboid(int len, int breadth, int height){
        super(len, breadth);
        l = len;
        b = breadth;
        h = height;
    }

    void SetLBH(){
        System.out.println("Enter length, breadth and height of cuboid: ");
        l = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
    }

    public int getArea(){
        return l*b*h;
    }
}

public class Code26 {
    public static void main(String[] args) {
        Cuboid obj = new Cuboid(5, 4, 5);
//        obj.SetLBH();
        System.out.println("Area of Rectangle is "+ obj.GetArea());
        System.out.println("Area of Cuboid is "+ obj.getArea());
    }
}
