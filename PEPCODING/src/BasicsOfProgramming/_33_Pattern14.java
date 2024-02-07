package BasicsOfProgramming;

// x * 1 = x
// x * 2 = 2x
// x * 3 = 3x
// ...........
// x * 10 = 10x
import java.util.Scanner;
public class _33_Pattern14 {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int X = scn.nextInt();
        for (int i = 1; i <= 10; i++)
        {
            int value = X * i;
            System.out.println(X + " * " + i + " = " + value);
        }
    }
}
