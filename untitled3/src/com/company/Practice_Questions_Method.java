package com.company;

public class Practice_Questions_Method {

//    static void  multiplication(int n){
//        for (int i = 1; i <= 10; i++) {
//            System.out.format("%d x %d = %d\n", n, i, n * i);
//        }
//    }



//    static void pattern1(int n){
//        for (int i = 0; i < n; i++){
//            for (int j = 0; j < i + 1 ; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//    }



//    static int sumrect(int n){
//        if (n == 1){
//            return 1;
//        }
//            return n + sumrect(n - 1);
//    }



//    static int fib(int n){
//        if (n == 1){
//            return 0;
//        }
//        else if(n == 2){
//            return 1;
//        }
//        else {
//            return fib(n - 1) + fib(n - 2);
//        }
//    }



    static void pattern(int n){

        if (n > 0){
            pattern(n - 1);
            for (int i = 0; i < n; i++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        //multiplication(7);

        //pattern1(7);

        //int c = sumrect(3);
        //System.out.println(c);

        //int result = fib(5);
        //System.out.println(result);

        pattern(5);


    }
}
