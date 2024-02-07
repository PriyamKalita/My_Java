package com;

import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        // If-Else Statement
//        int age = 22;
//        if (age >= 18){
//            System.out.println("Adult : Drive , Vote");
//        }
//        if (age > 13 && age < 18){
//            System.out.println("Teenager");
//        }
//        else {
//            System.out.println("Not Adult");
//        }

        // Largest of Two Number
//        int A = 1;
//        int B = 5;
//        if (A >= B){
//            System.out.println("A is largest of 2");
//        }
//        else {
//            System.out.println("B is largest of 2");
//        }

        // Print if a number is ODD or EVEN
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         if (number % 2 == 0){
//             System.out.println("EVEN");
//         }
//         else {
//             System.out.println("ODD");
//         }

//        int age = 13;
//
//        if (age >= 18){
//            System.out.println("Adult");
//        }
//        else if (age >= 13 && age < 18){
//            System.out.println("Teenager");
//        }
//        else {
//            System.out.println("Child");
//        }

        // Income Tax Calculator
//        Scanner sc = new Scanner(System.in);
//        int income = sc.nextInt();
//        int tax;
//        if (income < 500000){
//            tax = 0;
//        }
//        else if (income >= 500000 && income < 1000000){
//            tax = (int)(income * 0.2);
//        }
//        else {
//            tax = (int)(income * 0.3);
//        }
//        System.out.println("Your tax is : " + tax);

        // Print the largest of 3
//        int A = 1, B = 3, C = 6;
//
//        if ((A >= B) && (A >= C)){
//            System.out.println("Largest is A");
//        }
//        else if (B >= C){
//            System.out.println("Largest is B");
//        }
//        else {
//            System.out.println("Largest is C");
//        }

        // Ternary Operator
        // Check if a student will Pass or Fail
//        int marks = 67;
//        String reportCard = (marks >= 33) ? "Pass" : "Fail";
//        System.out.println(reportCard);

        // Switch Statement
//        int number = 2;
//        switch (number){
//            case 1 :
//                System.out.println("Samosa");
//                break;
//            case 2 :
//                System.out.println("Momo");
//                break;
//            case 3 :
//                System.out.println("Mango Shake");
//                break;
//            default:
//                System.out.println("Error");
//                break;
//        }

        // Calculator
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a : ");
//        int a = sc.nextInt();
//        System.out.println("Enter b : ");
//        int b = sc.nextInt();
//        System.out.println("Enter Operator : ");
//        char operator = sc.next().charAt(0);

//        switch (operator){
//            case '+':
//                System.out.println(a + b);
//                break;
//            case '-':
//                System.out.println(a - b);
//                break;
//            case '*':
//                System.out.println(a * b);
//                break;
//            case '/':
//                System.out.println(a / b);
//                break;
//            case '%':
//                System.out.println(a % b);
//                break;
//            default:
//                System.out.println("Wrong Operator");
//        }


        // Question No. 1 : Write a java program to get a number from user and print Whether it is positive or negative
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n > 0){
//            System.out.println("Positive");
//        }
//        else {
//            System.out.println("Negative");
//        }

        // Question No. 2 : Finish the following code so that it prints you have a fever it your Temperature
        //                  is above 100 and otherwise print You don't have fever
//        double temp = 103.5;
//        if (temp > 100){
//            System.out.println("You have fever");
//        }
//        else {
//            System.out.println("You don't have fever");
//        }

        // Question No. 3 : Write a java program to input week number(1 - 7) and print day of week name using switch case
//        Scanner sc = new Scanner(System.in);
//        int week = sc.nextInt();
//        switch (week){
//            case 1 :
//                System.out.println("MonDay");
//                break;
//            case 2 :
//                System.out.println("TuesDay");
//                break;
//            case 3 :
//                System.out.println("Wednesday");
//                break;
//            case 4 :
//                System.out.println("ThursDay");
//                break;
//            case 5 :
//                System.out.println("FriDay");
//                break;
//            case 6 :
//                System.out.println("SaturDay");
//                break;
//            case 7 :
//                System.out.println("SunDay");
//                break;
//            default:
//                System.out.println("Error");
//        }

        // Question No. 4 :
//        int a = 63, b = 36;
//        int y = (a > b) ? a : b;
//        boolean x = (a < b)? true : false;
//        System.out.println(x);
//        System.out.println(y);

        // Question No. 5 : Write a java program that takes a takes a year from the user and print whether that year is a leap year or not
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if (year % 4 == 0){
//            System.out.println("Year is Leap Year");
//        }
//        else {
//            System.out.println("Year is not Leap year");
//        }

    }
}
