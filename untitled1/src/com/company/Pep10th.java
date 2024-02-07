package com.company;
import  java.io.*;
import  java.util.*;

public class Pep10th {

    public  static  void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr [];
         arr = new int[5];
          arr[0] = 33;
          arr[1] = 53;
          arr[2] = 43;
          arr[3] = 93;
          arr[4] = 73;

          swap(arr, 0, 4);

          for(int i = 0; i< arr.length; i++){
              System.out.println(arr[i]);
          }
    }
}
