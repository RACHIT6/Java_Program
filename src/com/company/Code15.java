package com.company;
import java.util.Scanner;

class Employee{
    int id;
    String name;
    float salary;

    public void SetData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the id: ");
        id = sc.nextInt();
        System.out.print("Enter the salary: ");
        salary = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter your name: ");
        name = sc.nextLine();
    }

    public void GetData(){
        System.out.println("The id of "+ name+ " is "+ id+ " and salary is "+ salary);
    }
}

public class Code15 {
    public static void main(String[] args) {
        Employee obj = new Employee();
//        Way to make object attributes without using of method
//        obj.name = "Rachit";
//        obj.id = 1223;
//        obj.salary = 234.32f;
//        System.out.printf("The Id of %s is %d and the salary is %.2f", obj.name, obj.id, obj.salary);

//        Way to make object attributes using of method
        obj.SetData();
        obj.GetData();
    }
}
