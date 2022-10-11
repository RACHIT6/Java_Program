package com.BST;

import java.util.ArrayList;

public class views_of_BST {
    public static void rightView (TreeNode node, ArrayList<Integer> list){
        if ( node == null ){
            return;
        }

        list.add (node.val);
        rightView (node.right, list);
    }

    public static void leftView (TreeNode node, ArrayList<Integer> list){
        if ( node == null ){
            return;
        }

        list.add (node.val);
        leftView (node.left, list);
    }

    public static void bottomView (TreeNode node, ArrayList<Integer> list){
        if ( node == null ){
            return;
        }

        if ( node.left == null || node.right == null ){
            list.add (node.val);
        }

        bottomView (node.left, list);
        bottomView (node.right, list);
    }

    /*
    *                     4
    *             2               5
    *        3       3        6          3
    *
    *
    * */

    public static void main (String[] args) {
        TreeNode root = new TreeNode (10);
        root.left = new TreeNode (8);
        root.right = new TreeNode (45);
        root.right.left = new TreeNode (30);

        ArrayList<Integer> list = new ArrayList<> ();
//        leftView (root.left, list);
//        rightView (root, list);
        bottomView (root, list);
        System.out.println (list);
    }
}
