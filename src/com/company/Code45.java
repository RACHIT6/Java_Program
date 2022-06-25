package com.company;

public class Code45 {

    public static Boolean Linear_Search(int [] arr, int target, int limit){
        for (int i = 0; i < limit; i++) {
            if (arr[i] == target){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,21,1,2,1,1};
        int index = 0;

        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!Linear_Search(res, arr[i], i)) {
                res[index] = arr[i];
                index++;
            }
        }

        for (int element: res){
            if (element != 0){
                System.out.print(element+ " ");
            }
        }

    }
}
