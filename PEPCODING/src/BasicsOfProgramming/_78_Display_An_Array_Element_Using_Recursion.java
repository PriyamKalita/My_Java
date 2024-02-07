package BasicsOfProgramming;

import java.util.Scanner;

public class _78_Display_An_Array_Element_Using_Recursion {

    public static void displayArr(int [] arr, int idx){
        if (idx == arr.length)
        {
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx + 1);
    }

    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }
        displayArr(arr, 0);
    }
}
