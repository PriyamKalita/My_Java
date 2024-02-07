package com;
import java.util.*;
public class Array_Linear_Search_Question {
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;  // - Infinity
        int smallest = Integer.MAX_VALUE;  // + Infinity

        for(int i = 0; i < number.length; i++) {
            if (largest < number[i])
            {
                largest = number[i];
            }
            if (smallest > number[i])
            {
                smallest = number[i];
            }
        }
        System.out.println("The Smallest number is : " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        // Largest Number - Find The Largest number in a given Array { 1, 2, 6, 3, 5}
        int number[] = {1, 2, 6, 3, 5};
        int ln = getLargest(number);
        System.out.println("The Largest Number is : " + ln);
    }
}
