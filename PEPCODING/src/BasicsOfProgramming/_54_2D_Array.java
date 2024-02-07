package BasicsOfProgramming;

import java.util.Scanner;

// You are given a number n, representing the number of row
// You are given a number m, representing the number of columns
// You are given n*m number, representing elements of 2d array a.
// You are required to display the contents of 2d array aas Suggested by output format below
// n
// m
// e11
// e12
// e13
// e21
// e21
// e23
// ......
// OutPut
// e11e12e13.....
// e21e22e23.....
public class _54_2D_Array {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
