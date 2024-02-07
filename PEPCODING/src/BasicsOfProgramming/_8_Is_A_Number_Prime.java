package BasicsOfProgramming;

import java.util.Scanner;

// You have to Check whether a given number is prime or not
// Take a number 't' as input representing count of input numbers to be tested
// Take a number 'n' as input 't' number of times
// For each input value of n print 'prime' if the number is prime and 'not prime'.

public class _8_Is_A_Number_Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        int count = 0;
        for (int i = 0; i < t; i++)
        {
            int n = scn.nextInt();
            for (int div = 2; div * div <=n; div++)
            {
                if (n % div == 0)
                {
                    count++;
                    break;
                }
            }
            if (count == 0)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }
        }
    }
}
