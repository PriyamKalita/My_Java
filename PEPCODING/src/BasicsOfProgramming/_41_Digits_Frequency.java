package BasicsOfProgramming;

// Question
// You are given a number n
// You are given a digit d
// You are required to calculate the frequency of digit d in number n

import java.util.Scanner;

public class _41_Digits_Frequency {
    public static int getDigitFrequency(int n, int d)
    {
        int rv = 0;
        while (n > 0){
            int digit = n % 10;
            n = n / 10;
            if (digit == d)
            {
                rv++;
            }
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }
}
