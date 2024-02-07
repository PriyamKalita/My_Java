package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Classroom {

//    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
//        int temp = list.get(idx1);
//        list.set(idx1, list.get(idx2));
//        list.set(idx2, temp);
//    }

    // Brute Force Approach   -    O(n^2)
//    public static int storeWater(ArrayList<Integer> height){
//        int maxWater = 0;
//
//        for (int i = 0; i < height.size(); i++){
//            for (int j = i + 1; j < height.size(); j++){
//                int ht = Math.min(height.get(i), height.get(j));
//                int width = j - 1;
//                int currWater = ht * width;
//                maxWater = Math.max(maxWater, currWater);
//            }
//        }
//        return maxWater;
//    }

    // 2 Pointer Approach       -          O(n)
//    public static int storeWater(ArrayList<Integer> height){
//        int maxWater = 0;
//        int lp = 0;
//        int rp = height.size() - 1;
//
//        while (lp < rp){
//            // Calculate Water area
//            int ht = Math.min(height.get(lp), height.get(rp));
//            int width = rp - lp;
//            int currWater = ht * width;
//            maxWater = Math.max(maxWater, currWater);
//
//            // Update ptr
//            if (height.get(lp) < height.get(rp)){
//                lp++;
//            }else {
//                rp--;
//            }
//        }
//        return maxWater;
//    }

    // Brute Force Approach   -    O(n^2)
//    public static boolean pairSum1(ArrayList <Integer> list, int target){
//        for (int i =0; i < list.size(); i++){
//            for (int j = i |= 1; j < list.size(); j++){
//                if (list.get(i) + list.get(j) == target){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    // 2 Pointer Approach
//    public static boolean pairSum1(ArrayList <Integer> list, int target){
//        int lp = 0;
//        int rp = list.size() - 1;
//        while (lp != rp){
//            // Case 1 :
//            if (list.get(lp) + list.get(rp) == target){
//                return true;
//            }
//            // Case 2 :
//            if (list.get(lp) + list.get(rp) < target){
//                lp++;
//            }
//            // Case 3 :
//            else {
//                rp--;
//            }
//        }
//        return false;
//    }

    // 2 Pointer Approach
    public static boolean printSum2(ArrayList<Integer> list, int target){
        int bp = -1;
        int n  = list.size();
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) > list.get(i + 1)){     // Breaking Point
                bp = i;
                break;
            }
        }
        int lp = bp + 1;   // Smallest
        int rp = bp;       // Largest
        while (lp != rp){
            // Case 1 :
            if (list.get(lp) + list.get(rp) == target){
                return true;
            }
            // Case 2 :
            if (list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % n;
            }
            else {
                // Case 3 :
                rp = (n + rp - 1) % n ;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        ArrayList <Integer> List1 = new ArrayList<>();   // List1 is Object name of Integer class
//        ArrayList <String> List2 = new ArrayList<>();
//        ArrayList <Boolean> List3 = new ArrayList<>();

        // Add Element   -   O(1)
//        List1.add(1);
//        List1.add(2);
//        List1.add(3);
//        List1.add(4);
//        List1.add(5);

//        System.out.println(List1.size());

        // Print the ArrayList
//        for (int i = 0; i < List1.size(); i++){
//            System.out.print(List1.get(i) + " ");
//        }
//        System.out.println();

//        List1.add(1, 10);    -   O(n)
//        System.out.println(List1);

        // Get Operation   -   O(1)
//        int element = List1.get(2);    // Get Element of Index 2
//        System.out.println(element);

        // Remove Element   -   O(n)
//        List1.remove(2);
//        System.out.println(List1);

         // Set Element at Index
//        List1.set(2, 10);
//        System.out.println(List1);

        // Contains
//        System.out.println(List1.contains(1));
//        System.out.println(List1.contains(10));
//        System.out.println(List1.contains(12));

//        ArrayList <Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

        // Reverse Print    -   O(n)
//        for (int i = list.size() - 1; i >= 0; i--){
//            System.out.print(list.get(i) + " ");
//        }
//        System.out.println();

        // Fnd Maximum in an ArrayList      -      O(n)
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < list.size(); i++){
//            // 1st Approach
//           if (max < list.get(i)){
//                max = list.get(i);
//            }
//
//            // 2nd Approach
//            max = Math.max(max, list.get(i));
//        }
//        System.out.println("Max element : " + max);

        // Swap Two numbers
//        ArrayList <Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(29);
//        list.add(32);
//        list.add(45);
//        list.add(56);
//        int idx1 = 1, idx2 = 3;
//        System.out.println(list);
//        swap(list, idx1, idx2);
//        System.out.println(list);

        // Soring in ArrayList
//        ArrayList <Integer> list = new ArrayList<>();
//        list.add(11);
//        list.add(29);
//        list.add(32);
//        list.add(45);
//        list.add(56);
//
//        System.out.println(list);
//        Collections.sort(list);     // For Ascending Order
//        System.out.println(list);
//
//        Collections.sort(list, Collections.reverseOrder());     // Descending
//        System.out.println(list);

        // MultiDimensional Array
//        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        mainList.add(list);
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(2);
//        list2.add(3);
//        mainList.add(list2);
//
//
//        for (int i = 0; i < mainList.size(); i++){
//            ArrayList<Integer> currentList = mainList.get(i);
//            for (int j = 0; j < currentList.size(); j++){
//                System.out.print(currentList.get(j) + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println(mainList);

        // list1 : 1 2 3 4 5
        // list2 : 2 4 6 8 10
        // list3 : 3 6 9 12 15
//        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>();
//
//        for (int i = 1; i <= 5; i++){
//            list1.add(i * 1); // 1 2 3 4 5
//            list2.add(i * 2); // 2 4 6 8 10
//            list3.add(i * 3); // 3 6 9 12 15
//        }
//
//        mainList.add(list1);
//        mainList.add(list2);
//        mainList.add(list3);
//
//        System.out.println(mainList);
//
//        for (int i = 0; i < mainList.size(); i++){
//            ArrayList<Integer> currentList = mainList.get(i);
//            for (int j = 0; j < currentList.size(); j++){
//                System.out.print(currentList.get(j) + " ");
//            }
//            System.out.println();
//        }

        // Container with Most Water
//        ArrayList<Integer> height = new ArrayList<>();
        // 1, 8, 6 2, 5, 4, 8, 3, 7
//
//        height.add(1);
//        height.add(8);
//        height.add(6);
//        height.add(2);
//        height.add(5);
//        height.add(4);
//        height.add(8);
//        height.add(3);
//        height.add(7);
//
//        System.out.println(storeWater(height));

        // Pair Sum - 1
        // Find if any Pair in a Sorted ArrayList has a target sum
        // List = [1, 2, 3, 4, 5, 6], target = 5;
//        ArrayList<Integer> list = new ArrayList<>();
//        // 1, 2, 3, 4, 5, 6
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//
//        int target = 5;
//        System.out.println(pairSum1(list, target));

        // Pair Sum - 2
        // Find if any Pair in a Sorted and Rotated ArrayList has a target Sum.
        // list = [11, 15, 6, 8, 9, 10], target = 16
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        System.out.println(printSum2(list, target));
       }
    }
