package com;

import java.util.Scanner;

public class FunctionAndMethodQuestion {
    //                  (1)
//    public static float avgofThree(float a, float b, float c){
//        float avg = (a + b + c)/ 3;
//
//        return avg;
//    }

    //                  (2)
//    public static boolean isEven(int x) {
//        if (x % 2 == 0) {
//            return true;
//        }
//        else{
//                return false;
//            }
//
//        }

    //                (3)
//    public static boolean Palindrone(int number){
//        int palindro = number;
//        int reverse = 0;
//
//        while (palindro != 0){
//            int rem = palindro % 10;
//            reverse = (reverse * 10) + rem;
//            palindro = palindro / 10;
//        }
//        if (number == reverse)
//        {
//            return true;
//        }
//        else
//            {
//            return false;
//        }
//    }

    //                  (4)
    public static int sumDigit(int disum){
        int num = disum;
        int sumofdigit = 0;
        while (disum > 0){
            int rem = disum % 10;
            sumofdigit = sumofdigit + rem;
            disum = disum / 10;
        }
        return sumofdigit;
    }
        public static void main(String[] args) {
            // Question No. (1) : Write a java method to compute the average of Three Numbers
//        Scanner sc = new Scanner(System.in);
//        float num1 = sc.nextFloat();
//        float num2 = sc.nextFloat();
//        float num3 = sc.nextFloat();
//        float avg = avgofThree(num1, num2, num3);
//        System.out.println(avg);

            // Question No. (2) : Write a method named isEven that accepts an int argument.
            //                  The method should return if the argument is even , or false
            //                  otherwise. Also write a program to test your method
//            Scanner sc = new Scanner(System.in);
//            int num = sc.nextInt();
            // (i)
//            if (isEven(num)){
//                System.out.println("Number is Even");
//            }
//            else {
//                System.out.println("Number is Odd");
//            }
            // (ii)
//            boolean even = isEven(num);
//            System.out.println(even);

            // Question No. (3) : Write a java program to check if Number is Palindrome in java?
            //                    A number is called a Palindrome if number is equal to reverse
            //                    of a number.
            //                    121 Is a Palindrome because the  reverse of 121 is 121 itself.
            //                    321 Is a not Palindrome because the  reverse of 321 is 123 itself.
            //                    321 is not equal to 123.
//            Scanner sc = new Scanner(System.in);
//            int number = sc.nextInt();
            //      (i)
//            boolean pal = Palindrone(number);
//            System.out.println(pal);
            //      (ii)
//            if (Palindrone(number)){
//                System.out.println("Number is Palindrone");
//            }
//            else {
//                System.out.println("Number is not Palindrone");
//            }

            // Question No. (4) : Write a java Method to compute the sum of the digits in an integer
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int n = sc.nextInt();
            int x = sumDigit(n);
            System.out.println("Sum of digit : " + x);

        }
    }
