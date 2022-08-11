package com.DSA;
import java.util.ArrayList;

public class Graphs {
    public static void BFS (int target){
        ArrayList<Integer> list = new ArrayList<>(); // Implemented as Queue;
        int [] visited = {0, 0, 0, 0, 0, 0, 0};

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

        System.out.print(target);
        visited[target] = 1;
        list.add(target);
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

    public static void DFS (int target, int [] visited){
        visited[target] = 1;
        System.out.print(target +" ");

        int [][] connections ={
                {0, 1, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0},
                {1, 1, 0, 1, 1, 0, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 1},
                {0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0},
        };

        for (int i = 0; i < visited.length; i++) {
            if ( connections[target][i] == 1 && visited[i] == 0){
                DFS(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        int [] visited = {0, 0, 0, 0, 0, 0, 0};
        DFS (4, visited);
    }
}