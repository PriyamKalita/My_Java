package com.company;

import java.util.Scanner;

public class Handling_Specific_Exceptions {
    public static void main(String[] args) {
        int [] marks = new int [3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter The Array Index ");
        int ind = sc.nextInt();

        System.out.println(" Enter The Number You Want To Divide The Value with ");
        int number = sc.nextInt();

        try {
            System.out.println("The value at array index entered is : " + marks[ind]);
            System.out.println("The value of array_value/number is : " + marks[ind]/number);
           }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred");
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
            System.out.println(e);
        }

        catch (Exception e) {
            System.out.println("Some Exception occurred");
            System.out.println(e);
        }

    }
}
