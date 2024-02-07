package com.company;

import java.awt.font.FontRenderContext;

public class Pattern {
    public static void main(String[] args) {
        /*
        // Pattern 1 : Solid Rectangle
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        */

        /*
        // Pattern 2 : Hollow Rectangle
        // * * * * *
        // *       *
        // *       *
        // * * * * *

        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                if (i == 1 || j == 1 || i == n || j == m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */

        /*
        // Pattern 3 :
        // *
        // * *
        // * * *
        // * * * *

        int n = 4;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
        // Pattern 4 :
        // * * * *
        // * * *
        // * *
        // *

        int n = 4;

        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
        // Pattern 5 : Inverted Half Pyramid
        //        *
        //      * *
        //    * * *
        //  * * * *

        int n = 4;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
        // Pattern 6 :
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        int n = 4;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        */

        /*
        // Pattern 7 :
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i + 1; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        */

        /*
        // Pattern 8 : floyd's Triangle
        // 1
        // 2  3
        // 4  5  6
        // 7  8  9  10
        // 11 12 13 14 15
        int n = 5;
        int number = 1;
        for (int i= 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        */

        /*
        // Pattern 9 : 0 1 Triangle
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        int n = 5;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i ; j++)
            {
                int sum = i + j;
                if (sum % 2 == 0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        */

        /*
        // Pattern 10 : Butterfly Pattern
        // *             *
        // * *         * *
        // * * *     * * *
        // * * * * * * * *
        // * * * * * * * *
        // * * *     * * *
        // * *         * *
        // *             *
        int n = 4;

        //upper part
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n-i);

            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower part
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        // Pattern 11 : Solid Rhombus
        //         * * * * *
        //       * * * * *
        //     * * * * *
        //   * * * * *
        // * * * * *
//        int n = 5;
//        for (int i = 1; i <= n; i++)
//        {
//            for(int j = 1; j <= n - i; j++)
//            {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= 5; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // Pattern 12 :
        //      1
        //     2 2
        //    3 3 3
        //   4 4 4 4
        //  5 5 5 5 5
//        int n = 5;
//        for (int i = 1; i <= n; i++)
//        {
//            // Space
//            for (int j = 1; j <= n - i; j++)
//            {
//                System.out.print(" ");
//            }
//            // Number
//            for (int j = 1; j <= i; j++) // doubt
//            {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        // Pattern 13 : Palindromic Pattern
        //         1
        //       2 1 2
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5
//        int n = 5;
//        for (int i = 1; i <= n; i++)
//        {
//            // Space
//            for (int j = 1; j <= n - i; j++)
//            {
//                System.out.print(" ");
//            }
//            // 1st Half Numbers
//            for (int j = i; j >= 1; j--)
//            {
//                System.out.print(j);
//            }
//            // 2nd Half Number
//            for (int j = 2; j <= i; j++)
//            {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Pattern 14 : Diamond Pattern
        //       *
        //     * * *
        //   * * * * *
        //  * * * * * *
        //  * * * * * *
        //   * * * * *
        //     * * *
        //       *
//        int n = 4;
//
//        // Upper Half
//        for (int i = 1; i <= n; i++)
//        {
//            // Space
//            for (int j = 1; j <= n - i; j++)
//            {
//                System.out.print(" ");
//            }
//            // Stars
//            for (int j = 1; j <= 2*i-1; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // Lower Half
//        for (int i = n; i >= 1; i--) {
//            // Space
//            for (int j = 1; j <= n - i; j++)
//            {
//                System.out.print(" ");
//            }
//            // Stars
//            for (int j = 1; j <= 2 * i - 1; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
