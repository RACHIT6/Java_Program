package com.company;
import java.util.ArrayList;

public class ArrayList_and_Methods {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();

//        l2.add(1);
//        l2.add(2);

//        Method to add or append element
//        .add() - add() method is used to add the value at last if index is not given and if given, place is respectively.
        l1.add(2);
        l1.add(1);
        l1.add(12);
        l1.add(23);
        l1.add(22);

//        Used to make a Shallow copy of arrayList in java.
        ArrayList<Integer> l2 = (ArrayList)l1.clone();

//        .removeAll() - It is used to remove arrayList elements from other ArrayList Ex = l1.removeAll(l2)
//        .removeIf() - It is used to remove the element which meet a given condition. Syntax = l1.removeIf(n->(n % 2 == 0))
//        .addAll() - It is used to add all element of arrayList to another arrayList at last if index is not given
//                    and is given then start placing elements from index itself.
//        .size() - It return the no of elements of arraylist.
//        .equals(Object o) :- This Helps in Identifying whether two array lists have the same values in same order or not!
//        .removeRange(int fromIndex, int toIndex) - removes the elements within the specified limits from the list.
//        .clear() -> removes all the element from array list.
//        .set() - It is used to edit a number on given index.

        l2.set(0, 78);
//        l2 = l1;
//        l1.clear();

        for(int element: l2){
            System.out.print(element+" ");
        }
    }
}
