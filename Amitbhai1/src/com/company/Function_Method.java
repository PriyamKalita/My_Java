package com.company;

import java.util.Scanner;

public class Function_Method {

//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }

//    public static int calculateSum(int a, int b){
//        int sum = a + b;
//        return sum;
//    }

//    public static  int calculateProduct(int a, int b){
//        return a * b;
//    }

    public static void printFactorial(int n){
        if (n < 0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//
//        printMyName(name); // Call kiya Function ko

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        int sum = calculateSum(a, b);
//        System.out.println(sum);

        //System.out.println("Product is : " + calculateProduct(a, b));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFactorial(n);
    }
}
