package com.company;

import java.util.*;
public class abc {
    public static void main(String[] args) {
        /*
        // OUTPUT
        System.out.println("Hello World");
        // VARIABLE
        String name = "Tonny stark ";
        int age = 48;
        double price = 25.25;
        int a = 25;
        int b = 10;
        int sum = a + b;
        System.out.println(sum);

        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        System.out.println(name1);
        */

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = a + b;
//        System.out.println(sum);

        Scanner sc = new Scanner(System.in);

//        int age = sc.nextInt();
//
//        if (age > 18)
//        {
//            System.out.println("Adult");
//        }
//        else
//        {
//            System.out.println("Not Adult");
//        }

//        int x = sc.nextInt();
//        if (x % 2 == 0)
//        {
//            System.out.println("Even");
//        }
//        else
//        {
//            System.out.println("Odd");
//        }

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if (a == b)
//        {
//            System.out.println("Equal");
//        }
//        else if (a > b)
//        {
//            System.out.println("a is greater");
//        }
//        else
//        {
//            System.out.println("a is lesser");
//        }

//        int button = sc.nextInt();
//
//        switch (button)
//        {
//            case 1 :
//                System.out.println("Hello");
//                break;
//
//            case 2 :
//                System.out.println("Namaste");
//                break;
//
//            case 3 :
//                System.out.println("Bonjour");
//                break;
//
//            default:
//                System.out.println("Invalid Button");
//                break;
//        }

//        for (int counter = 0; counter < 3; counter = counter + 1)
//        {
//            System.out.println(counter);
//        }

        int n = sc.nextInt();
//        for (int i = 1; i < 11; i++)
//        {
//            System.out.println(i + " * " + n + " = " +  i * n);
//        }

        int sum = 0;
        for (int i = 0; i <= n; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
