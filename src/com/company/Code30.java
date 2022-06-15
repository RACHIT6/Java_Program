package com.company;

interface BasicAnimal{
    default void eat(){
        System.out.println("Sleeping");
    }

    default void sleep(){
        System.out.println("Sleeping");
    }
}

class Monkey{
    public void jump(){
        System.out.println("Jumping...");
    }

    public void bite(){
        System.out.println("Biting...");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void think(){
        System.out.println("Think like human");
    }

    @Override
    public void eat(){
        System.out.println("Human is eating");
    }

    @Override
    public void bite(){
        System.out.println("Only kids of human bites");
    }
}

public class Code30 {
    public static void main(String[] args) {
        Monkey obj = new Human();

//        obj.eat(); --> This is not allowed as reference is of class Monkey and can only use method of Monkey class (POLYMORPHISM)
        obj.bite();
    }
}
