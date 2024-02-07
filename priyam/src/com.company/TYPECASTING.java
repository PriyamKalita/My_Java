package com.company;

public class TYPECASTING {
    public static void main(String[] args) {



//Widening Casting
        int myInt = 9;
        double myDouble = myInt;        // Automatic casting: int to double
        System.out.println(myInt);
        System.out.println(myDouble);



//Narrowing Casting
        double myDouble1 = 9.78;
        int myInt1 = (int) myDouble1; // Manual casting: double to int
        System.out.println(myDouble1);   // Outputs 9.78
        System.out.println(myInt1);      // Outputs 9
    }
}
