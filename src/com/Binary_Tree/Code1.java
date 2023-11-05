package com.Binary_Tree;

public class Code1 {
    public static void preOrder (TreeNode root) {
        if ( root != null ) {
            System.out.println (root.val);
            preOrder (root.left);
            preOrder (root.right);
        }
    }
    public static void inOrder (TreeNode root) {
        if ( root != null ) {
            inOrder (root.left);
            System.out.println (root.val);
            inOrder (root.right);
        }
    }
    public static void postOrder (TreeNode root) {
        if ( root != null ) {
            postOrder (root.left);
            postOrder (root.right);
            System.out.println (root.val);
        }
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (1);
        root.left = new TreeNode (2);
        root.right = new TreeNode (3);
        root.left.left = new TreeNode (4);
        root.left.right = new TreeNode (5);
    }
}
