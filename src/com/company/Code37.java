package com.company;
import java.util.Scanner;

public class Code37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a > 9){
            try {
                throw new Exception("Noob");
            }

            catch (Exception error){
                System.out.println(error.getMessage());
            }
        }
    }
}
