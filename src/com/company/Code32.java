package com.company;

class Thread1 extends Thread{

    @Override
    public void run(){
        while (true){
            System.out.println("The name is rachit");
        }
    }
}

class Thread2 extends Thread{

    @Override
    public void run(){
        while (true){
            System.out.println("My name is vishal");
        }
    }
}

public class Code32 {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();

        obj1.start();
        obj2.start();
    }
}
