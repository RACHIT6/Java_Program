package com.Binary_Tree;

public class Find_ceil_and_floor {
    public static int floor (TreeNode node, int target) {
        if ( node == null )
            return Integer.MAX_VALUE;

        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MIN_VALUE;
        while ( node != null ) {
            if ( node.val == target ){
                ceil = node.val;
                floor = node.val;
                break;
            }

            else if ( node.val < target ){
                floor = node.val;
                node = node.right;
            }

            else {
                ceil = node.val;
                node = node.left;
            }
        }

        System.out.println ("CEIL: "+ ceil);
        System.out.println ("FLOOR:  "+ floor);

        return floor;
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (40);
        root.left = new TreeNode (20);
        root.right = new TreeNode (60);
        root.left.left = new TreeNode (10);
        root.left.right = new TreeNode (30);

        floor (root, 11);
    }
}
