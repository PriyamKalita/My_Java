package BasicsOfProgramming;

import java.util.Scanner;

public class _80_Find_Maximum_Of_An_Array_Using_Recursion {

    public static int maxOfArray(int [] arr , int idx){
        if (idx == arr.length - 1)
        {
            return arr[idx];
        }

        int misa = maxOfArray(arr, idx + 1);
        if (misa > arr[idx])
        {
            return misa;
        }
        else
        {
            return arr[idx];
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }

        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }
}
