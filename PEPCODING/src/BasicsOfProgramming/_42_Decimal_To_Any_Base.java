package BasicsOfProgramming;

// You are given a decimal number n
// You are given a base b
// You are required to convert the number in into its corresponding value in base b

import java.util.Scanner;

public class _42_Decimal_To_Any_Base {
    public static int getValueInBase(int n, int b){
        int rv = 0;
        int p = 1;
        while (n > 0){
            int digit = n % b;
            n = n / b;

            rv += digit * p;
            p = p * 10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);

    }
}
