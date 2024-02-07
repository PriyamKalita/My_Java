package BasicsOfProgramming;
//     1
//   2 3 2
// 3 4 5 4 3
//   2 3 2
//     1
import java.util.Scanner;
public class _34_Pattern15 {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int space = n / 2;
        int star = 1;
        int value = 1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= space; j++){
                System.out.print("\t");
        }
            int cvalue = value;
            for (int j = 1; j <= star; j++)
            {
                System.out.print(cvalue + "\t");
                if (j <= star/2)
                {
                    cvalue++;
                }
                else
                {
                    cvalue--;
                }
            }
        if (i <= n / 2)
            {
                space--;
                star += 2;
                value++;
            }
            else
            {
                space++;
                star -= 2;
                value--;
            }
        System.out.println();
        }
    }
}