package BasicsOfProgramming;

import java.util.Scanner;

// You are given a number n=n, representing the size of array a
// You are given n numbers. representing elements of array a.
// You are given another number d
// You are required to check if d number exists in the array a and at what index (0 Based).
// If found print the in dex , otherwise print -1
public class _51_Array_Find_Element_In_An_Array {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }

        int data = scn.nextInt();

        int idx = -1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == data)
            {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
    }
}
