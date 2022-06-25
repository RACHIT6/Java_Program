package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Code46 {
    public static List<List<Integer>> unique(int [] arr, int target){
        List<List<Integer>> my_List = new ArrayList<List<Integer>>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length ;j++){
                for(int k = j; k< arr.length;k++){
                    if ( i != j && j != k && i != k && (arr[i] + arr[j] + arr[k] == target)){
                        List<Integer> inner_List = new ArrayList<Integer>(3);
                        inner_List.add(arr[i]);
                        inner_List.add(arr[j]);
                        inner_List.add(arr[k]);
                        my_List.add(inner_List);
                    }
                }
            }
        }
        return my_List;
    }

    public static ArrayList<Integer> unique2(int [] arr, int target){
//        List<List<Integer>> my_List = new ArrayList<List<Integer>>();
        ArrayList<Integer> my_List = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length ;j++){
                for(int k = j; k< arr.length;k++){
                    if ( i != j && j != k && i != k && (arr[i] + arr[j] + arr[k] == target)){
                        ArrayList<Integer> inner_List = new ArrayList<Integer>(3);
                        my_List.add(arr[i]);
                        my_List.add(arr[j]);
                        my_List.add(arr[k]);

                        return my_List;
//                        my_List.add(inner_List);
                    }
                }
            }
        }

        return new ArrayList<>();
    }

    public static void main(String[] args) {
//        Find all the unique triplets such that sum of all the three elements equal to a specified number
        int[] arr = {1, -2, 0, 5, -1, -4};

        System.out.println(unique(arr, 2));
        System.out.println(unique2(arr, 2));
    }
}
