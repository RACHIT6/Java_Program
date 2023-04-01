package com.Binary_Tree;

import java.util.HashMap;

public class Find_largest_at_each_level {
    public void level (TreeNode node, int level, HashMap<Integer, Integer> map) {
        if ( map.containsKey (level) ){
            map.put (level, Math.max (map.get (level), node.val));
        }

        map.put (level, node.val);
        level (node.left, level + 1, map);
        level (node.right, level + 1, map);
    }

    public static void main ( String[] args ) {

    }
}
