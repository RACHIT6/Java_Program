package com.Binary_Tree;

public class Size_of_Binary_Tree {
    public static int size (TreeNode node) {
        if ( node == null ){
            return 0;
        }

        return size (node.left) + size (node.right) + 1;
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (1);
        TreeNode n1 = new TreeNode (2);
        TreeNode n2 = new TreeNode (3);
        TreeNode n3 = new TreeNode (4);

        root.left = n1;
        root.right = n2;
        n2.left = n3;

        System.out.println (size (root));
    }
}
