package com.company;

public class VARIABLES {
    public static void main(String[] args) {

        String name = "John";
        System.out.println(name);



        int myNum = 15;
        System.out.println(myNum);



        int myNum1;
        myNum1 = 15;
        System.out.println(myNum1);



        int myNum2 = 15;
        myNum2 = 20;  // myNum is now 20
        System.out.println(myNum2);



//        int myNum = 5;
//        float myFloatNum = 5.99f;
//        char myLetter = 'D';
//        boolean myBool = true;
//        String myText = "Hello";



        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);



        String name5 = "John";
        System.out.println("Hello " + name5);



        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y



        int x1 = 5, y1 = 6, z1 = 50;
        System.out.println(x1 + y1 + z1);



        // Good
        int minutesPerHour = 60;
        // OK, but not so easy to understand what m actually is
        int m = 60;
        System.out.println(minutesPerHour);
        System.out.println(m);



    }
}
