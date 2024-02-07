package Test111;
import java.util.*;
public class SecondMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        scanner.close();

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum.");
        } else {
            System.out.println("The second maximum is: " + secondMax);
        }
    }
}
