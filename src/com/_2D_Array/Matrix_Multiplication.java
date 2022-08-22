package com._2D_Array;

import java.util.Arrays;

public class Matrix_Multiplication {
    public static int [][] matMul (int [][] matrix1, int [][] matrix2){
        int [][] res = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                res[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    res[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int [][] arr1 = {
                {3, 4, 2},
        };

        int [][] arr2 = {
                {13, 9, 7, 15},
                {8, 7, 4, 6},
                {6, 4, 0, 3},
        };

        System.out.println (Arrays.deepToString (matMul (arr1, arr2)));
    }
}
