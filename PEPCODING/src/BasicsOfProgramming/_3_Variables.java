package BasicsOfProgramming;

public class _3_Variables {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;

        int sum = x + y;
        System.out.println("The sum of " + x + " and " + y + " : " + sum);

        int prd = x * y;
        System.out.println("The product of " + x + " and " + y + " : " + prd);

        int v1 = x / y;
        int v2 = y / x;
        int v3 = x % y;
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        //int exp = x * y/x + y;
        int exp1 = (x * y)/(x + y);
        //System.out.println(exp);
        System.out.println(exp1);
    }
}
