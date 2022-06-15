package com.company;

public class Code9 {
    public static void main(String[] args) {
        int [] arr;
        arr = new int[]{12,2,4,23,2,32,10};
        int min = arr[0];

        for (int element: arr){
            if (element < min){
                min = element;
            }
        }

        System.out.println("The minimum number in array is "+ min);
    }
}
