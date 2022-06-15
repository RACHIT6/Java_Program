package com.company;

public class Code5 {
    public static void main(String[] args) {
        float [] arr = new float[5];
        arr = new float[]{1f, 2f, 3f, 4f, 5f};
        float sum = 0;

        for(float element: arr){
            sum += element;
        }

        System.out.println("The sum of arr is "+ sum);
    }
}
