package com;

public class Bit_Manipulation {
    //                  (1)
//    public static void oddOrEven(int n){
//        int bitMask = 1;
//        if ((n & bitMask) == 0){
//            // even Number
//            System.out.println("Even Number");
//        }
//        else {
//            System.out.println("odd Number");
//        }
//    }

    // getIthBit
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if ((n & bitMask) == 0){
            return 0;
        }
        else {
            return 1;
        }
    }

    // setIthBit
    public static int setIthBit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }

    // clearIthBit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Update Ith Bit
    public static int updateIthBit(int n, int i, int newBit){

        //     (i)
//        if (newBit == 0){
//            return clearIthBit(n, i);
//        }
//        else {
//            return setIthBit(n, i);
//        }

        //    (ii)
        n = clearIthBit(n, i);
        int BitMask = newBit << i;
        return n | BitMask;
    }

    public static int clearIthBits(int n,int i){
        int bitMask = (~0) << i;
        return  n & bitMask;
    }
    public static void main(String[] args) {
//        System.out.println(5 & 6);
//        System.out.println(5 | 6);
//        System.out.println(5 ^ 6);
//        System.out.println(~5);
//        System.out.println(~0);
//        System.out.println(5 << 2);
//        System.out.println(6 >> 1);

        // Question No. (1) : Check if a number is Odd or Even
//        oddOrEven(3);
//        oddOrEven(11);
//        oddOrEven(14);

        // Get ith Bit
        System.out.println(getIthBit(10, 2));

        // setIthBit
        System.out.println(setIthBit(10, 2));

        // clearIthBit
        System.out.println(clearIthBit(10, 1));

        // updateIthBit
        System.out.println(updateIthBit(10, 2, 1));

        System.out.println(clearIthBits(15, 2));
    }
}
