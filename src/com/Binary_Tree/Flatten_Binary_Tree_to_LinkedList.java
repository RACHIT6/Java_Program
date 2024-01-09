package com.Binary_Tree;

import java.util.Stack;

public class Flatten_Binary_Tree_to_LinkedList {
    public static void preOrder (TreeNode root, Stack<Integer> s) {
        if (root == null) {
            return;
        }

        s.push (root.val);
        preOrder (root.left, s);
        preOrder (root.right, s);
    }

    public static void flatten(TreeNode root) {
        Stack<Integer> s = new Stack<> ();
        preOrder (root, s);

        TreeNode prev = null, curr = null;
        while (!s.isEmpty ()) {
            int popVal = s.pop ();

            if (prev == null) {
                prev = new TreeNode (popVal);
            }

            else {
                curr = new TreeNode (popVal);
                curr.right = prev;

                prev = curr;
                curr = null;
            }
        }
    }
}
