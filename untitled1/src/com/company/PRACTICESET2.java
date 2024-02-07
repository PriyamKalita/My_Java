package com.company;

import java.util.Scanner;

public class PRACTICESET2 {
    public static void main(String[] args) {

        // WHAT WILL BE THE RESULT OF THE FOLLOWING EXPRESION float a = 7/4*9/2;
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        // WRITE A JAVA PROGRAM TO ENCRYPT A GRADE BY ADDING 8 TO IT . DECRYPT IT TO SHOW THE CURRECT GRADE
        char grade = 'b';
        grade = (char)(grade + 8);
        System.out.println(grade);

        grade = (char)(grade - 8);
        System.out.println(grade); // Decrypting the grade

        // user comparision opaerators to find out whether a given number is greater than the user entered number or not
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        System.out.println(a1>8);

    }
}


