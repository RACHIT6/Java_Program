package com.company;
import java.util.Scanner;

class Complex{
    private int real;
    private int imaginary;
    private final Scanner sc = new Scanner(System.in);

    public Complex(){
        real = imaginary = 0;
    }

    void SetData(){
        System.out.println("Enter the Real and Imaginary value: ");
        real = sc.nextInt();
        imaginary = sc.nextInt();
    }

    void GetData(){
        System.out.println(real+ " + "+ imaginary+"i");
    }

    public void sum(Complex ...args){
        Complex obj = new Complex();
        for(Complex element: args){
            obj.real += element.real;
            obj.imaginary += element.imaginary;
        }

        obj.GetData();
    }
}

public class Code20 {
    public static void main(String[] args) {
        Complex obj1 = new Complex();
        Complex obj2 = new Complex();
        Complex obj3 = new Complex();

        obj1.SetData();
        obj2.SetData();
        obj3.SetData();

        obj1.GetData();
        obj2.GetData();
        obj3.GetData();

        obj1.sum(obj1, obj2, obj3);
    }
}
