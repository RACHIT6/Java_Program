package com.Heap_Data_Structure;

import java.util.Arrays;

public class Insertion_and_deletion_in_MIN_Heap {
    public static int insert(int [] arr, int n, int val){
        arr[n] = val;
        int i = ++n;

        while ( i > 1 ){
            if ( arr[i/2 - 1] > arr[i - 1] ){
                int temp = arr[i - 1];
                arr[i - 1] = arr[i/2 - 1];
                arr[i/2 - 1] = temp;

                System.out.println (i);
                i = i/2;
            }

            else {
                return n;
            }
        }
        return n;
    }

    /*
    *             4
    *       7             5
    *    9    8       10
    * */
    public static int delete (int [] arr, int n){
        n--;
        arr[0] = arr[n];
        int i = 1;

        while ( i < n ){
            int left = 2*i - 1;
            int right = 2*i;

            if ( left < n  && right < n){
                int index = arr[left] < arr[right] ? left : right;
                if ( arr[index] < arr[i - 1] ){
                    int temp = arr[index];
                    arr[index] = arr[i - 1];
                    arr[i - 1] = temp;
                }
                i = index;
            }

            else
                break;
        }

        return n;
    }

    public static void main(String[] args) {
        int [] arr = {3, 4, 5, 7, 8, 10, 6, 0};
        int n = arr.length - 1;

        n = insert (arr, n, 9);
        n = delete (arr, n);
        n = delete (arr, n);
        System.out.println (Arrays.toString (arr));
    }
}
