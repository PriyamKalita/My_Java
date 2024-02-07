package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);

        l2.add(12);
        l2.add(22);
        l2.add(32);

        l1.add(6);
        l1.add(7);
        l1.add(4);

        l1.add(0,2);
        l1.add(0,3);

        l1.addAll(0,l2);
        //l1.clear();

        System.out.println(l1.contains(9));
        System.out.println(l1.contains(19));
        System.out.println(l2.contains(12));

        System.out.println(l1.indexOf(6));
        System.out.println(l2.indexOf(32));
        System.out.println(l2.indexOf(132));
        System.out.println(l1.lastIndexOf(6));

        l1.set(0,123);

        for (int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
