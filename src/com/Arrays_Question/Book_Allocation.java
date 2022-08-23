package com.Arrays_Question;

public class Book_Allocation {
    public static int max (int [] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr){
            max = Math.max (max, j);
        }

        return max;
    }

    public static int sum (int [] arr){
        int sum = 0;
        for (int j : arr){
            sum += j;
        }

        return sum;
    }

    public static boolean isFeasible (int [] arr, int k , int mid){
        int sum = 0, student = 1;

        for (int j : arr){
            if ( j + sum > mid){
                student++;
                sum = j;
            }

            else
                sum += j;
        }

        return student <= k;
    }

    public static int maxBook (int [] arr, int k){
        int low = max(arr), high = sum(arr);
        int res = 0;

        while ( low <= high ){
            int mid = (low + high)/2;
            int sum  = 0;
            if (isFeasible (arr, k, mid)){
                res = mid;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int [] arr = {10 ,10, 20 ,30};
        System.out.println (maxBook (arr, 2));
    }
}
