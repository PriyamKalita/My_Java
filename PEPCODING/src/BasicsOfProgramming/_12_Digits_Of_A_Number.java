package BasicsOfProgramming;

import java.util.Scanner;

public class _12_Digits_Of_A_Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int NoOfDivision = 0;
        int temp = n;
        while (temp != 0)
        {
            temp = temp / 10;
            NoOfDivision++;
        }

        int div = (int)Math.pow(10, NoOfDivision - 1);
        while (div != 0)
        {
            int q = n / div;
            System.out.println(q);

            n = n % div;
            div = div / 10;
        }
    }
}
