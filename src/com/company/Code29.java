package com.company;

abstract class Pen{
    abstract void write(String text);
    abstract void refill();
}

class FountainPen extends Pen{
    public void write(String text){
        System.out.println("Writing...");
        System.out.println(text);
    }

    public void refill(){
        System.out.println("Refilling...");
    }

    public void ChangeNib(){
        System.out.println("Changing the nib of pen...");
    }
}

public class Code29 {
    public static void main(String[] args) {
        FountainPen obj = new FountainPen();

        obj.write("I will be a good man");
        obj.refill();
    }
}
