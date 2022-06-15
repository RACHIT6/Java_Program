package com.company;
import java.util.Scanner;

public class Code35 {

    public static int divide(int a, int b){
         return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the value of a and b: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(divide(a, b));
        }

        catch (ArithmeticException e){
            System.out.println("HeHe");
        }

        catch (IllegalArgumentException e){
            System.out.println("haha");
        }

        catch (Exception e){
            System.out.println("Some Exception occurred");
        }
    }
}
