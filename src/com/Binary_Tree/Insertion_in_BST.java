package com.Binary_Tree;

public class Insertion_in_BST {
    public static void insert (TreeNode node, int key){
        if ( node == null )
            return;

        if ( node.val > key && node.left != null){
            insert (node.left, key);
        }

        else if ( node.val < key && node.right != null ){
            insert (node.right, key);
        }

        else if ( node.val > key ){
            node.left = new TreeNode (key);
        }

        else {
            node.right = new TreeNode (key);
        }
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (10);
        root.left = new TreeNode (8);
        root.right = new TreeNode (12);

        insert (root, 9);
        TreeNode.preOrder (root);
    }
}
