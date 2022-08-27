package com.Tips_and_Tricks;

import java.util.Arrays;
import java.util.Collections;

public class Program_to_sort_array_in_descending_order {
    public static void main(String[] args) {
        Integer [] arr = {1,32,12,123,5};
        Arrays.sort (arr, Collections.reverseOrder ());
        System.out.println (Arrays.toString (arr));
    }
}
