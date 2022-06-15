package com.company;
import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "Index out of range";
    }
}

public class Code36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {11, 232, 13, 54, 56, 87};

        System.out.print("Enter the Index: ");
        int ind = sc.nextInt();
        if (ind > 5){
            try {
                throw new MyException();
            }

            catch (Exception e){
                System.out.println(e);
//                e.printStackTrace();
            }
        }

        else {
            System.out.println("The number at index "+ ind+ " is "+ arr[ind]);
        }
    }
}
