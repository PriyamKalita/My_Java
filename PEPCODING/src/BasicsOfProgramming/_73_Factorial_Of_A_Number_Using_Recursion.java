package BasicsOfProgramming;

import java.util.Scanner;

public class _73_Factorial_Of_A_Number_Using_Recursion {

    public static int factorial(int n){
        if (n == 1)
        {
            return 1;
        }
        int fnm1 = factorial(n - 1);
        int fn = n * fnm1;
        return fn;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f = factorial(n);
        System.out.println(f);
    }
}
