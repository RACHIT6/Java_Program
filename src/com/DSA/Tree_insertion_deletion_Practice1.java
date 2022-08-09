package com.DSA;

public class Tree_insertion_deletion_Practice1 {
    public static void insert (Tree root, int key){
        Tree node = root;
        Tree prev = null;
        if (node == null){
            return;
        }

        while (node != null){
            prev = node;
            if (node.data == key){
                System.out.println("Already there");
                return;
            }

            else if (node.data < key){
                node = node.right;
            }

            else {
                node = node.left;
            }

        }

        if (prev.data > key){
            prev.left = new Tree(key);
        }

        else{
            prev.right = new Tree(key);
        }
    }

    public static Tree delete (Tree node, int key){
        if (node == null){
            return null;
        }

        else if (node.data > key){
            node.left = delete(node.left, key);
        }

        else if (node.data < key){
            node.right = delete(node.right, key);
        }

        else {
            if (node.left == null && node.right == null){
                return null;
            } else if (node.right == null){
                return delete(node.left, key);
            } else if (node.left == null) {
                return delete(node.right, key);
            }

            Tree pd = successor(node);
            node.data = pd.data;
            node.right = delete(node.right, pd.data);
        }

        return node;
    }

    public static Tree predecessor(Tree node){
        node = node.left;
        while (node.right != null){
            node = node.right;
        }

        return node;
    }

    public static Tree successor (Tree node){
        node = node.right;
        while (node.left != null){
            node = node.left;
        }

        return node;
    }

    public static Tree search (Tree node, int key){
        if (node == null){
            return new Tree(-1);
        }

        if (node.data == key){
            return node;
        } else if (node.data > key) {
            return search(node.left, key);
        } else {
            return search(node.right, key);
        }
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

        root.inOrder(root);
        System.out.println();
        Tree res = search(root, 21);
        System.out.println(res.data);
        root.inOrder(root);
    }
}
