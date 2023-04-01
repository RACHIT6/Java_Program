package com.Binary_Search_tree;

import java.util.HashMap;

public class Two_sum_in_BST {
    public static void two_sum_util (TreeNode node, int target, HashMap<Integer, TreeNode> map) {
        if ( node != null ){
            two_sum_util (node.left, target, map);

            two_sum_util (node.right, target, map);
        }
    }

    public static boolean two_sum (TreeNode node, int target){
        HashMap<Integer, TreeNode> map = new HashMap<> ();
        return true;
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (60);
        root.left = new TreeNode (40);
        root.left.left = new TreeNode (30);
        root.left.right = new TreeNode (50);
        root.right = new TreeNode (100);
        root.right.left = new TreeNode (80);
        root.right.left.left = new TreeNode (70);
        root.right.left.right = new TreeNode (90);
    }
}
