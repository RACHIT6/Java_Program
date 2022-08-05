package com.DSA;

public class Convert_BST_to_Singlee_linked_list {
    public static void treeToList (Tree node){
       if (node == null){
           return;
       }

       if (node.left == null && node.right == null){
           return;
       }

       if (node.left != null){
           treeToList(node.left);

           Tree temp = node.right;
           node.right = node.left;
           node.left = null;

           Tree current = node.right;
           while (current.right != null){
               current = current.right;
           }
           current.right = temp;
       }

       treeToList(node.right);
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

        root.insert(60);
        treeToList(root);
        root.inOrder(root);
        System.out.println();
    }
}
