package com.company;

class myThread extends Thread{
    myThread(String name){
        super(name);
    }

    public void run(){
        while (true){
            System.out.println(this.getName());
        }
    }
}

public class Thread_Priority {
    public static void main(String[] args) {
        myThread obj = new myThread("Rahul");
        myThread obj2 = new myThread("Rohan");
        obj.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj.start();
        obj2.start();
    }
}
