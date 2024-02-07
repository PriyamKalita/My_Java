package BasicsOfProgramming;

import java.util.Scanner;
public class _57_2D_Array_Spiral_Traversal {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        int minrow = 0;
        int mincol = 0;
        int maxrow = arr.length - 1;
        int maxcol = arr[0].length - 1;

        int tne = n * m;     // total numbers of elements
        int count = 0;

        while (count < tne) {
            // Left Wall
                for (int i = minrow; i <= maxrow && count < tne; i++)
                {
                    System.out.println(arr[i][mincol]);
                    count++;
                }
            mincol++;

            // Bottom Wall

                for (int i = mincol; i <= maxcol && count < tne; i++)
                {
                    System.out.println(arr[maxrow][i]);
                    count++;
                }
            maxrow--;

            // Right Wall
                for (int i = maxrow; i >= minrow && count < tne; i--)
                {
                    System.out.println(arr[i][maxcol]);
                    count++;
                }
            maxcol--;

            // Top Wall

                for (int i = maxcol; i >= mincol && count < tne; i--)
                {
                    System.out.println(arr[minrow][i]);
                    count++;
                }
            minrow++;
        }
    }
}
