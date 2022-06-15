package com.company;

class Animal{
    public int a;
    public int b;

    Animal(){
        a = b = 0;
        System.out.println("I am a Base class constructor");
    }

    Animal(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("I am derived class parametrized constructor");
//        System.out.println(a +" "+ b);
    }
}

class Dog extends Animal{
    int z;
    Dog(){
        z = 0;
        System.out.println("I am a derived class constructor");
    }

    Dog(int x){
        super(x, x);
        z = x;
        System.out.println("I am a derived class parametrized constructor");
    }
}

class Code24 {
    public static void main(String[] args) {
        Dog obj = new Dog(2);

    }
}