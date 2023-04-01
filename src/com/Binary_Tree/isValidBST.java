package com.Binary_Tree;

import java.util.ArrayList;

public class isValidBST {
    public void inOrder ( TreeNode root, ArrayList<Integer> list){
        if (root != null){
            inOrder (root.left, list);
            list.add (root.val);
            inOrder (root.right, list);
        }
    }

    public boolean isValidBST(TreeNode root) {
        if ( root == null )
            return false;

        ArrayList<Integer> list = new ArrayList<> ();
        inOrder (root, list);

        return true;
    }
}
