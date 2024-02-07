package com.company;

public class pep2nd {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println(sum);
        System.out.println("sum of " + x + " and "+ y + " is " + sum);

        int prd  = x*y;
        System.out.println("product of " + x + " and "+ y + " is " + prd);

        int v1 = x/y;
        int v2 = y/x;
        int v3 = x%y;

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        int exp = (x *y)/(x+y);
        System.out.println(exp);

        System.out.println(Math.pow(2,3));

        int s = (int)Math.pow(2,3);
        System.out.println(s);
    }
}
