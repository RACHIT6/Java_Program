package com.DSA;

public class Check_BST_or_Not {
    public static void main(String[] args) {
        Tree root = new Tree(15);
        Tree n2 = new Tree(17);
        Tree n3 = new Tree(10);
        Tree n4 = new Tree(8);
        Tree n5 = new Tree(10);

        root.right = n2;
        root.left = n3;
        n3.left = n4;
        n3.right = n5;

        System.out.println();
    }
}
