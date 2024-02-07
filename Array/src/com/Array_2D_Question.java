package com;

public class Array_2D_Question {

    //                (1)
//    public static void printSpiral(int matrix[][]){
//        int startRow = 0;
//        int startCol = 0;
//        int endRow = matrix.length - 1;
//        int endCol = matrix[0].length - 1;
//
//        while (startRow <= endRow && startCol <= endCol){
//            // Top
//            for (int j = startCol; j <= endCol; j++){
//                System.out.print(matrix[startRow][j] + " ");
//            }
//
//            // Right
//            for (int i = startRow + 1; i <= endRow; i++){
//                System.out.print(matrix[i][endCol] + " ");
//            }
//
//            // Bottom
//            for (int j = endCol - 1; j >= startCol; j--){
//                if (startRow == endRow){
//                    break;
//                }
//                System.out.print(matrix[endRow][j] + " ");
//            }
//
//            // Left
//            for (int i = endRow - 1; i >= startRow + 1; i--) {
//                if (startCol == endCol){
//                    break;
//                }
//                System.out.print(matrix[i][endCol] + " ");
//            }
//
//            startCol++;
//            startRow++;
//            endCol--;
//            endRow--;
//
//        }
//        System.out.println();
//    }

    //                    (2)
//    public static int digonalSum(int matrix[][]){
//        int sum = 0;
//                     // Time complexity - o(n^2)
//        for (int i = 0; i < matrix.length; i++){
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i == j){
//                    sum += matrix[i][j];
//                }
//                else if (i + j == matrix.length - 1){
//                    sum += matrix[i][j];
//                }
//            }
//        }
//        return sum;

    //      Time complexity - o(n)
//        for(int i = 0; i < matrix.length; i++){
//            // Primary Diagonal
//            sum += matrix[i][i];
//            // Secondary Diagonal
//            if (i != matrix.length - 1- i){
//                sum += matrix[i][matrix.length - i - 1];
//            }
//        }
//        return sum;
//    }

    //                (3)
    public static boolean stairCaseSearch(int matrix[][], int key){
        int row  = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0){
            if (matrix[row][col] == key){
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            }
            else if (key < matrix[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {
        // Question No. (1) : Spiral Matrix
//        int matrix[][] = {{1, 2, 3, 4},
//                          {5, 6, 7, 8},
//                          {9, 10, 11, 12},
//                          {13, 14, 15, 16}};
//        printSpiral(matrix);

        // Question No. (2) : Diagonal Sum
//        int matrix[][] = {{1, 2, 3, 4},
//                          {5, 6, 7, 8},
//                          {9, 10, 11, 12},
//                          {13, 14, 15, 16}};
//        digonalSum(matrix);

        // Question No. (3) : Search in Sorted Matrix
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
        int key = 33;
        stairCaseSearch(matrix, key);
    }
}
