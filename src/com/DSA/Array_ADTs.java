package com.DSA;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class ArrayADT{
    int size;
    int used_size = 0;
    int [] arr;
    Scanner sc = new Scanner(System.in);

    ArrayADT(int total_size) {
        this.size = total_size;
        this.arr = new int[size];
    }

    public void setArray () {
        System.out.print("Enter the number of element you want to input: ");
        int n = sc.nextInt();

        System.out.println("Enter element of array: ");
        for (int i = 0; i < n; i++) {
            this.arr[this.used_size++] = sc.nextInt();
        }
    }

    public void showArray () {
        System.out.print("Array: ");
        for (int i = 0; i < this.used_size; i++) {
            System.out.print(this.arr[i]+ " ");
        }

        System.out.println();
    }

    public void Insertion (int gIndex, int gVal) {
        if (gIndex > this.used_size + 1){
            System.out.println("Can't Insert previous indexes not used i.e array filled up to "+ this.used_size);
        }

        else {
            for (int i = this.used_size; i >= gIndex; i--) {
                this.arr[i + 1] = this.arr[i];
            }

            this.arr[gIndex] = gVal;
            this.used_size++;
        }
    }

    public void Insertion (int gVal) {
        this.arr[this.used_size] = gVal;
        this.used_size++;
    }

    public void Delete (int gIndex){
        for (int i = gIndex; i < this.used_size; i++) {
            this.arr[i] = this.arr[i + 1];
        }

        this.used_size--;
    }

    public int Search (int sVal){
        int high = this.size - 1;
        int low = 0;

        while (low <= high){
            int mid = (high + low)/2;

            if (this.arr[mid] == sVal){
                return mid;
            }

            else if (this.arr[mid] > sVal){
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return -1;
    }
}

public class Array_ADTs {
    public static void main(String[] args) {
        ArrayADT obj = new ArrayADT(5);

        obj.Insertion(456);
        obj.Insertion(34);
        obj.Insertion(768);
        obj.Insertion(0, 100);

        Arrays.sort(obj.arr);
//        obj.Delete(0);
        obj.showArray();
        System.out.println(obj.Search(100));
    }
}