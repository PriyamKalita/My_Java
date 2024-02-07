package com.company;

public class DATATYPES {
    public static void main(String[] args) {



/*        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String               */



        //The byte data type can store whole numbers from -128 to 127.
        // This can be used instead of int or other integer types to save memory
        // when you are certain that the value will be within -128 and 127:
        byte myNum = 100;
        System.out.println(myNum);



        //The short data type can store whole numbers from -32768 to 32767:
        short myNum1 = 5000;
        System.out.println(myNum1);



        //The int data type can store whole numbers from -2147483648 to 2147483647.
        int myNum2 = 100000;
        System.out.println(myNum2);




        //The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
        long myNum3 = 15000000000L;
        System.out.println(myNum3);



        //The float data type can store fractional numbers from 3.4e−038 to 3.4e+038.
        // Note that you should end the value with an "f":
        float myNum4 = 5.75f;
        System.out.println(myNum4);



        //The double data type can store fractional numbers from 1.7e−308 to 1.7e+308.
        // Note that you should end the value with a "d":
        double myNum5 = 19.99d;
        System.out.println(myNum5);



        //A floating point number can also be a scientific number with an "e" to indicate the power of 10:
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);



        //A boolean data type is declared with the boolean keyword and can only take the values true or false:
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false



        //The char data type is used to store a single character. The character must be surrounded by
        // single quotes,like 'A' or 'c':
        char myGrade = 'B';
        System.out.println(myGrade);



        //you can use ASCII values to display certain characters:
        char a = 65, b = 66, c = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



        //The String data type is used to store a sequence of characters (text).
        String greeting = "Hello World";
        System.out.println(greeting);




       // non-primitive types are Strings, Arrays, Classes, Interface, etc.

       // Primitive number types are divided into two groups:

       //   (1) Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals.
        // Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.

       //    (2)Floating point types represents numbers with a fractional part, containing one or more decimals.
        // There are two types: float and double.
    }

}
