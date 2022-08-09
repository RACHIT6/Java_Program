package com.DSA;

public class practice_insertion_deletion_tree {
    public static Tree insert (Tree node, int key){
        if (node == null){
            return new Tree(key);
        } else if (key < node.data) {
            node.left = insert(node.left, key);
        } else if (key > node.data) {
            node.right = insert(node.right, key);
        }

        return node;
    }

    public static Tree delete (Tree node, int key){
        if (node == null){
            return null;
        }

        if (key < node.data){
            node.left = delete(node.left, key);
        }

        else if (key > node.data){
            node.right = delete(node.right, key);
        }

        else {
            if (node.left == null && node.right == null){
                return null;
            }

            else if (node.right == null){
                return delete(node.left, key);
            }

            else if (node.left == null){
                return delete(node.right, key);
            }

            Tree pd = predecessor(node);
            node.data = pd.data;
            node.left = delete(node.left, pd.data);
        }

        return node;
    }

    public static Tree predecessor (Tree node){
        node = node.left;
        while (node.right != null){
            node = node.right;
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

        insert(root, 14);
        delete(root, 14);
        delete(root, 12);
        root.inOrder(root);
    }
}
