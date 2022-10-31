package com.BST;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Top_view_of_Binary_Tree {
    public static void topView (TreeNode node) {
        HashMap<Integer, Integer> map = new HashMap<> ();
        map.put (0, node.val);

        Queue<TreeNode> q = new LinkedList<> ();
        q.offer (node);
        q.offer (null);

        while ( !q.isEmpty () ){
            if ( q.peek () == null ){
                System.out.println ();
                q.poll ();
            }

            else {
                if ( q.peek ().left != null && q.peek ().right != null ){
                    q.offer (q.peek ().left);
                    q.offer (q.peek ().right);
                    q.offer (null);
                }
                else if (  q.peek ().left != null ) {
                    q.offer (q.peek ().left);
                }
                else if (  q.peek ().right != null ) {
                    q.offer (q.peek ().right);
                }

                System.out.print (q.poll ().val + " ");
            }
        }
    }

    public static void main ( String[] args ) {

    }
}
