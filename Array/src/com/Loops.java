package com;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // While Loop
//        int counter = 0;
//        while (counter < 100){
//            System.out.println("Hello World");
//            counter++;
//        }
//        System.out.println("Loop End");

        // Print number from 1 to 10
//        int counter = 1;
//        while (counter <= 10){
//            System.out.println(counter);
//            counter++;
//        }

        // Print number from 1 to n
//        Scanner sc = new Scanner(System.in);
//        int range =  sc.nextInt();
//        int counter = 1;
//        while (counter <= range){
//            System.out.println(counter);
//            counter++;
//        }

        // Print sum of first n natural numbers
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        int i = 1;
//        while (i <= n){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println("Sum is : " + sum);

        // For Loop
//        for (int i = 0; i <= 10; i++){
//            System.out.println("Hello world");
//        }

        // Print Square Pattern
        // * * * *
        // * * * *
        // * * * *
        // * * * *
//        for (int line = 1; line <= 4; line++){
//            System.out.println(" * * * * ");
//        }

        // Print Reverse of a number
//        int n = 10899;
//        while (n > 0){
//            int lastDigit = n % 10;
//            System.out.print(lastDigit + " ");
//            n = n / 10;
//
//        }
//        System.out.println();

        // Reverse the given Number
//         int n = 10899;
//         int rev = 0;
//         while (n > 0){
//             int lastdigit = n % 10;
//             rev = (rev * 10) + lastdigit;
//             n = n / 10;
//         }
//        System.out.println(rev);

        // Do-While Loop
//        int counter = 1;
//        do{
//            System.out.println("Hello World");
//            counter++;
//        }while (counter <= 10);

        // Print 1 to 5 . Exit when number is 3
//          for (int i = 1; i <=5 ; i++){
//              if (i == 3){
//                  break;
//              }
//              System.out.println(i);
//          }
//          System.out.println("I am out of the Loop");

        // Keep entering numbers till user enters a multiple of 10
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Enter your Number : ");
//            int n = sc.nextInt();
//            if (n % 10 == 0){
//                break;
//            }
//            System.out.println(n);
//        }while (true);

        // Continue Statement
//        for (int i = 1; i <= 5; i++){
//            if (i == 3){
//                continue;
//            }
//            System.out.println(i);
//        }

        // Display all numbers by user except multiples of 10
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Enter your number : ");
//            int n = sc.nextInt();
//            if (n % 10 == 0){
//                continue;
//            }
//            System.out.println("Number Was : " + n);
//        }while (true);

        // Check if a number is Prime or not
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n == 2){
//            System.out.println("n is prime");
//        }
//        boolean isPrime = true;
//        for (int i = 2; i < n - 1; i++){
//             if (n % i == 0){ // n is a Multiple of i ( i is not 1 or n- 1)
//                 isPrime = false;
//             }
//        }
//        if (isPrime == true){
//            System.out.println("number is prime ");
//        }
//        else {
//            System.out.println( "number is not prime ");
//        }

        // Check if a number is Prime or not
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n == 2){
//            System.out.println("n is prime");
//        }
//        boolean isPrime = true;
//        for (int i = 2; i <= Math.sqrt(n) ; i++){ // Math.sqrt(n) = square root n
//            if (n % i == 0){ // n is a Multiple of i ( i is not 1 or n- 1)
//                isPrime = false;
//            }
//        }
//        if (isPrime == true){
//            System.out.println("number is prime ");
//        }
//        else {
//            System.out.println( "number is not prime ");
//        }

        // Question No. 1 :
//        for (int i = 0; i < 5; i++){
//            System.out.println("Hello");
//            i += 2;
//        }

        // Question No. 2 : Write a program that reads a set of integers , and then prints the sum of the even and odd integers
//        Scanner sc = new Scanner(System.in);
//        int evenSum = 0;
//        int oddSum = 0;
//        int digit;
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//        while (n > 0){
//            digit = n % 10;
//            if (digit % 2 == 0){
//                evenSum = evenSum + digit;
//            }
//            else {
//                oddSum = oddSum + digit;
//                n = n / 10;
//            }
//        }

        // Question No. 3 : Write a program to find the Factorial of any number entered by the user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number : ");
//        int num = sc.nextInt();
//        int fact = 1;
//        for (int i = 1; i <= num; i++){
////            fact *= i;
//            fact = fact * i;
//        }
//        System.out.println("Factorial : " + fact);

        // Question No. 4 : Write a program to print the multiplication of a number N , entered by the User
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int n = sc.nextInt();
//        for (int i = 1; i <= 10; i++){
//            System.out.println(n + " * " + i + " = " + i * n);
//        }

        // Question No. 5 :
//        for (int i = 0; i <= 5; i++){
//            System.out.println("i = " + i);
//        }
    }
}
