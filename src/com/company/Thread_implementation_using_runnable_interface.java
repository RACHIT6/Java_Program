package com.company;

class myThread2 implements Runnable {
    int n;
    myThread2 (int n){
        this.n = n;
    }

    @Override
    public void run () {
        while ( true ){
            System.out.println (this.n);
        }
    }
}

public class Thread_implementation_using_runnable_interface {
    public static void main (String[] args) {
        myThread2 bullet = new myThread2 (2);
        Thread gun = new Thread (bullet);

        myThread2 bullet2 = new myThread2 (101);
        Thread gun2 = new Thread (bullet2);

        gun.start ();
        gun2.start ();
    }
}
