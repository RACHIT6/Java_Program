package com.Code_Chef;

import java.sql.SQLOutput;
import java.util.Scanner;

public class code1 {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T--> 0) {
            int H = sc.nextInt();
            int X = sc.nextInt();
            int Y1 = sc.nextInt();
            int Y2 = sc.nextInt();
            int K = sc.nextInt();

            int GH = (int) Math.ceil (H/X);
            int LS;
            if (Y1*K > H) {
                LS = (int) Math.ceil ((double)H/Y1);
            }
            else {
                LS = (int) Math.ceil ((double)H/(Y1*K)) + (int) Math.ceil ((double)(H-(Y1*K))/Y2);
                System.out.println ((int) Math.ceil ((double)H/Y1));
            }

            System.out.println (GH < LS ? GH : LS);
        }
    }
}
