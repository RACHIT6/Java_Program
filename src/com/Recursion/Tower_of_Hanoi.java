package com.Recursion;

public class Tower_of_Hanoi {
    public static void towerOfHanoi (int NoDisc, String src, String helper, String dest){
        if (NoDisc == 0){
            return;
        }

        towerOfHanoi (NoDisc - 1, src, dest, helper);
        System.out.println (src +" --> "+ dest);
        towerOfHanoi (NoDisc - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        towerOfHanoi (3, "S", "H", "D");
    }
}
