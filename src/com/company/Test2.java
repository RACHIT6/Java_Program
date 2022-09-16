package com.company;

class Test1 {
    int x = 10;
    static int y = 20;

    public void m1 (){
        System.out.println (x);
        System.out.println (y);
    }

    public static void m2 (){
        System.out.println (new Test1 ().x);
        System.out.println (y);
    }
}

public class Test2 {
    int z = 30;

    public void m3 (){
        System.out.println (new Test1 ().x);
        System.out.println (Test1.y);
        System.out.println (this.z);
    }

    public static void main (String[] args) {
        Test1 obj1 = new Test1 ();
        Test2 obj2 = new Test2 ();
        obj1.m1 ();
        Test1.m2 ();
        obj2.m3 ();
    }
}