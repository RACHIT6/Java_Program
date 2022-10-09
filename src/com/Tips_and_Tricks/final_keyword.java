package com.Tips_and_Tricks;

class Outer {

    // Class 2
    // Simple nested inner class
    class Inner {

        // show() method of inner class
        public void show()
        {

            // Print statement
            System.out.println("In a nested class method");
        }
    }
}

public class final_keyword {
    public static void print (){
        final int n = 43;
        System.out.println (n);
    }

    public static void main (String[] args) {
        Outer.Inner obj = new Outer().new Inner ();
    }
}

