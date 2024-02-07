package com.company;
import java.util.Scanner;
public class abc5 {
    public static void main(String[] args) {

        // (1) What will be the result of the following expression float a = 7/4 * 9/2
/*        float a = 7/4.0f*9/2.0f;
        System.out.println(a);    */



        // (2) Write a java program to encrypt a grade by adding 8 to it. decrypt it to show the correct grade
/*        char grade = 'b';
        grade = (char)(grade +8);
        System.out.println(grade);

        //DECRYPTING THE GRADE
        grade = (char)(grade - 8);
        System.out.println(grade);    */



        // (3) Use comparison operators to find out whether a giver number is greater than the user intered number or not
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);



    }
}


