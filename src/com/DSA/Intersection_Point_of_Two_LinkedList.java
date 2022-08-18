package com.DSA;

public class Intersection_Point_of_Two_LinkedList {
    public static int length (linkedList node){
        int size = 1;
        while ( node != null ){
            node = node.next;
            size++;
        }

        return size;
    }

    public static Boolean isIntersect (linkedList list1, linkedList list2){
        int size1 = length (list1);
        int size2 = length (list2);

        if ( size1 > size2 ){
            int diff = size1 - size2;
            int i = 0;
            while ( i++ < diff ){
                list1 = list1.next;
            }
        }

        if ( size1 > size2 ){
            int diff = size2 - size1;
            int i = 0;
            while ( i++ < diff ){
                list2 = list2.next;
            }
        }

        while ( list1 != null && list2 != null ){
            if ( list1 == list2 ){
                return true;
            }

            list1 = list1.next;
            list2 = list2.next;
        }

        return false;
    }

    public static void main(String[] args) {
//        list1
        linkedList head1 = new linkedList (2);
        linkedList n2 = new linkedList (2);
        linkedList n3 = new linkedList (2);
        linkedList n4 = new linkedList (2);
//        list2
        linkedList head2 = new linkedList (2);
        linkedList n5 = new linkedList (2);
        linkedList n6 = new linkedList (2);
        linkedList n7 = new linkedList (2);

        head1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n7;

        head2.next = n5;
        n5.next = n6;
        n6.next = n4;

        System.out.println (isIntersect (head1, head2));
    }
}
