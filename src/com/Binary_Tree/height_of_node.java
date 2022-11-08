package com.Binary_Tree;

public class height_of_node {
    public static int nodeHeight (TreeNode node){
        if ( node == null ){
            return 0;
        }

        return Math.max (nodeHeight (node.left), nodeHeight (node.right)) + 1;
    }

    public static void main (String[] args) {
        TreeNode root = new TreeNode (10);
        root.left = new TreeNode (8);
        root.right = new TreeNode (45);
        root.right.left = new TreeNode (30);

        System.out.println (nodeHeight (root));
    }
}
