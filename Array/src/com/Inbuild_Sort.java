package com;


import java.util.Arrays;  // (i)

import java.util.Collections;

public class Inbuild_Sort {
//        public static void InbuildSort(int arr[]) {
//            for (int i = 1; i < arr.length; i++){
//                int current = arr[i];
//                int previous = i - 1;
//                // Finding out the correct pos to insert
//                while (previous >= 0 && arr[previous] > current){
//                    arr[previous + 1] = arr[previous];
//                    previous--;
//                }
//                // Insertion
//                arr[previous + 1] = current;
//            }
//        }
        public static void InbuildSort(Integer arr[]) {
            for (int i = 1; i < arr.length; i++){
                int current = arr[i];
                int previous = i - 1;
                // Finding out the correct pos to insert
                while (previous >= 0 && arr[previous] > current){
                    arr[previous + 1] = arr[previous];
                    previous--;
                }
                // Insertion
                arr[previous + 1] = current;
            }
        }
//        public static void printArr(int arr[]) {
//            for (int i = 0; i < arr.length; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        }
        public static void printArr(Integer arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Integer arr[] = {5, 4, 1, 3, 2}; // This array is Object of Integer class
            Arrays.sort(arr, 0, 3, Collections.reverseOrder()); // (ii)
            printArr(arr);

        }
    }


