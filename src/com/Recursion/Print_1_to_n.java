package com.Recursion;

public class Print_1_to_n {
    public static void printRange (int LRange, int URange){
        if ( LRange > URange ){
            return;
        } else {
            System.out.print (LRange+" ");
            printRange (LRange + 1, URange);
        }
    }

    public static void main(String[] args) {
        printRange (-5, 5);
    }
}
