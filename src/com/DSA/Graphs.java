package com.DSA;
import java.util.ArrayList;

public class Graphs {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); // Implemented as Queue;
        int [] visited = {0, 0, 0, 0, 0, 0, 0};
        int i = 5;

//        Adjacency Matrix.
        int [][] connections ={
                {0, 1, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1, 0, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
        };

        System.out.print(i);
        visited[i] = 1;
        list.add(i);
        while (!list.isEmpty()){
            int node = list.remove(0);
            for (int j = 0; j < 7; j++) {
                if (connections[node][j] == 1 && visited[j] == 0){
                    System.out.print(" "+ j);
                    visited[j] = 1;
                    list.add(j);
                }
            }
        }
    }
}
