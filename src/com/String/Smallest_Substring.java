package com.String;

public class Smallest_Substring {
    String longestCommonPrefix(String arr[], int n){
        String res = arr[0];

        for (int i = 1; i < n; i++) {
            int j = arr[i].length ();
            while ( arr[i].startsWith (res) ){
                res = res.substring (0, --j);
            }
        }

        return res;
    }

    public static void main ( String[] args ) {

    }
}
