package com.Binary_Tree;

public class Count_node_in_complete_Binary_Tree {
    public static int countNodesUtil (TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = countNodesUtil (root.left) + 1;
        int right = countNodesUtil (root.right) + 1;

        return right + left + 1;
    }

    public static void main ( String[] args ) {
        System.out.println ();
    }
}
