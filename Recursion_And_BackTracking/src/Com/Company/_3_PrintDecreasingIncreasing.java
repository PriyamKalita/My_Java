package Com.Company;

import java.util.Scanner;

public class _3_PrintDecreasingIncreasing {

    public static void PrintDecreasingIncreasing(int n){
        if (n == 0){
            return;
        }
        System.out.println(n);
        PrintDecreasingIncreasing(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintDecreasingIncreasing(n);
    }
}
