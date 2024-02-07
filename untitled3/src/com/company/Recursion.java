//package com.company;
//
//import java.util.*;
//import java.util.Scanner;
//
//public class Recursion {
//    public static void main(String[] args) {
//

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        printdecreasing(n);
//    }
//
//    public static void printdecreasing(int n){
//        if (n == 0){
//            return;
//        }
//        System.out.println(n);
//        printdecreasing(n - 1);



//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        printincreasing(n);
//    }
//
//    public static void printincreasing(int n ){
//        if (n == 0){
//            return;
//        }
//        printincreasing(n - 1);
//        System.out.println(n);



//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        printdI(n);
//
//    }
//
//    public static void printdI(int n){
//        if (n == 0){
//            return ;
//        }
//        System.out.println(n);
//        printdI(n - 1);
//        System.out.println(n);



//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int f = factorial(n);
//        System.out.println(f);
//    }
//    public static  int factorial(int n){
//        int fnm1 = factorial(n - 1);
//        int fn = n * fnm1;
//        return fn;



//        Scanner scn = new Scanner(System.in);
//        int x = scn.nextInt();
//        int n = scn.nextInt();
//        int xn = power(x, n);
//        System.out.println(xn);
//    }
//    public static int power(int x, int n){
//        if (n ==0){
//            return 1;
//        }
//        int xnm1 = power(x, n - 1);
//        int xn = x * xnm1;
//        return xn;



//        Scanner scn = new Scanner(System.in);
//        int x = scn.nextInt();
//        int n = scn.nextInt();
//        int xn = power(x, n);
//        System.out.println(xn);
//    }
//    public static int power(int x, int n) {
//        if (n == 0){
//            return 1;
//        }
//
//        int xpnb2 = power(x, n / 2);
//        int xn = xpnb2 * xpnb2;
//
//        if (n % 2 == 1) {
//            xn = xn * x;
//        }
//        return xn;



//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        pzz(n);
//    }
//    public static  void pzz(int n){
//        if (n == 0){
//            return;
//        }
//        System.out.println("pre" + n);
//        pzz(n - 1);
//        System.out.println("In" + n);
//        pzz(n - 1);
//        System.out.println("post" + n);



//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int t1d = scn.nextInt();
//        int t2d = scn.nextInt();
//        int t3d = scn.nextInt();
//        toh(n, t1d, t2d, t3d);
//    }
//    public static void toh(int n, int t1id, int t2id, int t3id){
//        if (n == 0){
//            return;
//        }
//        toh(n - 1, t1id, t3id, t2id);
//        System.out.println(n + "[" + t1id + " -> " + t2id + "]");
//        toh(n - 1, t3id, t2id, t1id);



//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int [] arr = new int [n];
//        for (int i = 0; i< arr.length; i++){
//            arr[i] = scn.nextInt();
//        }
//        displayArr(arr, 0);
//    }
//    public static void displayArr(int[] arr, int idx){
//        if (idx == arr.length){
//            return;
//        }
//        System.out.println(arr[idx]);
//        displayArr(arr, idx + 1);



//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int [] arr = new int [n];
//        for (int i = 0; i< arr.length; i++){
//            arr[i] = scn.nextInt();
//        }
//        displayArrReverse(arr, 0);
//    }
//    public static void displayArrReverse(int[] arr, int idx){
//        if (idx == arr.length){
//            return;
//        }
//        displayArrReverse(arr, idx + 1);
//        System.out.println(arr[idx]);



//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int [] arr = new int [n];
//        for (int i = 0; i<arr.length; i++){
//            arr[i] = scn.nextInt();
//        }
//        int max = maxofArray(arr, 0);
//        System.out.println(max);
//    }
//    public static int maxofArray(int [] arr, int idx){
//        if (idx == arr.length - 1){
//            return arr[idx];
//        }
//        int misa = maxofArray(arr, idx + 1);
//        if (misa > arr[idx]){
//            return misa;
//        }
//        else {
//            return arr[idx];
//        }



//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int [] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = scn.nextInt();
//        }
//        int d = scn.nextInt();
//        int fi = firstIndex(arr, 0, d);
//        System.out.println(fi);
//    }
//    public static int firstIndex(int[] arr, int idx, int x){
//        if (idx == arr.length){
//            return -1;
//        }
//        if (arr[idx] == x){
//            return idx;
//        }
//        else {
//            int fiisa = firstIndex(arr, idx + 1, x);
//            return fiisa;
//        }



//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scn.nextInt();
//        }
//        int x = scn.nextInt();
//        int li = lastIndex(arr, 0, x);
//        System.out.println(li);
//    }
//
//    public static int lastIndex(int[] arr, int idx, int x) {
//        if (idx == arr.length) {
//            return -1;
//        }
//        int liisa = lastIndex(arr, idx + 1, x);
//        if (liisa == -1) {
//            if (arr[idx] == x) {
//                return idx;
//            } else {
//                return -1;
//            }
//        } else {
//            return liisa;
//        }



//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = scn.nextInt();
//        }
//        int x = scn.nextInt();
//        int[] iarr = allIndices(arr, x, 0, 0);
//
//        if (arr.length == 0) {
//            System.out.println();
//            return;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//    }
//
//    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
//        if (idx == arr.length) {
//            return new int[fsf];
//        }
//
//        int[] iarr;
//
//        if (arr[idx] == x) {
//            iarr = allIndices(arr, x, idx + 1, fsf + 1);
//            iarr[fsf] = idx;
//        } else {
//            iarr = allIndices(arr, x, idx + 1, fsf);
//        }
//
//        return iarr;



package com.company;

import java.util.*;
import java.util.Scanner;

public class Recursion {
    static int factorial(int n){
        // n! = n * n-1 * n - 2 ........1
        if (n == 0 || n == 1){
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println("The value of factorial n is : " + factorial(n));




    }
}

