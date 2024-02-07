package com;

import java.util.Scanner;

// Passing arrays as Argument
public class Array {
    public static void update(int marks[], int a) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        a = 10;
        return;
    }
    public static void main(String[] args) {
//        int marks[] = new int[100];
//
//        Scanner sc = new Scanner(System.in);
//        marks[0] = sc.nextInt();
//        marks[1] = sc.nextInt();
//        marks[2] = sc.nextInt();
//
//        System.out.println("Physics Marks : " + marks[0]);
//        System.out.println("Chemistry Marks : " + marks[1]);
//        System.out.println("Mathematics Marks : " + marks[2]);
//
//        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//        System.out.println("Percentage : " + percentage + "%");
//
//        System.out.println("Length of Array : " + marks.length);

        int marks[] = {97, 98, 99};
        int x = 5;
        update(marks, x);
        System.out.println(x);

        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}
