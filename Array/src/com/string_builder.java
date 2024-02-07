package com;

import java.util.Scanner;

public class string_builder {

    //    (1)
//    public static String toUpperCase(String str){
//        StringBuilder sb = new StringBuilder(" ");
//
//        char ch = Character.toUpperCase(sb.charAt(0));
//        sb.append(ch);
//
//        for (int i = 1; i < str.length(); i++){
//            if (str.charAt(i) == ' ' && i < str.length()-1){
//                sb.append(str.charAt(i));
//                i++;
//                sb.append(Character.toUpperCase(str.charAt(i)));
//            }
//            else {
//                sb.append(str.charAt(i));
//            }
//        }
//        return sb.toString();
//    }

    //       (2)
//    public static String compress(String str){
//        String newStr = "";
//
//        for (int i = 0; i < str.length(); i++){
//            Integer count = 1;
//            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
//                count++;
//                i++;
//            }
//            newStr += str.charAt(i);
//
//            if (count>1){
//                newStr += count.toString();
//            }
//        }
//        return newStr;
//    }
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("");
//        for (char ch = 'a'; ch <= 'z'; ch++){    // o(26)
//            sb.append(ch);
//        }
//        System.out.println(sb);
//        System.out.println(sb.length());

        // Question No. 1 : For a given String convert each the first letter of each word to upperCase -> "hi, i am Priyam"
//        String str = "hi, i am Priyam";
//        System.out.println(toUpperCase(str));

        // Question No. 2 : String Compression "aaabbcccdd" - "a3b2c3d2"
//        String str = "aaabbcccdd";
//        System.out.println(compress(str));

        // Question No. 3 : Count how many times lowerCase vowels occurred in a String entered by the user
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        int count = 0;
//
//        for (int i = 0; i < a.length(); i++){
//            char ch = a.charAt(i);
//            if (ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
//                count++;
//            }
//        }
//        System.out.println("Count of Vowels is : " + count);


    }
}
