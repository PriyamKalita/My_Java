package com.company;
import  java.util.*;
public class Pep14th {
    public static void main(String[] args) {
        // Arraylist
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list + "  --->  " + list.size());
        // Add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + " ---> " + list.size());

        list.add(1, 100);
        System.out.println(list + " ---> " + list.size());

        int val = list.get(1);
        System.out.println(val);

        list.set(1, 200);
        System.out.println(list + " ---> " + list.size());


        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Hello");
        l1.add("Bello");
        l1.add("Cello");
        System.out.println(l1 + " ---> " + l1.size());

//        for (int i = 0; i<list.size(); i++){
//            int val1 = list.get(i);
//            System.out.println(val1);
//        }

//        for(int val1: list){
//            System.out.println(val1);
//        }

        System.out.println(list);

    }
}
