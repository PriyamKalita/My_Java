package com;

public class Function_OverLoading {
    // (1) Using Parameter
//    public static int sum(int a, int b){
//        return a + b;
//    }
//    public static int sum(int a, int b, int c){
//        return a + b + c;
//    }

    // (2) Using DataType
    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        // (1)
//        System.out.println(sum(3, 5));
//        System.out.println(sum(3, 5,1));

        // (2)
        System.out.println((sum(3, 5)));
        System.out.println((sum(3.2f, 5.5f)));
    }
}
