package com.company;

class CellPhone{
    public void printRinging(){
        System.out.println("ringing...");
    }

    public void printVibrate(){
        System.out.println("vibrate...");
    }
}

public class Code17 {
    public static void main(String[] args) {
        CellPhone obj = new CellPhone();

        obj.printRinging();
        obj.printVibrate();
    }
}
