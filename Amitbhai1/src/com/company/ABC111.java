package com.company;
import java.util.Scanner;

public class ABC111 {
    public static void main(String[] args) {



        // Question 1:Write a program to find out whether a student is pass or fail ; if it requires total 40% and atleast
        //            33% in each sbuject to pass .Assume 3 subjects and take marks as an input from the user ?

//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        m1 = sc.nextByte();
//
//        System.out.println("Enter your marks in Chemistry");
//        m2= sc.nextByte();
//
//        System.out.println("Enter your marks in Mathematics");
//        m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your Overall percentage is: " + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, You have been promoted");
//        }
//        else{
//            System.out.println("Sorry, You have not been promoted! Please try again.");
//        }



        // Question 2: Calculate income tax paid by an empyee to the goverment as per the slabs mentioned below:
        //             INCOME TAX                        TAX
        //             2.5L-5.0L                          5%
        //             5.0L-10.0L                         20%
        //             Above 10.0L                        30%
        //             Note that there is no tax below 2.5L.Take input amount as an input from the user ?

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is: " + tax);



        // Question 3: Write a java program to find out the day of the week given the number [ 1 for Monday, 2 for Tuesday ......
        //            and so on !

//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("MONDAY");
//            case 2 -> System.out.println("TUESDAY");
//            case 3 -> System.out.println("WEDNESDAY");
//            case 4 -> System.out.println("THURSDAY");
//            case 5 -> System.out.println("FRIDAY");
//            case 6 -> System.out.println("SATURDAY");
//            case 7 -> System.out.println("SUNDAY");
//        }



        // Question 4:Write a program to find out the type of wabsite  from the URL
        //                .com ---> commertial wabsite
        //                .org ---> organigation wabside
        //                .in --->  indian wabsite

//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if(website.endsWith(".org")){
//            System.out.println("This is an organizational website");
//        }
//        else if(website.endsWith(".com")){
//            System.out.println("This is a Commercial website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian website");
//        }



    }
}


