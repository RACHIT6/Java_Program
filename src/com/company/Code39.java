package com.company;

import java.util.Scanner;

public class Code39 {
    public static void main(String[] args) {
        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        if (!(op.equals("+") || op.equals("-") || op.equals("*")  || op.equals("/"))) {
            try{
                throw new Exception("Invalid Input Exception");
            }

            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        else if(a > 100000  || b > 100000){
            try{
                throw new Exception("Max input exception");
            }

            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        else {
            try{
                if (op.equals("+")){
                    System.out.println(a + b);
                }

                else if(op.equals("-")){
                    System.out.println(a - b);
                }

                else if(op.equals("*")){
                    if (a >= 7000 || b >= 7000){
                        try {
                            throw new Exception("Max multiple reached exception");
                        }

                        catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }

                    else{
                        System.out.println(a * b);
                    }
                }

                else{
                    System.out.println(a/b);
                }
            }

            catch (ArithmeticException e){
                System.out.println("Can't divide by Zero");
            }
        }
    }
}
