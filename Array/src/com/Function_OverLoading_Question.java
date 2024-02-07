package com;

public class Function_OverLoading_Question {
    //                (1)
//    public static boolean isPrime(int n){
//        boolean isPrime = true;
//        if (n == 2){
//            return true;
//        }
//        for (int i = 2; i <= n - 1; i++){
//            if (n % i == 0){
//                isPrime = false;
//                break;
//            }
//        }
//        return isPrime;
//    }

//    public static boolean isPrime(int n){
//        boolean isPrime = true;
//        if (n == 2){
//            return true;
//        }
//        for (int i = 2; i <= Math.sqrt(n); i++){
//            if (n % i == 0){
//                isPrime = false;
//                break;
//            }
//        }
//        return isPrime;
//    }

//    public static void primesInRange(int n){
//        for (int i = 2; i <= n; i++){
//            if (isPrime(i)){   // true
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//    }

    //                  (3)
//    public static void binaryToDecimal(int binaryNumber){
//        int myNum = binaryNumber;
//        int power = 0;
//        int DecimalNum = 0;
//
//        while (binaryNumber > 0){
//            int lastDigit = binaryNumber % 10;
//            DecimalNum = DecimalNum + (lastDigit * (int)Math.pow(2, power));
//            power++;
//            binaryNumber = binaryNumber / 10;
//        }
//        System.out.println("Decimal of " + myNum + " = " + DecimalNum);
//    }

    //                   (4)
//    public static void decToBin(int n){
//        int myNum = n;
//        int power = 0;
//        int binNum = 0;
//
//        while (n > 0){
//            int rem = n % 2;
//            binNum = binNum + (rem * (int)Math.pow(10, power));
//            power++;
//            n = n/ 2;
//        }
//        System.out.println("Binary Form of " + myNum + " = " + binNum);
//    }
    public static void main(String[] args) {
        // Question No. 1 : Check if a number is Prime or Not
//        System.out.println(isPrime(79));

        // Question no. 2 : Print all Primes in a Range
//        primesInRange(10);

        // Question No. 3 : Convert From Binary to Decimal
//        binaryToDecimal(111);

        // Question No. 4 : Convert From Decimal to Binary
//        decToBin(71);

    }
}
