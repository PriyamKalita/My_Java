package com.company;

public class ARRAY {
    public static void main(String[] args) {



/*
        //int [] marks = new int [5];

        int [] marks;
        marks = new int [5];

        marks [0] = 100;
        marks [1] = 80;
        marks [2] = 50;
        marks [3] = 60;
        marks [4] = 70;
        System.out.println(marks[4]);

        int [] marks1 = {30, 40, 77, 97, 75};
        System.out.println(marks1[4]);
*/



/*
        int [] marks2 = {80, 20, 97, 77, 75};
        System.out.println(marks2.length);
*/



/*
        int [] marks2 = {50, 20, 77, 70, 75};

        for (int i = 0; i < marks2.length; i++){
            System.out.println(marks2[i]);
        }

        for (int i = marks2.length - 1; i >= 0; i--){
            System.out.println(marks2[i]);
        }
*/



/*
        // For-Each Loop
        int [] marks2 = {100, 90, 77, 73, 75};
        for (int element : marks2){
            System.out.println(element);
        }
*/


        /*
        int [][] flats ;
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;;

        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
*/



//        float [] marks = {45.5f, 76.5f, 63.5f, 99.5f, 100.0f};
//        float sum = 0;
//        for (float element : marks){
//            sum = sum + element;
//        }
//        System.out.println("The value of sum " + sum);



//        float [] marks = { 45.5f, 77.7f, 75.3f, 90.5f, 56.7f};
//        float num = 30.5f;
//        boolean isInArray = false;
//        for (float element : marks){
//            if (num == element){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("The value is present in the array");
//        }
//        else {
//            System.out.println("The value is not present in the array");
//        }



//        float [] marks = {50.5f, 70.5f, 45.5f, 77.5f, 90.5f};
//        float sum = 0;
//        for (float element : marks){
//            sum = sum + element;
//        }
//        System.out.println("The value of average marks is " + sum/marks.length);



//        int [] [] mat1 = {{1, 2, 3},
//                          {4, 5, 6}};
//
//        int [] [] mat2 = {{7, 8, 9},
//                          {10, 11, 12}};
//
//        int [] [] result = {{0, 0, 0},
//                           {0, 0, 0}};
//
//        for (int i = 0; i < mat1.length; i++){
//            for (int j = 0; j < mat1[i].length; j++){
//                System.out.format("Setting value for i = %d and j = %d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//
//        for (int i = 0; i < mat1.length; i++){
//            for (int j = 0; j < mat1[i].length; j++){
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println("");
//        }



//        int [] arr = {10, 20, 30,40, 50, 60, 70, 80, 90, 100};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//        for (int i = 0; i < n; i++){
//            temp = arr[i];
//            arr[i] = arr[l - i -1];
//            arr[l - i - 1] = temp;
//        }
//        for (int element : arr){
//            System.out.println(element + " ");
//        }



//        int [] arr = {1, 21, 3, 4, 5, 54, 67};
//        int max = 0;
//        for (int e : arr){
//            if (e > max){
//                max = e;
//            }
//        }
//        System.out.println("The value of the maximum element of the array " + max);



//        int [] arr = {1, 3, 5, 2, 54, 70};
//        boolean isShorted = true;
//        for (int i = 0; i < arr.length - 1; i++){
//            if (arr[i] > arr[i + 1]){
//                    isShorted = false;
//                    break;
//            }
//        }
//        if (isShorted){
//            System.out.println("The array is shorted");
//        }
//        else {
//            System.out.println("The array is not shorted");
//        }




    }
}
