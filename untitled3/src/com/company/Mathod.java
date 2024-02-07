package com.company;

public class Mathod {
    static int logic(int x, int y){
        int z;
        if (x > y){
            z = x + y;
        }
        else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a,b);
        System.out.println(c);

        int a1 = 75;
        int b1 = 5;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c1);



//public class Mathod {
//     int logic(int x, int y){
//        int z;
//        if (x > y){
//            z = x + y;
//        }
//        else {
//            z = (x + y) * 5;
//        }
//        return z;
//    }
//
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 7;
//        int c;
//
//        Mathod  obj = new Mathod();
//        c = obj.logic(a,b);
//        System.out.println(c);
//
//        int a1 = 75;
//        int b1 = 5;
//        int c1;
//        c1 = obj.logic(a1, b1);
//        System.out.println(c1);



    }
}
