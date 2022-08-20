package com.Arrays_Question;

public class Finding_Max_sum_of_array_using_Kandanes_Algorithm {
    public static int max_sum(int[] arr){
        int currentSum = arr[0];
        int maxSum = arr[0];

        for(int element: arr){
            currentSum = Math.max(element, currentSum + element);

            if (currentSum > maxSum){
                maxSum = currentSum;
            }

            else if (currentSum < 0){
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, -1, -10};

        System.out.println("Maximum sum: "+ max_sum(arr));
    }
}
