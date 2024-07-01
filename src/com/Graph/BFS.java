package com.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main ( String[] args ) {
        Queue<Integer> eq = new LinkedList<> ();
        int i = 1;
        int [] visited = {0, 0, 0, 0, 0, 0, 0};

        int  [][] a = {
            {0,1,1,1,0,0,0},
            {1,0,1,0,0,0,0},
            {1,1,0,1,1,0,0},
            {1,0,1,0,1,0,0},
            {0,0,1,1,0,1,1},
            {0,0,0,0,1,0,0},
            {0,0,0,0,1,0,0}
        };

        visited[i] = 1;
        eq.offer (i);
        System.out.print (i);
        while (!eq.isEmpty ()) {
            int node = eq.poll ();

            for (int j = 0; j < a[0].length; j++) {
                if ( a[node][j] == 1 && visited[j] == 0) {
                    System.out.print (j);
                    eq.offer (j);
                    visited[j] = 1;
                }

            }
        }
    }
}
