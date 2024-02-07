package BasicsOfProgramming;

public class _4_Conditional {
    public static void main(String[] args) {
        int x = 10;

        if (x % 2 == 0)
        {
            System.out.println(x + " is Even");
        }
        else
        {
            System.out.println(x + " is Odd");
        }
        System.out.println("Hello World");

        System.out.println("\n");

        int n1 = 20;
        int n2 = 10;

        if (n1 == n2)
        {
            System.out.println(n1 + " is equal to " + n2);
        }
        else
        {
            if (n1 > n2)
            {
                System.out.println(n1 + " is Greater than " + n2);
            }
            else
            {
                System.out.println(n1 + " is smaller than " + n2);
            }

            System.out.println("\n");


            int a1 = 10;
            int a2 = 20;

            if(a1 == a2)
            {
                System.out.println(a1 + " is equal to " + a2);
            }
            else if (a1 > a2)
            {
                System.out.println(a1 + " is Greater than " + a2);
            }
            else
            {
                System.out.println(a1 + " is Smaller than " + a2);
            }
        }
    }
}
