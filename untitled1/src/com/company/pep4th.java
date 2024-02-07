package com.company;

import java.util.*;
public class pep4th {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        int b = scn.nextInt();
//        scn.close();
//        int d = toDecimal(n, b);
//        System.out.println(d);
//    }
//
//    public static int toDecimal(int n, int b) {
//        int multiplier = 0;
//        int ans_num = 0;
//        while (n > 0) {
//            int remainder = n % 10;
//            n = n / 10;
//            ans_num += remainder * Math.pow(b, multiplier);
//            multiplier++;
//        }
//        return ans_num;

        int a = scn.nextInt();
        System.out.println("The mark is : " + a);

        if (a>90)
        {
            System.out.println("print Excellent");
        }
        else if(80 < a && a <= 90)
        {
            System.out.println("print Good");
        }
        else if(70 < a && a <= 80)
        {
            System.out.println("print fair");
        }
        else if(60 < a && a <= 70)
        {
            System.out.println("Meet Expectation");
        }
        else {
            System.out.println("Below Par");
        }
    }
}