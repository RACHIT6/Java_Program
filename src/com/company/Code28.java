package com.company;

interface Pencil{
    void Sharp();
    void Erase();
}

class Apsara implements Pencil{
    public void Sharp(){
        System.out.println("Sharp the pencil");
    }

    public void DisplayLength(){

    }

    public void Erase(){
        System.out.println("Erasing the text");
    }
}

public class Code28 {
    public static void main(String[] args) {

    }
}
