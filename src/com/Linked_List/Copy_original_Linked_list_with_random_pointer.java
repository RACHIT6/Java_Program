package com.Linked_List;

class randomLink {
    int val;
    randomLink next;
    randomLink random;

    randomLink (int val){
        this.val = val;
        this.next = null;
    }

    public static void print (randomLink head){
        while ( head != null ){
            System.out.print (head.val +" ");
            head = head.next;
        }

        System.out.println ();
    }
}

public class Copy_original_Linked_list_with_random_pointer {
    public static randomLink makeDuplicate (randomLink head){
        randomLink original = head;

        while ( original != null ){
            randomLink temp = original.next;
            original.next = new randomLink (original.val);
            original.next.next = temp;
            original = temp;
        }

        while ( original != null ){
            if ( original.next != null ){
                original.next.random = (original.random != null) ? original.random.next : null;
            }

            original = original.next.next;
        }

        randomLink curr = head;
        randomLink copy = head.next;
        randomLink temp = copy;

        while ( curr != null ){
            curr.next = curr.next.next;
            copy.next =  (copy.next != null) ? copy.next.next  : copy.next;

            curr = curr.next;
            copy = copy.next;
        }

        return temp;
    }

    public static void main (String[] args) {
        randomLink head = new randomLink (1);
        randomLink n2 = new randomLink (2);
        randomLink n3 = new randomLink (3);

        head.next = n2;
        n2.next = n3;

        randomLink.print (makeDuplicate (head));
    }
}
