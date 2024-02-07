package com.company;

import java.util.Scanner;

public class Bit_Manipulation {
    public static void main(String[] args) {
        /*
        // (1) Get Bit
        int n = 5;
        int position = 3;
        int bitMark = 1 << position;

        if ((bitMark & n) == 0){
            System.out.println("Bit was 0");
        }
        else {
            System.out.println("Bit was 1");
        }
       */

        /*
        // (2) Set Bit
        int n = 5;
        int position = 1;
        int bitMask = 1 << position;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
        */

        /*
        // (3) Clear Bit
        int n = 5;
        int position = 2;
        int bitMask = 1 << position;
        int notBitMask = ~(bitMask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
        */

        /*
        // (4) Update Bit
        Scanner sc= new Scanner(System.in);
        int operation = sc.nextInt();
        int n = 5;
        int position = 1;
        int bitMask = 1 << position;

        if (operation == 1){
            // Set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else {
            // Clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
        */

    }
}
