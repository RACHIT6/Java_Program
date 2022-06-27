package com.CompetitiveProgramming;

public class FInd_no_of_ways_in_mxn_matrix {
    static int ways(int row, int column){
        if (row == 1 || column == 1){
            return 1;
        }

        return ways(row - 1, column) + ways(row, column - 1);
    }

    public static void main(String[] args) {
        System.out.println(ways(1, 11));
    }
}
