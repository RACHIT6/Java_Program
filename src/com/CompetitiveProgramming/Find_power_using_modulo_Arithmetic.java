package com.CompetitiveProgramming;

public class Find_power_using_modulo_Arithmetic {
    static int FastPower(int num, int power){
        int res = 1;

        while (power != 0){
            if ((power & 1) != 0){
                res *= num;
            }

            num *= num;
            power /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(FastPower(3, 3));
    }
}
