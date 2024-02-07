package Com.Company;

import java.util.Scanner;

public class _5_Power_Xn {

    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }
        int xnm1 = power(x, n - 1);
        int xn = xnm1 * x;
        return xn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int xn = power(x, n);
        System.out.println(xn);
    }
}
