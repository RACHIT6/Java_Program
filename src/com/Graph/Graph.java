package com.Graph;

import java.util.Arrays;

public class Graph {
    int [][] adj;

    Graph (int nodes) {
        this.adj = new int[nodes][nodes];
    }

    public void addNode ( int u , int v ){
        this.adj[u][v] = 1;
        this.adj[v][u] = 1;
    }

    public static void main ( String[] args ) {
        Graph g= new Graph (4);
        g.addNode (0, 1);
        g.addNode (1, 2);
        g.addNode (2, 3);
        g.addNode (3, 0);

        System.out.println (Arrays.deepToString (g.adj));
    }
}
