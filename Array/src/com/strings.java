package com;

import java.util.Scanner;

public class strings {
    //     (vi)
//    public static void printLetters(String str){
//        for (int i = 0; i < str.length(); i++){
//            System.out.println(str.charAt(i) + " ");
//        }
//        System.out.println();
//    }

    // (viii)
    public static String subString(String str, int si, int ei){
    String subStr = "";
    for (int i = si; i < ei; i++){
        subStr += str.charAt(i);
    }
    return subStr;
}
    public static void main(String[] args) {
//        char arr[] = {'a', 'b', 'c', 'd'};
//        String str = "abcd";
//        String str2 = new String(" XYZ");
//        System.out.println(str + str2);

        // String is immutable, so its value cannot be changed.

//        Scanner sc = new Scanner(System.in);
//        String name;
        // (i)
//        name = sc.next();
        // (ii)
//        name = sc.nextLine();
//        System.out.println(name);

        // (iii)
//        String fullName = "Tony Stark";
//        System.out.println(fullName.length());

        // (iv) concatenation : Java String concatenation is an operation to join two or more strings and return a new one
//        String firstName = "Tonny";
//        String lastName = "Stark";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);

        // (v)
//        System.out.println(fullName.charAt(0));
//        System.out.println(fullName.charAt(3));
//        System.out.println(fullName.charAt(9));

        // (vi)
//        String firstName = "Tonny";
//        String lastName = "Stark";
//        String fullName = firstName + " " + lastName;
//        printLetters(fullName);

        // (vii)
//        String s1 = "Tony";
//        String s2 = "Tony";
//        String s3 = new String("Tony");

//        if (s1 == s2){
//            System.out.println("String are equal");
//        }
//        else {
//            System.out.println("String are not equal");
//        }

//        if (s1 == s3){
//            System.out.println("String are equal");
//        }
//        else {
//            System.out.println("String are not equal");
//        }

//        if (s1.equals(s3)){
//            System.out.println("String are equal");
//        }
//        else {
//            System.out.println("String are not equal");
//        }

        // (viii) SubString
        String str = "HelloWorld";
//        System.out.println(subString(str, 0, 5));
        System.out.println(str.substring(0, 5));

    }
}
