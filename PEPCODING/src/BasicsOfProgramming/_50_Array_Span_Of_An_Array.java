package BasicsOfProgramming;

import java.util.Scanner;

// You are given a number n, representing the count of element.
// You are given n numbers.
// You are required to find the span of input. Span is defined as
// difference of maximum value and minimum Value
public class _50_Array_Span_Of_An_Array {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = scn.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        int span = max - min;
        System.out.println(span);
    }
}
