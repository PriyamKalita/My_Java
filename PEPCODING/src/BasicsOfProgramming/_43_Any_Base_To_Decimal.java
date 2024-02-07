package BasicsOfProgramming;
// You are given a number
// You are given a base b. n is a number on both b
// You are required to convert the number n into its corresponding value in decimal number System

import java.util.Scanner;

public class _43_Any_Base_To_Decimal {
    public static int getValueInDecimal(int n, int b){
        int rv = 0;
        int p = 1;
        while(n > 0){
            int digit = n % 10;
            n = n / 10;
            rv += digit * p;
            p = p * b;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueInDecimal(n, b);
        System.out.println(d);

    }
}
