package com.DSA;

public class AVL_Trees {
    public static int heightNode (Tree node){
        if (node == null) {
            return 0;
        }

        int leftHeight = heightNode(node.left);
        int rightHeight = heightNode(node.right);

        int maxHeight = Math.max(leftHeight, rightHeight);
        return maxHeight + 1;
    }

    public static int BFactor (Tree node){
        if (node == null){
            return 0;
        }

        int BFLeft = heightNode(node.left);
        int BFRight = heightNode(node.right);

        return (BFLeft - BFRight);
    }

    public static Tree rightRotate (Tree y){
        Tree x = y.left;
        Tree T2 = x.right;

        x.right = y;
        y.left = T2;
        return x;
    }

    public static Tree leftRotate (Tree x){
        Tree y = x.right;
        Tree T2 = y.left;

        y.left = x;
        x.right = T2;
        return y;
    }

    public static Tree insert (Tree node, int key){
        if (node == null){
            return new Tree(key);
        } else if (key < node.data) {
            node.left = insert(node.left, key);
        } else if (key > node.data) {
            node.right = insert(node.right, key);
        }

//        Left Left insertion case
        if (BFactor(node) > 1 && key < node.left.data){
            return rightRotate(node);
        }

//        Right Right insertion case
        if (BFactor(node) < -1 && key > node.right.data){
            return leftRotate(node);
        }

//        Left Right insertion case
        if (BFactor(node) > 1 && key > node.left.data){
            node.left = leftRotate(node.left);
           return rightRotate(node);
        }

//        Right Left insertion case
        if (BFactor(node) < -1 && key > node.right.data){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    public static void main(String[] args) {
        Tree root = new Tree(15);
        Tree n2 = new Tree(17);
        Tree n3 = new Tree(10);
        Tree n4 = new Tree(8);
        Tree n5 = new Tree(12);

        root.right = n2;
        root.left = n3;
        n3.left = n4;
        n3.right = n5;

        root = insert(root, 11);
        root.inOrder(root);
        System.out.println();
        System.out.println(BFactor(root));
    }
}