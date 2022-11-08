package com.Binary_Tree;

public class Binary_Tree_to_DLL {
    static TreeNode prev = null, head = null;
    public static void convertToDLL (TreeNode node){
        if ( node == null )
            return;

        convertToDLL (node.left);
        if ( prev == null )
            head = node;

        else {
            node.left = prev;
            prev.right = node;
        }

        prev = node;
        convertToDLL (node.right);
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (3);
        root.left = new TreeNode (5);
        root.right = new TreeNode (2);
        root.right.left = new TreeNode (1);
        root.right.left.left = new TreeNode (4);
        root.right.left.right = new TreeNode (6);

        convertToDLL (root);
        while ( head != null ){
            System.out.print (head.val + " ");
            head = head.right;
        }
    }
}
