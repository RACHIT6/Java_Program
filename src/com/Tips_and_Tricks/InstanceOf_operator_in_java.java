package com.Tips_and_Tricks;

interface Test {

}

class Animal {

}

class Dog extends Animal implements Test {

}
public class InstanceOf_operator_in_java {
    public static void main (String[] args) {
        String s = new String ("3");
        InstanceOf_operator_in_java obj = new InstanceOf_operator_in_java ();
        System.out.println (s instanceof String);
        System.out.println (obj instanceof InstanceOf_operator_in_java);

        /* In case of Inheritance */
        Dog obj1 = new Dog ();
        /*In case of class Inheritance*/
        System.out.println (obj1 instanceof Animal);
        System.out.println (obj1 instanceof Dog);
        /*In case of Interface Implementation*/
        System.out.println (obj1 instanceof Test);
    }
}
