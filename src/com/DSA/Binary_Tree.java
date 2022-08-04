package com.DSA;

class Tree {
    int data;
    Tree left;
    Tree right;

    Tree (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

//    Searching
    public Tree Search (Tree root, int key){
        if (root == null){
            return new Tree(-1);
        } else if (root.data == key){
            return root;
        } else if (root.data > key) {
            return Search(root.left, key);
        } else {
            return Search(root.right, key);
        }
    }

//    Traversals
    public void preOrder(Tree root){
        if (root != null){
            System.out.print(root.data +" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }public void inOrder(Tree root){
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data +" ");
            inOrder(root.right);
        }
    }public void postOrder(Tree root){
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +" ");
        }
    }

    public int countNode (Tree node){
        if (node == null){
            return 0;
        }

        int leftCount = countNode(node.left);
        int rightCount = countNode(node.right);

        return leftCount + rightCount + 1;
    }

    public int sumNodes (Tree node){
        if (node == null){
            return 0;
        }

        return node.data + sumNodes(node.left) + sumNodes(node.right);
    }

    public int heightNode (Tree node){
        if (node == null) {
            return 0;
        }

        int leftHeight = heightNode(node.left);
        int rightHeight = heightNode(node.right);

        int maxHeight = Math.max(leftHeight, rightHeight);
        return maxHeight + 1;
    }

    public void insert (int key){
        Tree node = this;
        Tree prev = null;
        while (node != null){
            prev = node;
            if (node.data == key){
                System.out.println("Already stored");
                return;
            }

            else if (node.data > key){
                node = node.left;
            }

            else{
                node = node.right;
            }
        }

        if (prev.data > key){
            prev.left = new Tree(key);
        }

        else{
            prev.right = new Tree(key);
        }
    }

    public Tree predecessor(Tree node){
        node = node.left;
        while (node.right != null){
            node = node.right;
        }

        return node;
    }

    public Tree deleteNode (Tree node, int key){
        if (node == null){
            return null;
        }

        if (key > node.data){
            node.right = deleteNode(node.right, key);
        }

        else if (key < node.data){
            node.left = deleteNode(node.left, key);
        }

        else {
            if (node.right == null && node.left == null){
                return null;
            } else if(node.left == null){
                return deleteNode(node.right, key);
            } else if (node.right == null){
                return deleteNode(node.left, key);
            }

            Tree pd = predecessor(node);
            node.data = pd.data;
            node.left = deleteNode(node.left, pd.data);
        }

        return node;
    }

//    Inclusive range
    public void printRange (Tree node, int lower, int upper){
        if (node == null){
            return;
        }

        if (node.data <= upper && node.data >= lower){
            printRange(node.left, lower , upper);
            System.out.println(node.data);
            printRange(node.right, lower, upper);
        } else if (node.data > lower){
            printRange(node.right, lower, upper);
        } else {
            printRange(node.left, lower, upper);
        }
    }
}

public class Binary_Tree {
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

//        System.out.println(root.heightNode(root));
        root.inOrder(root);
        System.out.println();
        root.deleteNode(root, 20);
        root.inOrder(root);
//        Tree res = root.Search(root, 20);
//        System.out.println(res.data);
    }
}
