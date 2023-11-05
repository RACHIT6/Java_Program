package com.Binary_Search_tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class NAry_preorder_Traversal {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<> ();
        List<Node> q = new ArrayList<> ();

        q.add (root);

        while ( !q.isEmpty () ) {
            Node node = q.remove (0);
            while ( !node.children.isEmpty () ) {
                
                node.children.remove (0);
            }

        }

        return list;
    }

}
