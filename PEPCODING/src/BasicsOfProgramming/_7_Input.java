package BasicsOfProgramming;

import java.util.Scanner;

public class _7_Input {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();

        System.out.println(" Dear " + name + " Here is the number ");

        for (int i = 0; i <= n; i++)
        {
            System.out.println(i);
        }
    }
}
