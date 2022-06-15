package com.company;
class con extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning...");
        }
    }
}

class wel extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            }

            catch (Exception e){
                System.out.println(e);
            }

            System.out.println("Welcome");;
        }
    }
}

public class Code34 {
    public static void main(String[] args) {
        con obj1 = new con();
        wel obj2 = new wel();

        obj1.start();
        obj2.start();
    }
}
