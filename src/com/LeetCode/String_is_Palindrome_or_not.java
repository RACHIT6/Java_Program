package com.LeetCode;

public class String_is_Palindrome_or_not {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        StringBuilder add = new StringBuilder("");
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if (((int) s.charAt(i) <= 90 && (int) s.charAt(i) >= 65) || ((int) s.charAt(i) <= 122 && (int) s.charAt(i) >= 97) || ((int) s.charAt(i) >= 48) && ((int) s.charAt(i) <= 57)){
                add.append(s.charAt(i));
            }
        }

        String pre = add.toString();
        add.reverse();
        String rev = add.toString();
        System.out.println(pre.equals(rev));
    }
}
