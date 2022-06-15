package com.company;

// Creating multithreading using Runnable interface
class thread1 implements Runnable{
    @Override
    public void run() {
        while(true){
            System.out.println("Name");
        }
    }
}

class thread2 implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("Section");
        }
    }
}
public class Code33 {
    public static void main(String[] args) {
        thread1 obj1 = new thread1();
        Thread gun1 = new Thread(obj1);

        thread2 obj2 = new thread2();
        Thread gun2 = new Thread(obj2);

        gun1.start();
        gun2.start();
    }
}
