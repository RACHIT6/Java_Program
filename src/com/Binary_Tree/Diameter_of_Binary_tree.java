package com.Binary_Tree;

public class Diameter_of_Binary_tree {
    static int res = 0;
    public static int diameter (TreeNode node) {
        if ( node == null )
            return 0;

        int l = diameter (node.left);
        int r = diameter (node.right);
        res = Math.max (res, 1 + l + r);
        return 1 + Math.max (l, r);
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (3);
        root.left = new TreeNode (2);
        root.right = new TreeNode (4);
        root.right.left = new TreeNode (1);
        root.right.right = new TreeNode (5);

        diameter (root);
        System.out.println (res);
    }
}
