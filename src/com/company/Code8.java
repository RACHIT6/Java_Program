package com.company;

public class Code8 {
    public static void main(String[] args) {
        int [] arr;
        arr = new int[]{12,543,32,32,1};
        int max = 0;
        for (int element: arr){
            if (element > max){
                max = element;
            }
        }

        System.out.println("The maximum number in array is "+ max);
    }
}
