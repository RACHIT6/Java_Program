package com.Arrays_Question;

/*Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.*/

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Relative_Sort {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap();
        for(int i = 0; i<arr1.length; i++){
            if(map.containsKey(arr1[i])){
                map.replace(arr1[i], map.get(arr1[i]),map.get(arr1[i])+1);
            }
            else{
                map.put(arr1[i], 1);
            }
        }

        int[] arr = new int [arr1.length];
        int ind = 0;
        for(int i = 0; i<arr2.length; i++){

            for(int j = 0; j<map.get(arr2[i]);j++){
                arr[ind] = arr2[i];
                ind++;
            }
            map.remove(arr2[i]);
        }

        for(int i: map.keySet()){

            for(int j = 0; j<map.get(i);j++){
                arr[ind] = i;
                ind++;
            }

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {2 , 3 , 1 , 3 , 2 , 4 , 6 , 7 , 9 , 2 , 19};
        int[] arr2 = {2 , 1 , 4 , 3 , 9 , 6};

        System.out.println (Arrays.toString (relativeSortArray (arr1, arr2)));
    }
}
