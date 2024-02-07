package BasicsOfProgramming;

import java.util.Scanner;

public class _79_Display_Array_In_Reverse_Using_Recursion {

    public static void displayArrayReverse(int[] arr, int idx){
        if (idx == arr.length)
        {
            return;
        }
        displayArrayReverse(arr, idx + 1);
        System.out.println(arr[idx]);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }
        displayArrayReverse(arr, 0);
    }
}
