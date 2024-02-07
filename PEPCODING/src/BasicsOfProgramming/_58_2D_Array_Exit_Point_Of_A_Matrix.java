package BasicsOfProgramming;

import java.util.Scanner;

public class _58_2D_Array_Exit_Point_Of_A_Matrix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        int [][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }

        int dir = 0;    // 0 - e, 1 - s, 2 - w, 3 - n
        int i = 0;
        int j = 0;

        while (true)
        {
            if (dir == 0)
            {
                j++;
            }
            else if (dir == 1)
            {
                i++;
            }
            else if (dir == 2)
            {
                j--;
            }
            else if (dir == 3)
            {
                i--;
            }

            if (i < 0 )
            {
                i++;
                break;
            }
            else if (j < 0)
            {
                j++;
                break;
            }
            else if (i == arr.length)
            {
                i--;
                break;
            }
            else if (j == arr[0].length)
            {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
