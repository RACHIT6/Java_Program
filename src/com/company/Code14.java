package com.company;

public class Code14 {
    public static int func(int ...args){
        int sum = 0;
        for(int element: args){
            sum += element;
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = func(2,3,3,2);
        System.out.println(n);
    }
}
