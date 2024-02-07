package com;

import java.util.HashSet;

public class Pattern_Advance {
                             // (1)
//    public static void hollow_rectangle(int totalRows, int totalCols){
//
        // Outer Loop - Rows
//        for (int i = 1; i <= totalRows; i++){
//            // Inner Loop -columns
//            for (int j = 1; j <= totalCols; j++){
//                // Cell - (i, j)
//                if (i == 1 || i == totalRows || j == 1 || j == totalCols){
//                    // Boundary Cells
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }

    //                    (2)
//    public static void Inverted_and_Rotated_Half_Pyramid(int n){
//        // Outer Loop
//        for (int i = 1; i <= n; i++){
//            // Space
//            for (int j = 1; j <= n - i; j++){
//                System.out.print(" ");
//            }
//            // Stars
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //                    (3)
//    public static void Inverted_Half_Pyramid_With_Numbers(int n){
//        for (int i = 1; i <= n; i++){
//            // Inner Loop
//            for (int j = 1; j <= n - i + 1; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }

    //                  (4)
//    public static void floyd_Triangle(int n){
//        // Outer loop
//        int counter = 1;
//        for (int i = 1; i <= n; i++){
//            // Inner Loop - How many times will counter be printed
//            for (int j = 1; j <= i; j++){
//                System.out.print(counter + " ");
//                counter++;
//            }
//            System.out.println();
//        }
//    }

    //                  (5)
//    public static void zero_one_Triangle(int n){
//        for (int i = 1; i <= n ; i++){
//            for (int j = 1; j <= i; j ++){
//                if ((i + j) % 2 == 0){
//                    System.out.print("1");
//                }
//                else {
//                    System.out.print("0");
//                }
//            }
//            System.out.println();
//        }
//    }

    //                       (6)
//    public static void butterFly(int n){
//        // 1st Half
//        for (int i = 1; i <= n; i++){
//            // stars - i
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            // Spaces
//            for (int j = 1; j <= 2 * (n - i); j++){
//                System.out.print(" ");
//            }
//            // stars - i
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // 2nd Half
//        for (int i = n; i >= 1; i--){
//            // stars - i
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            // Spaces
//            for (int j = 1; j <= 2 * (n - i); j++){
//                System.out.print(" ");
//            }
//            // stars - i
//            for (int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //                 (7)
//    public static void solid_Rhombus(int n){
//        for (int i = 1; i <= n; i++){
//            // Spaces
//            for (int j = 1; j <= (n - i); j++){
//                System.out.print(" ");
//            }
//            // Stars
//            for (int j = 1; j <= n; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //                   (8)
//    public static void hollow_rhombus(int n){
//        for (int i = 1; i <= n; i++){
//            // Spaces
//            for (int j = 1; j <= (n - i); j++){
//                System.out.print(" ");
//            }
//            // hollow rectangle - stars
//            for (int j = 1; j <= n; j++){
//                if (i == 1 || i == n || j == 1 || j == n){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }

    //                    (9)
//    public static void Diamond_Pattern(int n){
//        // 1st Half
//        for (int i = 1; i <= n; i++){
//            // Spaces
//            for (int j = 1; j <= (n - i); j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (2 *i )- 1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        // 2nd Half
//        for (int i = n; i >= 1; i--){
//            // Spaces
//            for (int j = 1; j <= (n - i); j++){
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (2 *i )- 1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        // Question No. 1 : Print Hollow Rectangle Pattern
        // * * * * *
        // *       *
        // *       *
        // * * * * *
//        hollow_rectangle(4, 5);

        // Question No. 2 : Print Inverted and Rotated Half Pyramid
        //       *
        //     * *
        //   * * *
        // * * * *
//        Inverted_and_Rotated_Half_Pyramid(5);

        // Question No. 3 : Inverted Half-Pyramid With Numbers
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
//        Inverted_Half_Pyramid_With_Numbers(5);

        // Question No. 4 : Floyd's Triangle
        // 1
        // 2   3
        // 4   5  6
        // 7   8  9 10
        // 11 12 13 14 15
//        floyd_Triangle(5);

        // Question No. 5 : 0 1 Triangle
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
//        zero_one_Triangle(5);

        // Question No. 6 : Butterfly Pattern
        // *             *
        // * *         * *
        // * * *     * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * *     * * *
        // * *         * *
        // *             *
//        butterFly(4);

        // Question No. 7 : Solid Rhombus
        //         * * * * *
        //       * * * * *
        //     * * * * *
        //   * * * * *
        // * * * * *
//        solid_Rhombus(5);

        // Question No. 8 : Hollow Rhombus
        //         * * * * *
        //       *       *
        //     *       *
        //   *       *
        // * * * * *
//        hollow_rhombus(5);

        // Question no. 9 : Diamond Pattern
        //       *
        //     * * *
        //   * * * * *
        // * * * * * * *
        // * * * * * * *
        //   * * * * *
        //     * * *
        //       *
//        Diamond_Pattern(4);

    }
}
