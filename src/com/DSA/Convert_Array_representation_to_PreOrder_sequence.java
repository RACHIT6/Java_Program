package com.DSA;

public class Convert_Array_representation_to_PreOrder_sequence {
    public static void preOrder (Tree root){
        if (root == null){
            return;
        }

        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder (Tree root){
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }

    static int i = -1;
   public static Tree arrayToLinked (int [] arr){
       i++;
       if (arr[i] == -1){
            return null;
       }

       Tree root = new Tree(arr[i]);
       root.left = arrayToLinked(arr);
       root.right = arrayToLinked(arr);

        return root;
   }
   
   public static Tree arrayToLinkedModified (int [] arr){
       i++;
       if (arr[i] == -1){
            return null;
       }

       Tree root = null;
       while (i < arr.length){
           root = new Tree(arr[i]);
           root.left = new Tree(arr[i + 1]);
           root.right = new Tree(arr[i + 1]);
           i = i + 2;
       }

        return root;
   }

    public static void main(String[] args) {
        int [] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree root = arrayToLinkedModified(arr);
        preOrder(root);
        System.out.println();
    }
}
