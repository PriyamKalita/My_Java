package Com.Company;

import java.util.Scanner;

public class _7_Two_Call {
    public static void pzz(int n){
        if (n == 0){
            return;
        }
//        System.out.println("pre" + n);
//        pzz(n - 1);
//        System.out.println("In" + n);
//        pzz(n - 1);
//        System.out.println("post" + n);

        System.out.println(n + " ");
        pzz(n - 1);
        System.out.println(n + " ");
        pzz(n - 1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }
}
