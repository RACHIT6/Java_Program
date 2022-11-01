package com.BST;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Top_view_of_Binary_Tree {
    public static void topViewUtil ( TreeNode node, HashMap<Integer, Integer> map, int level){
        if ( node == null )
            return;

        if ( !map.containsKey (level) )
            map.put (level, node.val);

        topViewUtil (node.left, map, level - 1);
        topViewUtil (node.right, map, level + 1);
    }

    public static void topView (TreeNode node) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer> ();

        topViewUtil (node, map, 0);

        TreeMap<Integer, Integer> sorted = new TreeMap<> ();
        sorted.putAll (map);
        for (Map.Entry<Integer, Integer> entry : sorted.entrySet())
            System.out.print (entry.getValue () + " ");
    }

    public static void main ( String[] args ) {
        TreeNode root = new TreeNode (4);
        root.left = new TreeNode (3);
        root.right = new TreeNode (2);
        root.left.left = new TreeNode (15);
        root.right.left = new TreeNode (1);
        root.right.right = new TreeNode (7);
        root.right.right.left = new TreeNode (6);
        root.right.right.right = new TreeNode (5);

        topView (root);
    }
}
