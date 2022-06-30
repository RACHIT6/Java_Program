package com.CompetitiveProgramming;

public class Find_max_profit_to_sell_stocks {
    public static int stock(int[] arr){
        int min = arr[0], maxProfit = 0;

        for (int element: arr) {
            min = Math.min(min, element);
            int profit = element - min;
            maxProfit = Math.max(profit, maxProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 8, 4};

        System.out.println("Max profit: "+ stock(arr));
    }
}
