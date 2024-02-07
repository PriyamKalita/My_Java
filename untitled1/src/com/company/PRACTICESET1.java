package com.company;

import java.util.Scanner;

public class PRACTICESET1 {
    public static void main(String[] args) {
        /*
        // write a program to sum three numbers in java
        int a = 5;
        int b = 7;
        int c = 9;
        int sum = a + b + c;
        System.out.println(sum);

        // write a program to calculate CGPA using marks of three subject (out of 100)
        float subject1 = 45;
        float subject2 = 65;
        float subject3 = 75;
        float CGPA = (subject1 + subject2 + subject3)/30;
        System.out.println(CGPA);

        // write a java program to which as the use to enter his \her name and greets them with "Hello <name> have a good day" text
        System.out.println("what is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day");

        // write a java program to detect whether a number entered by the user is interger or not
        System.out.println("Enter your number");
        Scanner sc1 = new Scanner(System.in);
        System.out.println(sc1.hasNextInt());
*/

        //KM To Miles Convertor
        Scanner sc = new Scanner(System.in);

        System.out.print("KM is : ");
        float a = sc.nextFloat();

        float b = (0.62137f * a);
        System.out.println(b);

    }
}
