package com.LeetCode;

public class Find_Last_word_length_of_given_string {
    public static void main(String[] args) {
        String s = "I am a good boy";
        String [] arr = s.split(" ");
        System.out.println(arr[arr.length - 1].length());
    }
}
