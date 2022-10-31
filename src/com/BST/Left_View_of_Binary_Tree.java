package com.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Left_View_of_Binary_Tree {
    public static void leftView (TreeNode node){
        Queue<TreeNode> q = new LinkedList<> ();
        ArrayList<Integer> list = new ArrayList<> ();
        q.offer (node);
        list.add (node.val);

        while ( !q.isEmpty () ){
            if ( q.peek () == null ){
                q.poll ();
            }

            else {
                if ( q.peek ().left != null && q.peek ().right != null ){
                    q.offer (q.peek ().left);
                    q.offer (q.peek ().right);
                    list.add (q.peek ().left.val);
                }
                else if (  q.peek ().left != null ) {
                    q.offer (q.peek ().left);
                    list.add (q.peek ().left.val);
                }
                else if (  q.peek ().right != null ) {
                    q.offer (q.peek ().right);
                    list.add (q.peek ().right.val);
                }

                q.poll ();
            }
        }

        System.out.println (list);
    }

    public static void rightView (TreeNode node){
        Queue<TreeNode> q = new LinkedList<> ();
        ArrayList<Integer> list = new ArrayList<> ();
        q.offer (node);
        list.add (node.val);

        while ( !q.isEmpty () ){
            if ( q.peek () == null ){
                q.poll ();
            }

            else {
                if ( q.peek ().left != null && q.peek ().right != null ){
                    q.offer (q.peek ().left);
                    q.offer (q.peek ().right);
                    list.add (q.peek ().right.val);
                }
                else if (  q.peek ().right != null ) {
                    q.offer (q.peek ().right);
                    list.add (q.peek ().right.val);
                }
                else if (  q.peek ().left != null ) {
                    q.offer (q.peek ().left);
                    list.add (q.peek ().left.val);
                }

                q.poll ();
            }
        }

        System.out.println (list);
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (4);
        root.left = new TreeNode (3);
        root.right = new TreeNode (2);
        root.right.left = new TreeNode (1);
        root.right.right = new TreeNode (7);
        root.right.right.left = new TreeNode (6);
        root.right.right.right = new TreeNode (5);

        leftView (root);
        rightView (root);
    }
}
