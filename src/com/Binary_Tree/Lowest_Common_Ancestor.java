package com.Binary_Tree;

public class Lowest_Common_Ancestor {
    public static TreeNode LCA (TreeNode node, int v1, int v2){
        if ( node == null )
            return null;

        if ( node.val == v1 || node.val == v2 )
            return node;

        TreeNode left = LCA (node.left, v1, v2);
        TreeNode right = LCA (node.right, v1, v2);

        if ( left == null )
            return right;
        if ( right == null )
            return left;

        return node;
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (5);
        root.left = new TreeNode (2);
        root.right = new TreeNode (3);
        root.left.left = new TreeNode (4);
        root.left.left.right = new TreeNode (1);
        root.left.left.right.left = new TreeNode (7);
        root.left.left.right.right = new TreeNode (6);

        System.out.println (LCA (root, 4, 3).val);
    }
}
