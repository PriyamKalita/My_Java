package BasicsOfProgramming;

import java.util.Scanner;
public class _74_Calculate_Power_Using_Recursion {

    public static int power(int x, int n){
        if (n == 0)
        {
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int xn = power(x, n);
        System.out.println(xn);
    }
}
