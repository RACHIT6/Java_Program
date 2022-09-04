package com.DSA;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Kth_level_sum {
    public static int kthSum (Tree root, int k){
        if ( root == null )
            return 0;

        Queue<Tree> q = new LinkedList<> ();
        q.add (root);
        int i = 1;
        int sum = 0;

        while ( !q.isEmpty () ){
            int size = q.size ();

            while ( size --> 0 ){
                Tree node = q.peek ();
                q.remove ();

                if ( i == k ){
                    sum += node.data;
                }

                else {
                    if ( node.left != null ){
                        q.add (node.left);
                    }

                    if ( node.right != null ){
                        q.add (node.right);
                    }
                }
            }

            i++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        Tree n2 = new Tree(2);
        Tree n3 = new Tree(3);
        Tree n4 = new Tree(4);
        Tree n5 = new Tree(5);
        Tree n6 = new Tree(6);

//        Connections
        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;

        System.out.println (kthSum (root, 1));
    }
}
