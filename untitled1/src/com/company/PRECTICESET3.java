package com.company;

public class PRECTICESET3 {
    public static void main(String[] args) {

        // Write a java program to convert a string to lowercase
        String name = "HELLO World";
//        name = name.toLowerCase();
//        System.out.println(name);
        System.out.println(name.toLowerCase());

        // Write a java program to replace spaces with underscrores
        String  text = "hello world";
        text = text.replace (" ", "" + "_");
        System.out.println(text);

        //(3) write a java program to fill in a letter template which boots like below:
        //    letter = "dear<|name|>, trans a bt"
        //    replace <|name|> with a string (some name)
        String letter = "dear <|name|> , thanks a lots! ";
        letter = letter.replace("<|name|>" , "hello world");
        System.out.println(letter);

        // Write a java program to detect double and triple spaces in a string
        String mystring =  "this string containes doubles and triple spaces";
        System.out.println(mystring.indexOf(" "));
        System.out.println(mystring.indexOf("    "));

        // Write a program to formet the following litter using escape sequenc ccharecter.
        //   letter " Dear hello world , This java program is best"
        String myletter = " Dear hello world ,\n\t This java program is best ";
        System.out.println(myletter);



    }
}


