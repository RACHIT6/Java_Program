package com.company;

class Employee1{
    String name;
    int salary = 50000;

    public int getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

public class Code16 {
    public static void main(String[] args) {
        Employee1 obj = new Employee1();

        obj.salary = 5023000;
        obj.setName("Rachit");
        System.out.println("The name is "+ obj.getName()+ " and the salary is "+ obj.getSalary());
    }
}
