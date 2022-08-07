package com.DSA;

import java.util.ArrayList;

public class Program_to_print_all_branch_to_leave_nodes {
    public static void printList(ArrayList<Integer> list){
        System.out.println(list.toString());
    }

    public static void printToLeafNode (Tree root, ArrayList<Integer> list){
        if (root == null){
            return;
        }

        list.add(root.data);
        if (root.left == null && root.right == null){
            printList(list);
        }

        else{
            printToLeafNode(root.left, list);
            printToLeafNode(root.right, list);
        }

        list.remove(list.size() - 1);
    }

    public static void main(String[] args) {
        Tree root = new Tree(45);
        Tree n2 = new Tree(30);
        Tree n3 = new Tree(75);
        Tree n4 = new Tree(20);
        Tree n5 = new Tree(35);
        Tree n6 = new Tree(105);

//        Connections
        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;

        printToLeafNode(root, new ArrayList<Integer>(){});
    }
}
