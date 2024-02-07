package com;

public class Array_Binary_Search {
    public static int binarySearch(int number[] , int key){
        int start = 0;
        int end = number.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            // Comparison
            if (number[mid] == key)  // Found
            {
                return mid;
            }
            if (number[mid] < key) // Search Right side of array
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1; // Search Left side of array
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        int Bs = binarySearch(number, key);
        System.out.println("Index for key is : " + Bs);
    }
}
