package com.company;

import java.util.Scanner;

class Circle{
    private int radius;
    private int perimeter;
    private int area;
    private final Scanner sc = new Scanner(System.in);

    public void SetRadius(){
        System.out.print("Enter the radius: ");
        radius = sc.nextInt();
    }

    public int GetRadius(){
        return radius;
    }

    public void SetPerimeter(){
//        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter: ");
        perimeter = sc.nextInt();
    }

    public void SetArea(){
//        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the area: ");
        area = sc.nextInt();
    }

    public void CheckValid(){
        if(area == radius*radius && perimeter == 4*radius){
            System.out.println("Area and Perimeter are valid");
        }

        else if(area == radius*radius && perimeter != 4*radius){
            System.out.println("Area is valid but perimeter is not valid");
        }

        else if(area != radius*radius && perimeter == 4*radius){
            System.out.println("Area is not valid but perimeter is valid");
        }

        else{
            System.out.println("Area and Perimeter both are not valid");
        }
    }
}

public class Code19 {
    public static void main(String[] args) {
        Circle obj = new Circle();

        obj.SetRadius();
        obj.SetPerimeter();
        obj.SetArea();

        obj.CheckValid();
    }
}
