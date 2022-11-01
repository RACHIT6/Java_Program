package com.BST;

import java.util.ArrayList;

public class Right_View_Of_Binary_tree {
    public static void rightViewUtil (TreeNode node, ArrayList<Integer> l, int level){
        if ( node == null )
            return;

        if ( level == l.size () )
            l.add (node.val);

        rightViewUtil (node.right, l, level + 1);
        rightViewUtil (node.left, l, level + 1);
    }

    public static void rightView (TreeNode node){
        ArrayList<Integer> list = new ArrayList<> ();

        rightViewUtil (node, list, 0);

        for (int n : list)
            System.out.print (n + " ");
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (4);
        root.left = new TreeNode (3);
        root.right = new TreeNode (2);
        root.left.left = new TreeNode (15);
        root.right.left = new TreeNode (1);
        root.right.right = new TreeNode (7);
        root.right.right.left = new TreeNode (6);
        root.right.right.right = new TreeNode (5);

        rightView (root);
    }
}
