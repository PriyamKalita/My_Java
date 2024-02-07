package BasicsOfProgramming;

import java.util.Scanner;

public class _40_Functions {

    public static void display(int n, int r, int nPr){
        System.out.println(nPr);
    }

    public static int fact(int x)
    {
        int rv = 1;
        for (int i = 1; i <= x; i++){
            rv = rv * i;
        }
        return  rv;
    }

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int nFactorial = fact(n);
        int n_rFactorial = fact(n-r);

        int nPr = nFactorial / n_rFactorial;
        display(n, r,nPr);

        /*
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();

        int nFactorial = 1;
        for (int i = 1; i <= n; i++)
        {
            nFactorial *= i;
        }
        int n_rFactorial = 1;
        for (int i = 1; i <= n - r; i++)
        {
            n_rFactorial *= i;
        }

        int nPr = nFactorial / n_rFactorial;
        System.out.println(n + "p" + r + " = " + nPr);
        */
    }
}
