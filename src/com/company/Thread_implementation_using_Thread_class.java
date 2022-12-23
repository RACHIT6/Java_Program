package com.company;


class myThread1 extends Thread {
    public int n;

    myThread1 (int n){
        this.n = n;
    }

    @Override
    public void run () {
        while ( true ){
            System.out.println (this.n);
        }
    }
}

public class Thread_implementation_using_Thread_class {
    public static void main (String[] args) {
        myThread1 obj1 = new myThread1 (1);
        myThread1 obj2 = new myThread1 (99);
        myThread1 obj3 = new myThread1 (200);

        obj1.start ();
        obj2.start ();
        obj3.start ();
    }
}
