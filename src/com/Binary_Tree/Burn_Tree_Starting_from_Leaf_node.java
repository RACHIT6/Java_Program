package com.Binary_Tree;

public class Burn_Tree_Starting_from_Leaf_node {
    /*Wrapper class*/
    static class depth {
        int d;
        depth (int d){
            this.d = d;
        }
    }

    static int ans = 0;
    public static int burn (TreeNode node, int target, depth d){
        if ( node == null ){
            return 0;
        }

        if ( node.val == target ){
            d.d = 1;
            return 1;
        }

        depth ld = new depth (-1);
        depth rd = new depth (-1);

        int lh = burn (node.left, target, ld);
        int rh = burn (node.right, target, rd);

        if ( ld.d != -1 ){
            ans = Math.max (ans, ld.d + rh + 1);
            d.d = ld.d + 1;
        } else if ( rd.d != -1 ) {
            ans = Math.max (ans, rd.d + lh + 1);
            d.d = rd.d + 1;
        }

        return Math.max (lh, rh) + 1;
    }

    public static int minTime (TreeNode node, int target){
        depth d = new depth (-1);
        burn (node, target, d);
        return ans;
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (5);
        root.left = new TreeNode (2);
        root.right = new TreeNode (6);
        root.left.left = new TreeNode (3);
        root.left.right = new TreeNode (4);
        root.right.left = new TreeNode (1);
        root.right.right = new TreeNode (7);

        System.out.println (minTime (root, 1));
    }
}
