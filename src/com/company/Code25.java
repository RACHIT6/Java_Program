package com.company;
import java.lang.Math;

class Circle1{
    private int r;

    public void SetR(int r){
        this.r = r;
    }

    public int GetR(){
        return r;
    }

    public double getArea(){
        return Math.PI*r*r;
    }
}

class Cylinder1 extends Circle1{
    private double h;

    public void SetH(int h){
        this.h = h;
    }

    public int GetH(){
        return (int)h;
    }

    public double GetArea(int r){
        return (2*Math.PI*GetR()*h + 2*Math.PI*r*r);
    }
    public double GetVolume(){
        return (Math.PI*GetR()*GetR()*h);
    }
}

public class Code25 {
    public static void main(String[] args) {
        Circle1 obj = new Cylinder1();
        Cylinder1 obj1 = new Cylinder1();
        obj.SetR(5);
        obj1.SetH(6);

        System.out.println("Volume of Cycle: "+ obj1.GetArea(obj.GetR()));
    }
}
