package com.Heap_Data_Structure;

public class Insertion_and_deletion_in_Max_heap {
    public static int insert(int[] arr , int n , int target){
        arr[n] = target;
        n++;
        int i = n;
        while ( i > 1 ){
            if ( arr[i/2 - 1] < arr[i - 1] ){
                int temp = arr[i/2 - 1];
                arr[i/2 - 1] = arr[i - 1];
                arr[i - 1] = temp;

                i = i/2;
            }

            else {
                return n;
            }
        }

        return n;
    }

    public static int delete (int [] arr, int n){
        arr[0] = arr[n - 1];
        n--;
        int i = 1;
        while (i < n){
            int left = 2*i - 1;
            int right = 2*i;

            int index = arr[left] > arr[right] ? left : right;
            if ( arr[index] > arr[i - 1]){
                int temp = arr[index];
                arr[index] = arr[i - 1];
                arr[i - 1] = temp;
            }
            i = index;
        }

        return n;
    }

    public static void print (int [] arr, int n){
        System.out.print ("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print (arr[i] +", ");
        }
        System.out.println ("]");
    }

    public static void main(String[] args) {
        int [] arr = new int[10];
        arr[0] = 10;
        arr[1] = 7;
        arr[2] = 8;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        int n = 6;
        print (arr, n);
        n = insert (arr, n, 90);
        n = insert (arr, n, 9);
        print (arr, n);
    }
}
