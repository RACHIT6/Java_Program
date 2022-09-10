package com.Arrays_Question;

import java.util.PriorityQueue;
import java.util.Queue;

public class Min_Cost_to_connect_ropes {
    public static int minCost (int[] arr) {
        Queue<Integer> q = new PriorityQueue<> ();
        int cost = 0;

        for (int n : arr) {
            q.add (n);
        }

        while ( q.size () >= 2 ) {
            int s1 = q.poll ();
            int s2 = q.poll ();
            q.add (s1 + s2);
            cost += (s1 + s2);
        }

        return cost;
    }

    public static void main (String[] args) {
        int[] arr = {2 , 5 , 4 , 8 , 6 , 9};
        System.out.println (minCost (arr));
    }
}
