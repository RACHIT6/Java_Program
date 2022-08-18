package com.Arrays_Question;

public class Record_breaking_Day {
    /* Condition for a record-breaking day :-
    * 1. Greater than previous all days
    * 2. Greater than next day
    *  */

    public static int maxRecordBreakingDay (int [] arr){
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if ( arr[i] > max && arr[i] > arr[i + 1]){
                count++;
            }

            if ( max < arr[i] ){
                max = arr[i];
            }
        }

        if ( arr[arr.length - 1] > max){
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println (maxRecordBreakingDay (new int[] {1, 2, 0, 7, 2, 0, 2, 2}));
    }
}
