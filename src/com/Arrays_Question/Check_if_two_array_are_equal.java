package com.Arrays_Question;

import java.util.HashMap;

public class Check_if_two_array_are_equal {
    public static boolean check(long A[],long B[],int N)
    {
        HashMap<Long, Integer> map = new HashMap<> ();

        for (long n : A) {
            if ( !map.containsKey (n) )
                map.put (n, 1);

            else {
                map.put (n, map.get (n) + 1);
            }
        }

        for (long n : B) {
            if ( !map.containsKey (n) )
                return false;

            if ( map.containsKey (n) && map.get (n) > 1 ) {
                map.put (n, map.get (n) - 1);
            }

            else {
                map.remove (n);
            }
        }

        return map.isEmpty ();
    }
}
