package com.LeetCode;

public class Program_to_add_Two_binary_number {
    public static void main(String[] args) {
        String a = "101";
        String b = "101";
        int carry = 0;
        StringBuilder s1 = new StringBuilder (a);
        StringBuilder s2 = new StringBuilder (b);
        StringBuilder res = new StringBuilder ();
        s1.reverse ();
        s2.reverse ();

        int i = 0, sum;

        while ( i < a.length () || i < b.length () ) {
            sum = carry;
            if ( i < a.length () )
                sum += s1.charAt (i) - '0';
            if ( i < b.length () )
                sum += s2.charAt (i) - '0';

            if ( sum == 0 ) {
                carry = 0;
                res.append ('0');
            }
            if ( sum == 1 ) {
                carry = 0;
                res.append ('1');
            }
            if ( sum == 2 ) {
                carry = 1;
                res.append ('0');
            }
            if ( sum == 3 ) {
                carry = 1;
                res.append ('1');
            }

            System.out.println (sum);
            i++;
        }

        if ( carry == 1 )
            res.append ('1');

        res.reverse ();
        System.out.println (res.toString ());
    }
}
