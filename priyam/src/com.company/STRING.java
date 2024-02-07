package com.company;

public class STRING {
    public static void main(String[] args) {

        String greeting = "Hello world";
        System.out.println(greeting);

        // string length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //toUpperCase() and toLowerCase():
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());

        //Character in a String
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));

        //String Concatenation
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String firstName1 = "John ";
        String lastName1 = "Doe";
        System.out.println(firstName1.concat(lastName1));

        //The sequence \"  inserts a double quote in a string:
        String txt3 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt3);

        //The sequence \'  inserts a single quote in a string:
        String txt4 = "It\'s alright.";
        System.out.println(txt4);

        //The sequence \\  inserts a single backslash in a string:
        String txt5 = "The character \\ is called backslash.";
        System.out.println(txt5);

        //New Line
        String txt6 = "Hello\nWorld!";
        System.out.println(txt6);

        //Carriage Return
        String txt7 = "Hello\rWorld!";
        System.out.println(txt7);

        //Tab
        String txt8 = "Hello\tWorld!";
        System.out.println(txt8);

        //Backspace
        String txt9 = "Hel\blo World!";
        System.out.println(txt9);



        String x = "10";
        String y = "20";
        String z = x + y;
        System.out.println(z);



        String x1 = "10";
        int y1 = 20;
        String z1 = x1 + y1;
        System.out.println(z1);


    }
}
