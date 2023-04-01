package com.Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_tree_level_order_Traversal {
    public List<List<Integer>> levelOrder( TreeNode root) {
        List<List<Integer>> l = new ArrayList<List<Integer>> ();
        Queue<TreeNode> q = new LinkedList<> ();
        q.add (root);

        while ( !q.isEmpty () ) {
            if ( q.peek () == null ){
                System.out.println ();
                q.poll ();
            }

            else {
                if ( q.peek ().left != null && q.peek ().right != null ){
                    q.offer (q.peek ().left);
                    q.offer (q.peek ().right);
                    q.offer (null);
                }
                else if (  q.peek ().left != null ) {
                    q.offer (q.peek ().left);
                }
                else if (  q.peek ().right != null ) {
                    q.offer (q.peek ().right);
                }

                System.out.print (q.poll ().val + " ");
            }
        }

        return l;
    }

    public static void main ( String[] args ) {

    }
}
