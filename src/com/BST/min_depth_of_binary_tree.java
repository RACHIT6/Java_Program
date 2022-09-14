package com.BST;

public class min_depth_of_binary_tree {
    public static int depth (TreeNode root){
        if ( root == null ){
            return 0;
        }

        int right = depth (root.right) + 1;
        int left = depth (root.left) + 1;

        if ( left == 1 ){
            return right;
        } else if ( right == 1 ) {
            return left;
        } else {
            return Math.min (left, right);
        }
    }

    public static void main (String[] args) {
        TreeNode root = new TreeNode (2);
        root.left = new TreeNode (1);
        root.right = new TreeNode (3);

        root.right.left = new TreeNode (3);
        root.right.left.left = new TreeNode (2);
        root.right.right = new TreeNode (6);
        System.out.println (depth (root));
    }
}
