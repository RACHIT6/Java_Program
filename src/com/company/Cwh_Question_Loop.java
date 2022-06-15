package com.company;
import java.util.*;

public class Cwh_Question_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Question-1
//        int row = sc.nextInt();
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < row - i; j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }

//        Question-2
//        System.out.print("Enter the nth term: ");
//        int nth = sc.nextInt();
//        int i = 1, sum = 0;
//        while(i <= nth){
//            if (i % 2 == 0){
//                sum += i;
//            }
//            i++;
//        }
//
//        System.out.println("The sum of First nth even number is "+ sum);

//        Question-3
//        System.out.print("Enter the number: ");
//        int n = sc.nextInt();
//
//        System.out.println("Table given below: ");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n +" x "+ i+ " = "+ n*i);
//        }

//        Question-4
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.printf("The factorial of %d is %d", n, fact);
    }
}
