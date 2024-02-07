package BasicsOfProgramming;

import java.util.Scanner;

public class _81_First_Index_Of_Occurrence_In_Array_Using_Recursion {

    public static int firstIndex(int [] arr, int idx, int x){
        if (idx == arr.length)
        {
            return -1;
        }

        if (arr[idx] == x)
        {
            return idx;
        }
        else
        {
            int fiisa = firstIndex(arr, idx + 1, x);
            return fiisa;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++ )
        {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        int fi = firstIndex(arr, 0, d);
        System.out.println(fi);
    }
}
