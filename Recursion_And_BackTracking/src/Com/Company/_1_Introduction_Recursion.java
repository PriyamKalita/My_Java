package Com.Company;

import java.util.Scanner;

public class _1_Introduction_Recursion {

    public static void printDecreasing(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void main(String[] args) {
        // PrintDecreasing
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }
}
