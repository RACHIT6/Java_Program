package com.DSA;

import java.util.PriorityQueue;
import java.util.Queue;

public class practice_BFS {
    public static void main(String[] args) {
        Queue<Integer> EQ = new PriorityQueue<> ();
        int [] visited = {0, 0, 0, 0, 0, 0, 0};

        int [][] connections = {
                {0, 1, 1, 1, 0, 0, 0},
                {1, 0, 0, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0, 0},
                {1, 1, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
        };

        int i = 5; //5 4 2 3 6 0 1
        visited[i] = 1;
        EQ.add (i);
        System.out.print (i);
        while (!EQ.isEmpty ()){
            int node = EQ.remove ();
            for (int j = 0; j < visited.length; j++) {
                if ( visited[j] == 0 && connections[node][j] == 1){
                    EQ.add (j);
                    System.out.print(" "+j);
                    visited[j] = 1;
                }
            }
        }
    }
}