package BasicsOfProgramming;

// You have count the number of digits in a number
// Take as input 'n' the number for which the digit has to be counted
// Print the digits in that number

import java.util.Scanner;

public class _11_Count_Digits_In_A_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int digit = 0;
        while (n != 0)
        {
            n = n / 10;
            digit++;
        }
        System.out.println(digit);
    }
}
