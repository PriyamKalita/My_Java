package com.company;

import java.util.*;

public class Strings {
    public static void main(String[] args) {
        //String decoration
//        String name = "Tonny";
//        String name1 = "Tonny Stark";
//        String name2 = "Hello World";

//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//
//        System.out.println("This name is : " + name);

        /*
        // Concatenation
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // CharAt
        for (int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        */

        // Compare
//        String name1 = "Hello";
//        String name2 = "Hello";

        // 1 String > String 2 = '+' Value
        // 2 String1 = String 2 = 0
        // 3 String1 < String 2 = '-' Value

//        if (name1.compareTo(name2) == 0){
//            System.out.println("Strings are equal");
//        }
//        else {
//            System.out.println("String are not equal");
//        }

//        if (name1 == name2){
//            System.out.println("Strings are equal");
//        }
//        else {
//            System.out.println("String are not equal");
//        }

//        if (new String("Tony") == new String("Tony")){
//            System.out.println("String are Equal");
//        }
//        else {
//            System.out.println("String are not Equal");
//        }

        // SubString
//        String sentence = "My Name is Tony";
//        //String name = sentence.substring(11,sentence.length());
//        //System.out.println(name);
//        System.out.println(sentence.substring(1, 3));



//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
        //StringBuilder sb = new StringBuilder(name);
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // Char at index 0
        System.out.println(sb.charAt(0));

        // Set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // Insert
        sb.insert(0, 's');
        System.out.println(sb);

        // Delete
        sb.delete(1, 3);
        System.out.println(sb);

        // Append
        sb.append("e");
        sb.append("e");
        sb.append("e");
        System.out.println(sb);

        System.out.println(sb.length());

        for (int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1- i; // 5-1-0 = > 4


            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt( back,frontChar);

        }
        System.out.println(sb);
    }
}
