package com.Arrays_Question;

public class Finding_majority_element_using_Moores_voting_Algorithm {
    public static int Majority_Index(int[] arr){
        int MajIndex = 0;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[MajIndex] == arr[i]) {
                count++;
            }

            else {
                count--;
            }

            if (count == 0) {
                MajIndex = i;
                count = 1;
            }
        }

        return MajIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 5};
        int count = 0;
        int index = Majority_Index(arr);
        for (int j : arr) {
            if (arr[index] == j) {
                count++;
            }
        }

        if (count > arr.length/2){
            System.out.println("Majority element: "+ arr[index]);
        }

        else {
            System.out.println("No Majority Element");
        }
    }
}
