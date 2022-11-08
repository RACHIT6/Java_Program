package com.Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Sum_of_left_leaf_node {
    public static int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<> ();
        int sum = 0;
        q.offer (root);
        q.offer (null);

        while ( !q.isEmpty () ){
            if ( q.peek () == null ){
                q.poll ();
            }

            else {
                if ( q.peek ().left != null && q.peek ().right != null ){
                    if ( q.peek ().left.left == null && q.peek ().left.right == null)
                        sum += q.peek ().left.val;

                    q.offer (q.peek ().left);
                    q.offer (q.peek ().right);
                    q.offer (null);
                }
                else if (  q.peek ().left != null ) {
                    if ( q.peek ().left.left == null && q.peek ().left.right == null)
                        sum += q.peek ().left.val;

                    q.offer (q.peek ().left);
                }
                else if (  q.peek ().right != null ) {
                    q.offer (q.peek ().right);
                }

                q.poll ();
            }
        }

        return sum;
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (4);
        root.left = new TreeNode (3);
        root.left.left = new TreeNode (15);
        root.right = new TreeNode (2);
        root.right.left = new TreeNode (1);
        root.right.right = new TreeNode (7);
        root.right.right.left = new TreeNode (6);
        root.right.right.right = new TreeNode (5);

        System.out.println (sumOfLeftLeaves (root));
    }
}
