package com.company;

import java.util.Scanner;

public class EXERCISE1{

    public static void main(String[] args) {
        // Write a program to claculate percentage of a given student in CBSE board . His mark from 5 subject must be taken as input from the keyboard (marks are out of 100)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your physics marks : ");
        int physics = sc.nextInt();
        System.out.println("Enter your english marks : ");
        int englist = sc.nextInt();
        System.out.println("Enter your chemistry marks : ");
        int chemistry = sc.nextInt();
        System.out.println("Enter your mathematics marks : ");
        int mathematics = sc.nextInt();
        System.out.println("Enter your IT marks : ");
        int IT = sc.nextInt();

        float percentage = ((physics + englist + chemistry + mathematics + IT)/500.0f)*100;
        System.out.println("PERCENTAGE : ");
        System.out.println(percentage );
    }
}
