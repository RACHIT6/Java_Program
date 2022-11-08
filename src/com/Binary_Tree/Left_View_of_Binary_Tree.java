package com.Binary_Tree;

import java.util.ArrayList;

public class Left_View_of_Binary_Tree {
    public static void leftViewUtil (TreeNode node, ArrayList<Integer> list, int level){
        if ( node == null )
            return;
        if ( level == list.size () )
            list.add (level, node.val);

        leftViewUtil (node.left, list, level + 1);
        leftViewUtil (node.right, list, level + 1);
    }

    public static void leftView (TreeNode node) {
        ArrayList<Integer> list = new ArrayList<> ();

        leftViewUtil (node, list, 0);
        for (int n : list)
            System.out.print (n + " ");
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

        leftView (root);
    }
}
