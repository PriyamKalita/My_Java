package com.company;

import java.util.Scanner;

public class Two_D_Array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int columns = sc.nextInt();

//        int [] [] numbers = new int[row][columns];
//
//        for (int i = 0; i < row; i++){
//            for (int j = 0; j < columns; j++){
//                numbers[i][j] = sc.nextInt();
//            }
//
//        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(numbers[i][j] + " ");
//            }
//        System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int columns = sc.nextInt();

        int [] [] numbers = new int[row][columns];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for (int i = 0; i < row; i++ ){
            for (int j = 0; j < columns; j++){
                if (numbers[i][j] == x){
                    System.out.println("x found at location ( " + i + ", " + j + " )");
                }
            }
        }
    }
}
