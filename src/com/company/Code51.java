package com.company;

@FunctionalInterface
interface Calculator{
    int add(int a, int b);
}

public class Code51 {
    public static void main(String[] args) {
        Calculator res = (a, b)->{
            return a + b;
        };

        System.out.println(res.add(34, 56));
    }
}
