package com;

public class Insertion_Sort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++){
            int current = arr[i];
            int previous = i - 1;
            // Finding out the correct pos to insert
            while (previous >= 0 && current < arr[previous]   ){
                arr[previous + 1] = arr[previous];
                previous--;
            }
            // Insertion
            arr[previous + 1] = current;
        }
    }
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);
    }
}
