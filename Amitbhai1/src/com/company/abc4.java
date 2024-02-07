package com.company;
import java.util.Scanner;

public class abc4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR PHYSICS MARKS : ");
        int PHYSICS = scan.nextInt();

        System.out.println("ENTER YOUR ENGLISH MARKS : ");
        int ENGLISH = scan.nextInt();

        System.out.println("ENTER YOUR CHEMISTRY MARKS : ");
        int CHEMISTRY = scan.nextInt();

        System.out.println("ENTER YOUR MATHEMATICS MARKS : ");
        int MATHEMATICS = scan.nextInt();

        System.out.println("ENTER YOUR CSE MARKS : ");
        int CSE = scan.nextInt();

        float percentage = ((PHYSICS + ENGLISH + CHEMISTRY + MATHEMATICS + CSE )/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);



    }
}
