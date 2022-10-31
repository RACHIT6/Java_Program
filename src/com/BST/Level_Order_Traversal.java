package com.BST;

import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Traversal {
    public static void levelTraversalR (Queue<TreeNode> q){
        if ( q.isEmpty () )
            return;

        if ( q.peek () != null ){
            TreeNode popNode = q.poll ();
            System.out.print (popNode.val+" ");
            q.offer (popNode.left);
            q.offer (popNode.right);
        }

        else
            q.poll ();

        levelTraversalR (q);
    }

    public static void levelTraversal (TreeNode node){
        Queue<TreeNode> q = new LinkedList<> ();
        q.offer (node);
        q.offer (null);

        while ( !q.isEmpty () ){
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
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (1);
        TreeNode n1 = new TreeNode (2);
        TreeNode n2 = new TreeNode (3);
        TreeNode n3 = new TreeNode (4);
        TreeNode n4 = new TreeNode (5);

        root.left = n1;
        root.right = n2;
        n1.right = n4;
        n2.left = n3;

        Queue<TreeNode> q = new LinkedList<> ();
        q.add (root);
//        levelTraversalR (q);
        levelTraversal (root);
    }
}
