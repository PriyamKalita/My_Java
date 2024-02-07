package BasicsOfProgramming;

import java.util.Scanner;
import  java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)  throws  Exception {
//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        printDecreasing(n);
//    }
//    public  static  void printDecreasing(int n) {
//        if(n==0){
//            return;
//        }
//        System.out.println(n);
//        printDecreasing(n - 1);


//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        printIncreaing(n);
//
//        }
//    public  static  void printIncreaing(int n) {
//        if (n==0){
//            return;
//        }
//
//        printIncreaing(n-1);
//        System.out.println(n);


//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        printID(n);
//
//    }
//    public static  void  printID(int n){
//        if (n == 0){
//            return;
//        }
//        System.out.println(n);
//        printID(n-1);
//        System.out.println(n);


//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int f = factorial(n);
//        System.out.println(f);
//    }
//    public static  int factorial(int n){
//        if (n == 1){
//            return 1;
//        }
//        int fnm1 = factorial(n - 1);
//        int fn = n * fnm1;
//        return fn;


//        Scanner scn = new Scanner(System.in);
//        int x = scn.nextInt();
//        int n = scn.nextInt();
//        int xn = power(x, n);
//        System.out.println(xn);
//
//
//    }
//    public static  int power(int x, int n){
//        if (n ==0){
//            return 1;
//        }
//        int xnm1 = power(x, n -1);
//        int xn = x * xnm1;
//        return xn;


//        Scanner scn = new Scanner(System.in);
//        int x = scn.nextInt();
//        int n = scn.nextInt();
//        int xn = power(x, n);
//
//
//        System.out.println(xn);
//
//    }
//    public static  int power(int x, int n){
//        if (n == 0){
//            return 1;
//        }
//        int xpnb2 = power(x, n/2);
//        int xn = xpnb2 *xpnb2;
//        if (n%2 ==1){
//            xn = xn * x;
//        }
//        return xn;


//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        pzz(n);
//    }
//    public  static  void pzz(int n){
//        if (n == 0){
//            return;
//        }
//        System.out.println("pre" + n);
//        pzz(n - 1);
//        System.out.println("In" + n);
//        pzz(n - 1);
//        System.out.println("Post" + n);


//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int t1d = scn.nextInt();
//        int t2d = scn.nextInt();
//        int t3d = scn.nextInt();
//        toh(n, t1d, t2d, t3d);
//    }
//    public static  void toh(int n, int t1id, int t2id, int t3id){
//        if (n == 0){
//            return;
//        }
//        toh(n - 1, t1id,  t3id, t2id);
//        System.out.println((n + "[" + t1id + " -> " + t2id + "]"));
//        toh(n - 1, t3id, t2id, t1id);


//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scn.nextInt();
//        }
//        displayArr(arr, 0);
//    }
//    public static void displayArr(int[] arr, int idx){
//        if(idx == arr.length){
//            return;
//        }
//        System.out.println(arr[idx]);
//        displayArr(arr, idx + 1);


//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scn.nextInt();
//        }
//        displayArrReverse(arr, 0);
//    }
//    public static void displayArrReverse(int[] arr, int idx){
//        if(idx == arr.length){
//            return;
//        }
//        displayArrReverse(arr, idx + 1);
//        System.out.println(arr[idx]);


//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scn.nextInt();
//        }
//        int max= maxofArray(arr, 0);
//        System.out.println(max);
//    }
//    public static int maxofArray(int[] arr, int idx){
//        if(idx == arr.length - 1){
//            return arr[idx];
//        }
//        int misa = maxofArray(arr, idx + 1);
//        if (misa > arr[idx]){
//            return misa;
//        }
//        else {
//            return  arr[idx];
//        }



//        Scanner scn = new Scanner((System.in));
//        int n = scn.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scn.nextInt();
//        }
//
//        int d = scn.nextInt();
//        int f1 = firstIndex(arr, 0, d);
//        System.out.println(f1);
//    }
//    public static int firstIndex(int[] arr, int idx, int x){
//        if (idx == arr.length){
//            return -1;
//        }
//        if (arr[idx] ==x){
//            return idx;
//        }
//        else {
//            int fisa = firstIndex(arr, idx + 1, x);
//            return fisa;
//        }










    }
}
