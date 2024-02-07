package com.company;

public class PRECTICESET7{

    // (1)
//    static void  multiplication(int n){
//        for(int i =1; i<=10; i++){
//            System.out.format("%d X %d = %d\n", n , i,  n*i);
//        }
//   }

    // (2)
//    static  void pattern1(int n){
//        for(int i = 0; i<n; i++){
//            for (int j = 0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    // (3)
//    static int sumRec(int n){
//        if (n == 1) {
//
//            return  1;
//        }
//        return  n + sumRec(n-1);
//    }

    // (4)
//    static int fib(int n){
//        if(n==1){
//            return  0;
//        }
//        else  if(n==2){
//            return  1;
//        }
//        else {
//            return  fib(n-1) + fib(n-2);
//        }
//    }

    // (5)
    static  void pattern1_rec(int n) {
        if(n>0){
            pattern1_rec(n-1);

            for (int i = 0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();

        }
    }


    

    public static void main(String[] args) {
        // (1) Write a java method to print multiplication table of a number n
//        multiplication(7);



        // (2) Write a program using function to print the following pattern
        // *
        // * *
        // * * *
        // * * * *

        // method 1
//        System.out.println("*");
//        System.out.println("* *");
//        System.out.println("* * *");
//        System.out.println("* * * *");

        // method 2
        //pattern1(4);



        // (3) Write a recursive function to calculate sum of first n natural numbers
//        int c = sumRec(3);
//        System.out.println(c);



        // (4) Write a function to print nth term of fibonacci series using recursion
//        int result = fib(5);
//        System.out.println(result);



        // (5) QUESTION NO.2 (USING RECURSION)
        pattern1_rec(4);
    }
}
