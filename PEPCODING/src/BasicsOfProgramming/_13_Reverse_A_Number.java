package BasicsOfProgramming;

// You have to display the digits of a Number in reverse
// Take as input 'n' the number for which digits have to be display in reverse
// Print the digit of the number line-wise. But in reverse order

import java.util.Scanner;

public class _13_Reverse_A_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n > 0)
        {
            int dig = n % 10;
            n = n / 10;
            System.out.println(dig);
        }
    }
}
