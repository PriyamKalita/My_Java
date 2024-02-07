package com.company;

import  java.util.Scanner;
public class PRACTICESET4 {
    public static void main(String[] args) {

        // Write a program to find out whether a student is pass or fail ; if it requires total 40% and at least 33% in each
        // subject to pass .Assume 3 subjects and take marks as an input from the user
//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in physics");
//        m1 = sc.nextByte();
//        System.out.println("Enter your marks in Chemistry");
//        m2 = sc.nextByte();
//        System.out.println("Enter your marks in Mathematics");
//        m3 = sc.nextByte();
//
//        float avg = (m1 + m2 + m3)/3.0f;
//        //System.out.println(" your avg. parcentage is :" + avg);
//
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("You Have Been Promoted");
//        }
//        else {
//            System.out.println("You Have Been Promoted");
//        }
//
//        System.out.println(" your avg. parcentage is :" + avg);



        // Calculate income tax paid by an emplyee to the goveroment as per the slates mentioned below ;
        //   INCOME SLAB                TAX
        //   2.5L ----- 5.0L            5%
        //   5.0L ----- 10.0L           20%
        //   ABOVE      10.0L           30%
        // Note that there is no tax below 2.5l . Take imput amount as an input from the user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in Lakhsa per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax  = tax + 0.05f*(income - 2.5f);
//        }
//        else if(income >5f && income <=10.0f){
//            tax  = tax + 0.05f*(5.0f - 2.5f);
//            tax  = tax + 0.2f*(income - 5f);
//        }
//        else if (income>10.0f){
//            tax  = tax + 0.05f*(5.0f - 2.5f);
//            tax  = tax + 0.2f*(10.0f - 2.5f);
//            tax  = tax + 0.3f*(income - 10.0f);
//        }
//        System.out.println("the total tax paid by the employee is : " + tax);



        // Write a java program to find out  the day of the weak give the number [ 1 for mon day 2 for tuesday ........and 50 on!
//        Scanner sc = new Scanner((System.in));
//        int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuseday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }



        // Write a program to find out the type of website from the URL
        // .com ---->   commercial website
        // .org ---->   organigation website
        // .in ----.    indian website
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("this is organizatinal webside");
    }
        else if (website.endsWith(".com")){
            System.out.println("this is commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("this is indian website");
        }

    }
}


