package BasicsOfProgramming;

// Input 5
//              *
//         *    *    *
//      *  *    *    *   *
//         *    *    *
//              *
import java.util.Scanner;
public class _24_Pattern5 {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int space = n / 2;
        int star = 1;
        for (int i = 1; i <= n; i++)
        {
            //System.out.println(space + " , " + star);
            for (int j = 1; j <= space; j++)
            {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++)
            {
                System.out.print(" * ");
            }
            if (i <= n / 2)
            {
                space--;
                star += 2;
            }
            else
            {
                space++;
                star -= 2;
            }
            System.out.println();
        }
    }
}
