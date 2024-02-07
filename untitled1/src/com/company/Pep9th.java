package com.company;

public class Pep9th {
    public static void main(String[] args) {

        int [] arr;   // array decleretion
        arr = new int [5];    // space alocation
        arr[0] = 33;
        arr[1] = 53;
        arr[2] = 73;    // value ashing
        arr[3] = 93;
        arr[4] = 63;

        System.out.println(arr.length);
        System.out.println(arr [3]);

        System.out.println("\n");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
