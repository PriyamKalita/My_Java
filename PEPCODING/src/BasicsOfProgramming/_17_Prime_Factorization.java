package BasicsOfProgramming;

import java.util.Scanner;

public class _17_Prime_Factorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int div = 2; div < n; div++)
        {
            n = n / div;
            System.out.print(div + " ");
        }
        if (n != 1)
        {
            System.out.print(n);
        }
    }
}
