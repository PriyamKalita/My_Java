package ClassRoomIT916;

import java.util.*;
import java.io.*;
import java.util.Scanner;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int arr[][]= new int [3][2];
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 6 elements of the matrix:");
        for(i=0; i<arr.length; i++) {
            for(j=0; j< arr[j].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for (i=0; i<arr.length; i++) {
            for (j=0;j<arr[j].length; j++) {
                System.out.print(" "+ arr[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("The Transpose of the given matrix is :");
        for (i=0; i<arr[i].length; i++) {
            for (j=0;j<arr.length; j++) {
                System.out.print(" "+ arr[j][i]);
            }
            System.out.println(" ");
        }
    }
}
