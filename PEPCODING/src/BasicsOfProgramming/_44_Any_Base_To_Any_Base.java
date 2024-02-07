package BasicsOfProgramming;
// Question
// You are given a number n
// You are given a base b1. n is a number on base b
// You are given another base b2
// You are required to convert the number n of base b1 to a number in base b2
import java.util.Scanner;
public class _44_Any_Base_To_Any_Base {
    public static int getValue(int n, int b1, int b2){
        int dec = AnyBaseToDecimal(n, b1);
        int dn = DecimalToAnyBase(dec, b2);
        return dn;
    }
    public static int DecimalToAnyBase(int n, int b){
        int rv = 0;
        int p = 1;
        while (n > 0){
            int digit = n % b;
            n = n / b;

            rv += digit * p;
            p = p * 10;
        }
        return rv;
    }
    public static int AnyBaseToDecimal(int n, int b){
        int rv = 0;
        int p = 1;
        while(n > 0){
            int digit = n % 10;
            n = n / 10;
            rv += digit * p;
            p = p * b;
        }
        return rv;
    }

    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int d = getValue(n, b1, b2);
        System.out.println(d);
    }
}
