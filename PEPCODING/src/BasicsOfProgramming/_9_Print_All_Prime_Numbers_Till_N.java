package BasicsOfProgramming;

// You have to print all Prime numbers between a range
// Take as input 'low' the lower limit of range
// Take as input 'high' the higher limit of range
// For the range print all the primes numbers between low and high (both included)
import java.util.Scanner;

public class _9_Print_All_Prime_Numbers_Till_N {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int n = low; n <= high; n++)
        {
            int count = 0;

            for (int div = 2; div * div <=n ; div++)
            {
                if (n % div == 0)
                {
                    count++;
                    break;
                }
            }
            if (count == 0 )
            {
                System.out.println(n);
            }
        }
    }
}
