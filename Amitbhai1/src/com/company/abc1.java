package com.company;

import java.util.Scanner;

public class abc1 {
    public static void main(String[] args) {

// (1)   Write a program to sum three numbers in java
        int a = 3;
        int b = 5;
        int c = 17;
        int sum = a+ b + c;
        System.out.println(sum);



// (2)  Write a program to calculate CGPA using marks of three subjects ( OUT OF 100)
        float subject1 = 70;
        float subject2 = 75;
        float subject3 = 78;
        float CGPA = (subject1 + subject2 + subject3)/30;
        System.out.println(CGPA);



// (3)  Write a java program which asks the user to enter his name and greets them with "Hell <name>, have a good day " text
        System.out.println("what is your name");
        Scanner sc = new Scanner(System.in );
        String name = sc.next();
//        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a good day !");




// (4)  Write a java program to correct kilometers to miles



// (5)  Write a java program to detect whether a number enter by the user is integer of not
        System.out.println("Enter your number");
        Scanner sc1 = new Scanner(System.in );
        System.out.println(sc.hasNextInt());



    }
}


