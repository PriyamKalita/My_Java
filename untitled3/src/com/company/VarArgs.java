package com.company;

public class VarArgs {
    static int sum(int ...arr){
        int result = 0;
        for (int a : arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to varargs ");
        System.out.println("The sum of 1 ans 3 is : " + sum(1,2));
        System.out.println("The sum of 1 , 2 ans 3 is : " + sum(1,2,3));
        System.out.println("The sum of 1 2, 3 ans 4 is : "+ sum(1,2, 3, 4));






    }
}
