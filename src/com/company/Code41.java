package com.company;

import java.util.Scanner;

public class Code41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "Hello World!";
        System.out.print("Enter the index of String: ");
        int index = sc.nextInt();

        System.out.println("The character in string at"+ index+ " is "+ st.charAt(index));
    }
}
