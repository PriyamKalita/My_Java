package BasicsOfProgramming;

// Input 5
// * * *   * * *
// * *       * *
// *           *
// * *       * *
// * * *   * * *

import java.util.Scanner;
public class _25_Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int star = n / 2 + 1;
        int space = 1;
        for (int i = 1; i <= n; i++)
        {
            //System.out.println(star + "," + space + " ," + star);
            for (int j = 1; j <= star; j++)
            {
                System.out.print("*\t");
            }
            for (int j = 1; j <= space; j++)
            {
                System.out.print("\t");
            }
            for (int j = 1; j <= star; j++)
            {
                System.out.print("*\t");
            }
            if (i <= n/2)
            {
                star--;
                space += 2;
            }
            else
            {
                star++;
                space -= 2;
            }
            System.out.println();
        }
    }
}
