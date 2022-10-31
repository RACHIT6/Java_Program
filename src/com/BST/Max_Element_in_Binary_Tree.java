package com.BST;

public class Max_Element_in_Binary_Tree {
    public static int max (TreeNode node){
        if ( node == null )
            return Integer.MIN_VALUE;

        return Math.max (node.val, Math.max (max (node.left), max (node.right)));
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (1);
        TreeNode n1 = new TreeNode (2);
        TreeNode n2 = new TreeNode (3);
        TreeNode n3 = new TreeNode (4);

        root.left = n1;
        root.right = n2;
        n2.left = n3;

        System.out.println (max (root));
    }
}
