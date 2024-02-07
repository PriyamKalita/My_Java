package com;

public class Recursion {
    //               (1)
//    public static void printDecreasing(int n){
//        if (n == 1){
//            System.out.println(n);
//            return;
//        }
//        System.out.println(n + " ");
//        printDecreasing(n - 1);
//    }

    //              (2)
//    public static void printIncreasing(int n){
//        if (n == 1){
//            System.out.println(n);
//            return;
//        }
//        printIncreasing(n - 1);
//        System.out.println(n);
//    }

    //              (3)
//    public static int fact(int n){
//        if (n == 0){
//            return 1;
//        }
//        int fnm1 = fact(n - 1);
//        int fn = n * fact(n - 1);
//        return fn;
//    }

    //              (4)
//    public static int calNSum(int n){
//        if (n == 1){
//            return 1;
//        }
//        int sumNm1 = calNSum(n - 1);
//        int sumN = n + sumNm1;
//        return sumN;
//    }

    //              (5)
//    public static int fib(int n){
//        if (n == 0 || n ==1){
//            return n;
//        }
//        int fibNm1 = fib(n - 1);
//        int fibNm2 = fib(n - 2);
//        int fn = fibNm1 + fibNm2;
//        return fn;
//    }

    //               (6)
//    public static boolean isSorted(int arr[], int i){
//        if (i == arr.length - 1){
//            return true;
//        }
//        if (arr[i] > arr[i + 1]){
//            return false;
//        }
//        return isSorted(arr, i + 1);
//    }

    //              (7)
//    public static int firstOccurence(int arr[], int key, int i){
//        if (i == arr.length){
//            return -1;
//        }
//        if (arr[i] == key){
//            return i;
//        }
//        return firstOccurence(arr, key, i + 1);
//    }

    //               (8)
//    public static int LastOccurence(int arr[], int key, int i){
//        if (i == arr.length){
//            return -1;
//        }
//        int isFound = LastOccurence(arr, key, i + 1);
//        if (isFound == -1 && arr[i] == key){
//            return i;
//        }
//        return isFound;
//    }

    //              (9)
//    public static int power(int x, int n){
//        if (n == 0){
//            return 1;
//        }
//        int xnm1 = power(x, n - 1);
//        int xn = x * xnm1;
//        return xn;
//    }

    //                 (10)
    public static int optimizedPower(int a, int n){
        if (n == 0){
            return 1;
        }
//        int halfPower = optimizedPower(a, n / 2) * optimizedPower(a, n / 2);   // (i) - O(n)
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // If n is Odd Number
        if (n % 2 != 0){
            halfPower = a * halfPower;
        }
        return halfPower;
    }
    public static void main(String[] args){
        // Problem 1 : Print numbers from n to 1 (Decreasing Order)
//        int n = 10;
//        printDecreasing(n);

        // Problem 2 : Print numbers from 1 to n (Increasing Order)
//        int n = 5;
//        printIncreasing(n);

        // Problem 3 : Print Factorial of a number n
//        int n = 5;
//        fact(n);
//        System.out.println(fact(n));

        // Problem 4 : Print sum of first n natural numbers
//        int n = 5;
//        System.out.println(calNSum(n));

        // Problem 5 : Print Nth fibonacci number
//        int n = 10;
//        System.out.println(fib(n));

        // Problem 6 : Check if a given array is sorted or not
//        int arr[] = {1, 2, 3, 4, 5};
//        System.out.println(isSorted(arr, 0));

        // Problem 7 : Write a function to find the first occurrence of an element in an array
//        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//        System.out.println(firstOccurence(arr, 5, 0));

        // Problem 8 : Write a function to find the Last occurrence of an element in an array
//        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//        System.out.println(LastOccurence(arr, 5, 0));

        // Problem 9 : Print X^n
//        int xToPowerN = power(2, 10);
//        System.out.println(xToPowerN);

        // Problem 9 : Print X^n in O(logn)
        int a = 2;
        int n = 10;
        System.out.println(optimizedPower(a, n));
    }
}
